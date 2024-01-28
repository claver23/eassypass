
//$(document).ready(function() => {
//    alert("crispy alert button");
//
//});

window.addEventListener("scroll", function(){
    var header = document.querySelector("header");
    header.classList.toggle("abajo",window.scrollY>0);
});

function buttonTest(){
    alert("crispy alert button");
    console.log("god damn that log is hot");
}

