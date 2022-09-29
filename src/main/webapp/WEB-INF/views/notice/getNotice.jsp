<!DOCTYPE html>
<html lang="ko">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>new</title>

    <link rel="shortcut icon" href="/resources/favicon.ico" type="image/x-icon">
    <link rel="icon" href="/resources/favicon.ico" type="image/x-icon">


    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-migrate/3.4.0/jquery-migrate.min.js"></script>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">

    <link rel="stylesheet" href="/resources/css/basic.css">
    <link rel="stylesheet" href="/resources/css/basicMedia.css">
    <link rel="stylesheet" href="/resources/css/notice.css">


    <script>
        $(function () {
            console.clear();

            $('#listBtn').on('click', function () {
                self.location.href = "/notice/list";
            }); // .onclick

        }) 
    </script>


</head>

<body>
    <div class="page">
        <!-- header -->
        <div class="header">
            
            <h1 class="website-logo header-item">로고자리</h1>

            <form class="search-form header-item" action="">
                <input type="search">
                <input type="submit" value="찾기">
            </form>

            <ul class="header-menu header-item">
                <li class="header-menu-item">
                    <a href="" class="header-menu-link"> <svg class="header-menu-icon" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 60 60" style="enable-background:new 0 0 60 60" xml:space="preserve"> <path d="m11.68 13-.833-5h-2.99C7.411 6.28 5.859 5 4 5 1.794 5 0 6.794 0 9s1.794 4 4 4c1.859 0 3.411-1.28 3.858-3h1.294l.5 3h-.038l5.171 26.016c-2.465.188-4.518 2.086-4.76 4.474A5.013 5.013 0 0 0 15 49h2c0 3.309 2.691 6 6 6s6-2.691 6-6h11c0 3.309 2.691 6 6 6s6-2.691 6-6h4a1 1 0 1 0 0-2h-4.35c-.826-2.327-3.043-4-5.65-4s-4.824 1.673-5.65 4h-11.7c-.826-2.327-3.043-4-5.65-4s-4.824 1.673-5.65 4H15a3.01 3.01 0 0 1-2.224-.993 2.968 2.968 0 0 1-.761-2.316c.152-1.509 1.546-2.69 3.173-2.69h39.824A4.994 4.994 0 0 0 60 36.013V13H11.68zM4 11c-1.103 0-2-.897-2-2s.897-2 2-2 2 .897 2 2-.897 2-2 2zm42 34c2.206 0 4 1.794 4 4s-1.794 4-4 4-4-1.794-4-4 1.794-4 4-4zm-23 0c2.206 0 4 1.794 4 4s-1.794 4-4 4-4-1.794-4-4 1.794-4 4-4zm35-8.987A2.99 2.99 0 0 1 55.013 39H16.821l-4.77-24H58v21.013z"/></svg> <span>장바구니</span></a>
                </li>
                <li class="header-menu-item">|</li>
                <li class="header-menu-item">
                    <a href="" class="header-menu-link">로그인</a>
                </li>
                <li class="header-menu-item">|</li>
                <li class="header-menu-item">
                    <a href="" class="header-menu-link"> 
                        <svg class="header-menu-icon" viewBox="0 0 15 15" fill="none" xmlns="http://www.w3.org/2000/svg">
                        <path
                          fill-rule="evenodd"
                          clip-rule="evenodd"
                          d="M7.5 0.875C5.49797 0.875 3.875 2.49797 3.875 4.5C3.875 6.15288 4.98124 7.54738 6.49373 7.98351C5.2997 8.12901 4.27557 8.55134 3.50407 9.31167C2.52216 10.2794 2.02502 11.72 2.02502 13.5999C2.02502 13.8623 2.23769 14.0749 2.50002 14.0749C2.76236 14.0749 2.97502 13.8623 2.97502 13.5999C2.97502 11.8799 3.42786 10.7206 4.17091 9.9883C4.91536 9.25463 6.02674 8.87499 7.49995 8.87499C8.97317 8.87499 10.0846 9.25463 10.8291 9.98831C11.5721 10.7206 12.025 11.8799 12.025 13.5999C12.025 13.8623 12.2376 14.0749 12.5 14.0749C12.7623 14.075 12.975 13.8623 12.975 13.6C12.975 11.72 12.4778 10.2794 11.4959 9.31166C10.7244 8.55135 9.70025 8.12903 8.50625 7.98352C10.0187 7.5474 11.125 6.15289 11.125 4.5C11.125 2.49797 9.50203 0.875 7.5 0.875ZM4.825 4.5C4.825 3.02264 6.02264 1.825 7.5 1.825C8.97736 1.825 10.175 3.02264 10.175 4.5C10.175 5.97736 8.97736 7.175 7.5 7.175C6.02264 7.175 4.825 5.97736 4.825 4.5Z"
                          fill="currentColor"
                        />
                      </svg>
                      <span>마이페이지</span></a>
                </li>
                <li class="header-menu-item">|</li>
                <li class="header-menu-item">
                    <a href="" class="header-menu-link">고객센터</a>
                </li>
            </ul>
        </div>
        <!-- nav -->
        <div class="nav">
            <ul class="menu">
                <li class="menu-item">
                    <a href="" class="menu-link" >시세</a>
                </li>
                <li class="menu-item">
                    <a href="" class="menu-link">MAP</a>
                </li>
                <li class="menu-item">
                    <a href="" class="menu-link">고기위키</a>
                </li>
                <li class="menu-item">
                    <a href="" class="menu-link">요리스타그램</a>
                </li>
            </ul>
        </div>
        
        <div class="main">
            <div class="main-container">

                <div class="aside-bar">
                    <ul class="aside-menu-title">
                        <li class="aside-menu-title-item"><p>고객센터</p></li>
                    </ul>
                    <ul class="aside-menu">
                        <li class="aside-menu-item-selected">
                            <p class="aside-menu-link" style="margin-bottom: 0;">공지사항</p>
                        </li>
                        <li class="aside-menu-item">
                            <a href="/qna/list" class="aside-menu-link">QnA</a>
                        </li>
                        <li class="aside-menu-item">
                            <a href="faq.html" class="aside-menu-link">FAQ</a>
                        </li>
                    </ul>
                </div>

    <div id="write_container">
        <h2 class="notice-name">공지사항</h2>
        <br>
        <div  class="registerForm">
            <form action="/notice/register" method="post">
                <table>
                    <tr>
                        <td><label for="title">제목</label></td>
                        <td><input type="text" id="title" name="title" size="63" value="${notice.title}" readonly></td>
                    </tr>
            
                    <tr>
                        <td><label for="content">내용</label></td>
                        <td><textarea name="content" id="content" cols="65" rows="10" readonly>${notice.content}</textarea></td>
                    </tr>
            
                    <tr>
                        <td><label for="writer">작성자</label></td>
                        <td>
                            관리자
                            </form>
                        </td>
                    </tr>
            
                    <tr>
                        <td colspan="2">&nbsp;</td>
                    </tr>
            
                    <tr>
                        <td colspan="2" style="text-align: right;">
                            <button type="button" id="listBtn">목록</button>
                        </td>
                    </tr>
                </table>
            </form>
        </div>
    </div>

</body>

</html>