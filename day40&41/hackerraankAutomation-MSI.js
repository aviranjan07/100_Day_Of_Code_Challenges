// run- node hackerraankAutomation.js --url=https://www.hackerrank.com --config=config.json

// first install all part then run 
// npm init 
// npm install minimist
// npm install puppeteer

let minimist = require("minimist");
let fs = require("fs");
let puppeteer = require("puppeteer");

let args = minimist(process.argv);

let configJSON = fs.readFileSync(args.config, "utf-8");
let configJSO = JSON.parse(configJSON);

async function run(){
   //start the browser 
   let browser = await puppeteer.launch({
      headless: false,
      args: [
          '--start-maximized' 
      ],
      defaultViewport: null
   });
     //get the tabs(there is only one tab)
   let pages = await browser.pages();
   let page = pages[0];

    //open the url
   await page.goto(args.url);

   //wait and then click on login
   await page.waitForSelector("li#menu-item-2887");
   await page.click("li#menu-item-2887");
   
   //wait and then click on login on page2
   await page.waitForSelector("a.fl-button[href='https://www.hackerrank.com/login'");
   await page.click("a.fl-button[href='https://www.hackerrank.com/login'");
    
   //type userid
   await page.waitForSelector("input[name='username']");
   await page.type("input[name='username']", configJSO.userid, {delay: 60});
   
   //type password
   await page.waitForSelector("input[name='password']");
   await page.type("input[name='password']", configJSO.password, {delay:60});
   
   //press click on page 3
   await page.waitForSelector("button[data-analytics='LoginPassword']");
   await page.click("button[data-analytics='LoginPassword']");
    
   //click on compete
   await page.waitForSelector("a[data-analytics='NavBarContests']");
   await page.click("a[data-analytics='NavBarContests']");
    
   //click on mannage contest
   await page.waitForSelector("a[href='/administration/contests/'");
   await page.click("a[href='/administration/contests/'");

   //click on mannage challenge
   await page.waitForSelector("a[href='/administration/challenges']");
   await page.click("a[href='/administration/challenges']");

//    find number of pages 
await page.waitForSelector("a[data-attr1='Last']");
let numPages = await page.$eval("a[data-attr1='Last']", function (atag) {
    let totPages = parseInt(atag.getAttribute("data-page"));
    return totPages;
});

for (let i = 1; i <= numPages; i++) {
    await handleAllSelectorOfPage(page, browser);

    if (i != numPages) {
        await page.waitForSelector("a[data-attr1='Right']");
        await page.click("a[data-attr1='Right']");

        browser.close();
        console.log("brower close"); 
     }
  }
}

   async function handleAllSelectorOfPage(page, browser){
// find all urls of same page
await page.waitForSelector("a.backbone.block-center");
let curls = await page.$$eval("a.backbone.block-center", function (atags) {
    let urls = [];

    for (let i = 0; i < atags.length; i++) {
        let url = atags[i].getAttribute("href");
        urls.push(url);
    }

    return urls;
});

for (let i = 0; i < curls.length; i++) {
    let ctab = await browser.newPage();
    await saveModaretorInContest(ctab, args.url + curls[i], configJSO.moderators);
    await ctab.close();
    await page.waitFor(3000);
  }
}

async function saveModaretorInContest(ctab, fullCurl, modaretors){
    await ctab.bringToFront();
    await ctab.goto(fullCurl);
    await ctab.waitFor(2000);

  
    //click on modaretors tab
    await ctab.waitForSelector("li[data-tab='moderators']");
    await ctab.click("li[data-tab='moderators']");

    //type in modaretor
    await ctab.waitForSelector("input#moderator");
    await ctab.type("input#moderator", modaretors, { delay: 50 });

    //press enter
    await ctab.keyboard.press("Enter");

}
       
run();
