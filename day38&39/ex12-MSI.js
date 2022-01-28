                // club info about a superhero together 

// run- node ex12.js
var superman = {
    name:"superman",
    power:"flight",
    costumeColor:"blue",
    strength:"10000",
    stealth:"0",
    intelligence:"100"
}
var batman = {
    name:"batman",
    power:"martial arts",
    costumeColor:"black",
    strength:"100",
    stealth:"100",
    intelligence:"1000"
}
//classWork
/*crate an array of superhero objects
then, print name and costume color of every superhero in the list 
array,for loop, objects, funtions call& */
var superheros = [superman, batman];
for(var i = 0; i < superheros.length;i++){
    var currenthero = superheros[i];
    console.log(currenthero.name);
    console.log(currenthero.costumeColor);
    console.log("-----------");
}











/*print superman strength 
print batman stren
compare superman and batman strength */
// console.log(superman.strength);
// console.log(batman.strength);
// console.log(superman.strength > batman.strength);
// // classwork
// console.log(superman.stealth);
// console.log(batman.stealth);
// console.log(superman.stealth > batman.stealth);
