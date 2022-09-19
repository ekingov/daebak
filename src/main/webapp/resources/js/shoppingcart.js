
$(()=>{
    $(".shopping-cart").click(function(){
        if($(this).attr("style") == "content: url(/svg/unfilled-cart.svg);"){

        $.ajax({
            url: "#",
            type: "get",
            data: "JSON",
            async: false,
            success: function(){
                console.log("성공");
            },
            error: function(){alert('서버 에러');}
        });

        $(this).attr("style","content: url(/svg/filled-cart.svg);");

        }else if($(this).attr("style") == "content: url(/svg/filled-cart.svg);"){

        $.ajax({
            url: "#",
            type: "get",
            data: "JSON",
            success: function(){
                console.log("성공");
            },
            error: function(){alert('서버 에러');}
        });

        $(this).attr("style","content: url(/svg/unfilled-cart.svg);")
        }
    })
    
})
