let button = document.getElementById("btn");
button.addEventListener("click", function() {
let avalue = parseFloat(document.getElementById("input1").value);
let bvalue = parseFloat(document.getElementById("input2").value);
let addresult = document.getElementById("result");
let sum = avalue + bvalue;
addresult.innerHTML = "Sum of two numbers is: " + sum;
});