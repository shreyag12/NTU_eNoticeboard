/**
 * 
 */
function myFunction() {
    var x = document.getElementById("myDIV");
    if (x.style.display === "none") {
        x.style.display = "block";
    } else {
        x.style.display = "none";
    }
}

        function show() {
            //document.getElementById("dThreshold").display ="block";
            document.getElementById("dThreshold").style.display = "block";
        }

        function readURL(input) {

            if (input.files && input.files[0]) {
                var reader = new FileReader();

                reader.onload = function (e) {
                    document.getElementById('myimg').setAttribute('src',e.target.result);
                }

                reader.readAsDataURL(input.files[0]);
            }
        }


        document.getElementById('imgSel').onchange = function () { //set up a common class
            readURL(this);
        };
        function myFun() {
            alert("Saved Successfully");
        }
        function myFunction() {
            document.getElementById("myForm").reset();
        }
