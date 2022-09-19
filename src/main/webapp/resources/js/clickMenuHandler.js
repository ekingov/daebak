

$(()=>{
    $(".aside-menu-item").click(function(e){
        $(".aside-menu-item").removeClass('menu-active');
        $(this).addClass('menu-active');
    })

    // $('.aside-menu-link').click(function() {
    //     var activeTab = $(this).attr('name');
    //     $.ajax({
    //         type : 'GET',                 //get방식으로 통신
    //         url : activeTab + ".html",    //탭의 data-tab속성의 값으로 된 html파일로 통신
    //         dataType : "html",            //html형식으로 값 읽기
    //         error : function() {          //통신 실패시
    //             alert('통신실패!');
    //         },
    //         success : function(data) {    //통신 성공시 탭 내용담는 div를 읽어들인 값으로 채운다.
    //             $('#board-container').html(data);
    //         }
    //     });
    // });
});