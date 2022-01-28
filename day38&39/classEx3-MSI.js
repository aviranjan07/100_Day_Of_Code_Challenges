/*run a loops and print a sun of two numbers 
first numbers brings always 22
second number bring the current value of loop
run it 10 times
print shoud be 
22
23
24
25
26
27
ect.. */

// run- node classEx3.js 

// var a = 12;
// var b = 10;
// for(var i = 1; i < 5; i++){
//     console.log(a + b);
// }

var a = 0;
var b = 12;
console.log(a + b);
for(var i = 1; i < 5; i++){
    b = (a + b) + 1;
}