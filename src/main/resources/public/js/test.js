function loginCheck() {
    var x, y;

    // Get the value of the input field with id
    x = document.getElementById("email").value;
    y = document.getElementById("psw").value;

    if (x.length===0 || y.length===0) {
        alert("email and password cannot be empty");
    } else {
        alert("success!");
    }
}    


function registerCheck() {
    var x, y, z, n;

    // Get the value of the input field with id="numb"
    x = document.getElementById("first").value;
    y = document.getElementById("last").value;
    z = document.getElementById("email").value;
    n = document.getElementById("psw").value;
  
    if (x.length===0 || y.length===0 || z.length===0 || n.length===0) {
        alert("inputs cannot be empty!");
    } else {
        alert("success!");
    }
}    