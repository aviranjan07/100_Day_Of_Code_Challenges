// run- node classEx2.js

// odd a number 
function odd(numberOne, numberTwo){
 console.log("numberOne is: " + numberOne , ",", "numberTwo is: " + numberTwo);
    var odd = numberOne - numberTwo;
    return odd;
}
var result = odd(23,12);
console.log("the odd is " + result);

// divide a number 
function devide(numberOne, numberTwo){
    console.log("numberOne is: " + numberOne , ",", "numberTwo is: " + numberTwo);
       var devide = numberOne / numberTwo;
       return devide;
   }
   var result = devide(100,5);
   console.log("the quotient is " + result);
   
   
// multiple a number 
function multiple(numberOne, numberTwo){
    console.log("numberOne is: " + numberOne , ",", "numberTwo is: " + numberTwo);
       var multiple = numberOne * numberTwo;
       return multiple;
   }
   var result = multiple(100,5);
   console.log("the multiplication is " + result);
   