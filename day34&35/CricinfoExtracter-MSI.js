// the purpose of this project is to extract information of worldcup 2019 from cricinfo 
// and present that in the form of excel and pdf scorecards 
//the real purpose is to learn how to extract information and get experience with js

// npm init-y 
// npm install minimist 
// npm install axios 
// npm install jsdom 
// npm install excel4node 
// npm install pdf-lib 

// run-- node CricinfoExtracter.js --excel=Worldcup.csv --dataDir=Worldcup --source="https://www.espncricinfo.com/series/icc-cricket-world-cup-2019-1144415/match-results"

let minimist = require("minimist");
let axios = require("axios");
let jsdom = require("jsdom");
let excel4node = require("excel4node"); //edit
let pdf = require("pdf-lib");
let fs = require("fs");
let path = require("path");


let args = minimist(process.argv);

// download using axios 
let promise = axios.get(args.source);
promise.then(function(response){
  let html = response.data;
   // read using jsdom
  let dom = new jsdom.JSDOM(html);
  let document = dom.window.document;
  
  // let's find out all matches block 
  let matches = [];
  let matchDivs = document.querySelectorAll("div.match-score-block");
  
   for(let i = 0; i < matchDivs.length; i++){
   let matchDiv = matchDivs[i];
     let match = {
     t1: "",
     t2: "",
     t1s: "",
     t2s: "",
     result: ""
  };
   // let's find out team1 and team2
  let teamName = matchDiv.querySelectorAll("p.name");
  match.t1 = teamName[0].textContent;
  match.t2 = teamName[1].textContent;

//  let's find out score detial 
  let scoredetial = matchDiv.querySelectorAll("div.score-detail > span.score");
  if(scoredetial.length == 2){
      match.t1s = scoredetial[0].textContent;
      match.t2s = scoredetial[1].textContent;
  }else if(scoredetial.length == 1){
      match.t1s = scoredetial[0].textContent;
      match.t2s = "";
  }else{
      match.t1s = "";
      match.t2s = "";
  }
   
  // let's findout match- result 
  let matchResult = matchDiv.querySelector("div.status-text > span");
  match.result = matchResult.textContent;
    
       matches.push(match);
   }

   //first ctare a file where all the matches will be 
   let matchesJSON = JSON.stringify(matches); // JSON.stringify-- convert jso to json
   fs.writeFileSync("matches.json", matchesJSON ,"utf-8");
   
   
   //  then , crate specific team file , inside there will be their matches 

    //team loops
    for (let i = 0; i < matches.length; i++){
      putTeamInTeamsArrayIfMissing(teams,matches[i]);
     } 
   //console.log(matches);
      //  inside team loops 
   for(let i = 0; i < matches.length; i++){
    putMatchInAppropriateTeam(teams,matches[i]);
   }
   // crate teams file 
   let teamsJSON = JSON.stringify(teams); // JSON.stringify-- convert jso to json
   fs.writeFileSync("teams.json", teamsJSON ,"utf-8");
 // make excel using excel4node
   prepareExcel (teams, args.excel);
   // make pdf using pdf-lib
   // make folder 
   prepareFolderAndPdfs(teams, args.dataDir);
   })
   function prepareFolderAndPdfs(teams, dataDir){
     if(fs.existsSync(dataDir) == true){ 
       fs.rmdirSync(dataDir,{recursive: true}); 
     }
     fs.mkdirSync(dataDir); 
     for(let i = 0; i < teams.length; i++){
       let teamFolderName = path.join(dataDir,teams[i].name);
         fs.mkdirSync(teamFolderName);
        for(let j = 0; j < teams[i].matches.length; j++){ 
            let match = teams[i].matches[j]; 

             //  crate pdf score card 
            crateMatchScoreCardPdf(teamFolderName,teams[i].name,match);
         // first crate template.pdf
        }
   }
  }
  function crateMatchScoreCardPdf(teamFolderName, homeTeam, match){
    let matchFileName = path.join(teamFolderName,match.vs);
    
     let templateFileBytes = fs.readFileSync("template.pdf");
     let pdfKaPromise = pdf.PDFDocument.load(templateFileBytes);
      pdfKaPromise.then(function(pdfdoc){
        //  write inside pdf 
        let page = pdfdoc.getPage(0);
        page.drawText(homeTeam,{
           x: 320,
           y:532,
           size:16
        })
        page.drawText(match.vs,{
          x: 320,
          y:510,
           size:16
       })
       page.drawText(match.selfScore,{
        x: 320,
        y:483,
        size:16
     })
     page.drawText(match.oppScore,{
      x: 320,
      y:462,
      size:16
   })
   page.drawText(match.result,{
    x: 320,
    y:437,
    size:16
 })

       let changeByteskaPromise = pdfdoc.save();
       changeByteskaPromise.then(function(changeBytes){
         if(fs.existsSync(matchFileName + ".pdf") == true){ // ==
           fs.writeFileSync(matchFileName + "1.pdf", changeBytes);
         }else{
           fs.writeFileSync(matchFileName + ".pdf", changeBytes);
         }
       })
     })

 }

   function prepareExcel(teams, excelFileName){
      let wb = new excel4node.Workbook(); //edit

      for(let i = 0; i < teams.length; i++){
        let tSheet = wb.addWorksheet(teams[i].name);

        //write excel file
        tSheet.cell(1,1).string("vs");
        tSheet.cell(1,2).string("Self Score");
        tSheet.cell(1,3).string("Opp Score");
        tSheet.cell(1,4).string("Result");

      //  loop for all matches 
       for(let j = 0; j < teams[i].matches.length; j++){
        tSheet.cell(2 + j , 1).string(teams[i].matches[j].vs);
        tSheet.cell(2 + j , 2).string(teams[i].matches[j].selfScore);
        tSheet.cell(2 + j , 3).string(teams[i].matches[j].oppScore);
        tSheet.cell(2 + j , 4).string(teams[i].matches[j].result);
       }

      }
      wb.write(excelFileName);
    }
    let teams = [];
   function putTeamInTeamsArrayIfMissing(teams,match){
     let t1idx = -1;
     for(let i = 0; i < teams.length; i++){
       if(teams[i].name == match.t1){
         t1idx = i;
         break;
       }
     }
     if(t1idx == -1){
       teams.push({
         name: match.t1,
         matches: []
       });
     }
     let t2idx = -1;
     for(let i = 0; i < teams.length; i++){
       if(teams[i].name == match.t2){
         t1idx = i;
         break;
       }
     }
     if(t1idx == -1){
      teams.push({
        name: match.t2,
        matches: []
      });
    }
   }
  function putMatchInAppropriateTeam(teams, match){
    let t1idx = -1;
    for(let i = 0; i < teams.length; i++){
      if(teams[i].name == match.t1){
        t1idx = i;
        break;
      }
    }
    let team1 =teams[t1idx];
    team1.matches.push({
      vs:match.t2,
      selfScore: match.t1s,
      oppScore: match.t2s,
      result:match.result
    });
    let t2idx = -1;
     for(let i = 0; i < teams.length; i++){
       if(teams[i].name == match.t2){
         t1idx = i;
         break;
       }
     }




     
    let team2 =teams[t1idx];
    team2.matches.push({
      vs:match.t1,
      selfScore: match.t2s,
      oppScore: match.t1s,
      result:match.result
    });
  }
 