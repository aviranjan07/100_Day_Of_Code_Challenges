const navToggle = document.querySelector(".nav-toggle");
const links = document.querySelector(".links");

navToggle.addEventListener("click", function(){
    // method 1
    // if(links.classList.contains("show-links")) {
    //     links.classList.remove("show-links");
    // }else {
    //     links.classList.add("show-links");
    // }

    // method 2 
    links.classList.toggle("show-links");
});