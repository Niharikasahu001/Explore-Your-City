// Update-profile
//alert("Search anything you want to.......");
//function readURL(input){
//    if(input.files && input.files[0]){
//        var reader = new FileReader();
//        reader.onload = function(e){
//            $('#imgPreview').attr('src', e.target.result).width(100).height(100);
//        }
//        reader.readAsDataURL(input.files[0])
//    }
//}
// $('#userImage').change(function()){
//     readURL(this);
// };
// $(".form-control").on("change",function(){
//     var fileName = $(this).val().split("\\").pop();
//     $(this).siblings(".form-label").addClass("selected").html(fileName);
// });
//
// submit
//
//var form = document.getElementById("myForm");
//
//        // Add an event listener to the form
//        form.addEventListener("keypress", function(event) {
//            // Check if the pressed key is Enter (key code 13)
//            if (event.keyCode === 13) {
//                // Prevent the default behavior of the Enter key (preventing form submission)
//                event.preventDefault();
//
//                // Trigger the form submission
//                form.submit();
//            }
//        });

const search = () => {
    console.log("Searching.....");
//    var university = [[${university}]];
    let query = $("#search-input").val();

    if(query=='')
    {
        $(".search-result").hide();
    }
    else
    {
        console.log(query);

        //sending request to server
        let url = `http://localhost:8082/search/${query}`;
        fetch(url).then((response) => {
            return response.json();
        }).then((data) => {

            //data
            console.log(data);
            let text = `<div class='list-group'>`

                data.forEach(university => {
                    text+=`<a id="option" style="cursor:pointer;" onclick='$("#search-input").val("${university.name}"); $(".search-result").hide();' class='list-group-item list-group-action'> ${university.name} </a>`
                });
            text+=`</div>`;

            $(".search-result").html(text);
            $(".search-result").show();

            const filteredList = data.filter((u1) => u1.name == $("#search-input").val());

            var row='';

                    filteredList.forEach((ins,i) =>
                    {
                        $("#search-input").val('');
                        row +=  `<div class="university-details">
                                 <img src="../img/institutes/` + ins.image + `" alt="image">
                                 <div class="university-info">
                                 <h2>`+ ins.name +`</h2>
                                 <p> Affilated By: `+ ins.university.name + `</p>
                                 <p>` + ins.address +`,  ` + ins.city +`,  `+ ins.state + `</p>
                                 </div>
                                 </div>
                                 <hr/>`;
                    })

                    $("#institutes").html(row);
            var query = $("#search-input").val();
            if(query=='')
            {
                $(".search-result").hide();
            }
        });
    }
};






























