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

function getXml(){
    $.ajax({
         url : "/about",
         type : "get",
         success : function(result) {
           branch = result.getElementsByTagName("Movie");
           $("div.about").append(
               '<p>Name:'+branch[0].childNodes[0].firstChild.nodeValue+'</p>'+
               '<p>Catetory:'+branch[0].childNodes[1].firstChild.nodeValue+'</p>'+
               '<p>Year:'+branch[0].childNodes[2].firstChild.nodeValue+'</p>'+
               '<p>Country:'+branch[0].childNodes[3].firstChild.nodeValue+'</p>'+
               '<p>Director:'+branch[0].childNodes[4].firstChild.nodeValue+'</p>'+
               '<p>LeadingActor:'+branch[0].childNodes[5].firstChild.nodeValue+'</p>'+
               '<p>Duration:'+branch[0].childNodes[6].firstChild.nodeValue+'</p>'+
               '<p>Cost:'+branch[0].childNodes[7].firstChild.nodeValue+'</p>'+
               '<p>Profit:'+branch[0].childNodes[8].firstChild.nodeValue+'</p>'+
               '<p>Awards:'+branch[0].childNodes[9].firstChild.nodeValue+'</p>'
             );
           }
         });
       }   