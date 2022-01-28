            //print the final score of the game 
// run - node ex15.js
var readlineSync = require("readline-sync");
var score = 0;
var userName = readlineSync.question("do i know your name? ");
console.log("welcome " + userName + " to do you know aviranjan ");

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
    question: "what is my bestfriend name? ",
    ans: "aviranjan"
 },{
    question: "what is my favorite movie? ",
    ans: "saanam teri kasam"
 },{
   question: "my laptop brand? ",
   ans: "msi"   
 },{
   question: "my phone brand? ",
   ans:"realme"
 }
]
// loops
for(var i = 0; i < questions.length; i++){
    var currentQuestions = questions[i];
    play(currentQuestions.question, currentQuestions.ans)
}

console.log("YAY ! YOU SCORED: " + score);
