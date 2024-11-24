//alert("Search state you want to.......");
// search function
// const search = ()=>{
//     let query = $("#search-input").val();
//     console.log(query+"hhhhhhhhhhhhhh");
//     if(query=='')
//     {
//         $(".search-result").hide();
//     }else{
//         console.log(query);
//
//         // sending request to server
//         let url=`http://localhost:8082/search/state/${query}`;
//         fetch(url)
//         .then((response)=>{
//             return response.json();
//         }).then((data)=>{
//             console.log(data);
//             let text = `<div class='list-group'>`
//
//             data.forEach((state)=>{
//                 text += `<a href='/search/state/${state.stateName}' class='list-group-item list-group-item-action'>${state.stateName}</a>`
//             });
//
//             text +=`</div>`;
//             $(".search-result").html(text);
//             $(".search-result").show();
//
//         });
//         $(".search-result").show();
//     }
// }


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
        let url = `http://localhost:8082/search/state/${query}`;
        fetch(url).then((response) => {
            return response.json();
        }).then((data) => {

            //data
            console.log(data);
            let text = `<div class='list-group'>`

                data.forEach(state => {
                    text+=`<a href='/eyc/discover/state' style="cursor:pointer;" onclick='$("#search-input").val("${state.stateName}");' class='list-group-item list-group-action'> ${state.stateName} </a>`
                });
            text+=`</div>`;

            $(".search-result").html(text);
            $(".search-result").show();
        });
    }
};
