                        // function to check the answer
// run- node ex8.js
var readlineSync = require("readline-sync");
var score = 0;
function paly(question, answer){
    var userAnswer = readlineSync.question(question);

    if(userAnswer === answer){
        console.log("you are right");
        score++;
    }else{
        console.log("you are wrong");
        score--;
    }
}
paly("am i play football? ", "yes");
paly("am i  play crecket? ", "yes");
paly("am i  watch movie? ", "yes");

console.log("your total score is: ", score);
