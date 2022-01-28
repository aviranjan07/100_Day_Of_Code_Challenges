                      // do it all together 

// run- node ex4.js
var readlineSync = require("readline-sync");
var userName = readlineSync.question("give me your name? ");
var welcomeMessage = "welcome " + userName;
console.log(welcomeMessage);