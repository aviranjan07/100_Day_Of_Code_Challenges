                //    read the name of user 

// run- node ex2.js 
var readlineSync = require("readline-sync")                ;
var userName = readlineSync.question("What's your name?");
console.log(userName);