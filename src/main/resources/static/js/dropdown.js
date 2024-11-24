//alert("Enabled JS")
$(document).ready(function() {
         $("#filter-state").on('change', function () {
             alert($(this).val());
             var stateCode = $(this).val();
             var s = '<option value=' + -1 + '>SELECT</option>';
             if(stateCode!=-1)
             {
                $.ajax({
                    url : 'getStates/'+stateCode,
                    //data : {"stateCode" : stateCode},
                    success: function(result){
                        var result = JSON.parse(result);
                        for(var i=0; i<result.length; i++)
                        {
                            s += '<option value="' +result[i][0].cityId + '">' + result[i][0].cityName+ '</option>';
                        }
                        $('#filter-city').html(s);
                    }
                });
             }
             //reset data 
             //$('#filter-state').html(s);
             //$('#filter-city').html(s);

         });


});




