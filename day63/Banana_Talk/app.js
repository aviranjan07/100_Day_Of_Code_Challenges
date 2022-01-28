var btnTranslate = document.querySelector("#translate-btn");
var textInput = document.querySelector("#translate-input");
var outputDiv = document.querySelector("translate-output");

var serverURL = "https://api.funtranslations.com/translate/yoda.json"


function getTransletionURl(text){
    return serverURL + "?" + "text" + text;
}

function errorHandler(error){
    console.log("error occured", error);
    alert("somthing Wrong With Server: Try Again After Some Time");
}

function clickHandler (){
    var inputText = textInput.value; // taking input

    // calling server for processing 
    fetch(getTransletionURl(inputText))
    .then(Response => Response.json())
    .then(json => {
        var translatetedText = json.contents.translated;
        outputDiv.innerText = translatetedText;
    })
    .catch(errorHandler);
};

btnTranslate.addEventListener("click", clickHandler)
