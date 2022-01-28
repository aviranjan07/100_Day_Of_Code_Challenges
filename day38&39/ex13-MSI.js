                //  put a list of question together 
// run- node ex13.js
var readlineSync = require("readline-sync");
var score = 0;
var userName = readlineSync.question("do i know your name? ");
console.log("welcome " + userName + " to do you know aviranjan ?");

//play functioon
function play(question,answer){
    var userAnswer = readlineSync.question(question);
    if(userAnswer === answer){
        console.log("right");
        score++;
    }else{
        console.log("wrong");
        score--;
    }
    console.log("current score: " + score);
    console.log("-------------");
}
// array of objects 
var questions = [{
    question: "what is my name? ",
    ans: "aviranjan"
 },{
    question: "what is my favorite movie? ",
    ans: "saanam teri kasam"
  
}]
// loops
for(var i = 0; i < questions.length; i++){
    var currentQuestions = questions[i];
    play(currentQuestions.question, currentQuestions.ans)
}

console.log("YAY ! YOU SCORED: " + score);
