            //    welCome your user 
 
// run- node ex3.js            
var readlineSync = require("readline-sync");
var userName = readlineSync.question("may i have your name ? ");
console.log(userName);
var welcomeMessage = "welcome " + userName;
console.log(welcomeMessage);