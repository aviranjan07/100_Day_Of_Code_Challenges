                    // print right/wrong , if greater then 25 

// run- node ex5.js
var readlineSync = require("readline-sync");
var userAnswerAge = readlineSync.question("Am i older then 25? ");
console.log("you entered " + userAnswerAge);
if(userAnswerAge == "yes"){
    console.log("you are right");
}else{
    console.log("you are wrong");
}
