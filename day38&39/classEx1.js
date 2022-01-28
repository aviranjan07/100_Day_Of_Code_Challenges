                  // increment Score

// run- node classEx1.js
var readlineSync = require("readline-sync");
var score = 0; 

//question 1
var questionOne = "Am i older then 20? "; 
var userAnswerOne = "yes";
var userAnswer = readlineSync.question(questionOne);

if(userAnswer === userAnswerOne){
    console.log("you are right");
    score++;
}else{
    console.log("you are wrong");
    score--;
}

var questionTwo = "Am i from city kolkata? "; 
var userAnswerTwo = "yes";
var userAnswer = readlineSync.question(questionTwo);


if(userAnswer == userAnswerTwo){
    console.log("you are right");
    score++;
}else{
    console.log("you are wrong");
    score--;
}
console.log("your total score is " + score);
