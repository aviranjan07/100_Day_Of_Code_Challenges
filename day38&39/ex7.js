                         // function to add to number 
// run- node ex7.js   
function add(numberOne, numberTwo){
    var sum = numberOne + numberTwo;
    console.log("numberOne is: " + numberOne,",", "numberTwo is: " + numberTwo);
    return sum;
}              
var result = add(5,6);
console.log("the sum is: " + result);