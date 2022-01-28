                  // increment score if the right answer 

// run - node ex6.js
var readlineSync = require("readline-sync");
var userAnswerAge = readlineSync.question("Am i older then 25? ");
var score = 0;
if(userAnswerAge == "yes"){
    console.log("you are right");
    score++;
    
}else{
    console.log("you are wrong");
    score--;
}
console.log("your total score is " + score);