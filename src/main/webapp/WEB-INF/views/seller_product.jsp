<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>gogi seller product</title>
    <script src="https://kit.fontawesome.com/a8031502e9.js" crossorigin="anonymous"></script>



    <style type="text/css">
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }


        .wrapper {
            margin: 0 auto;
            width: 80%;

        }

        h1 {
            margin: 20px 0;
            border-bottom: 1px solid gray;

        }


        .search-form {

            display: flex;
            justify-content: center;

            width: 30vw;

            height: 40px;
        }

        .content_button {
            display: flex;
            justify-content: right;
            margin: 20px 0px;
        }

        .content_button button {

            margin-left: 10px;
            padding: 10px;
            font-weight: bold;

        }

        .content_button button:nth-child(1) {
            color: blue;
            background-color: skyblue;
            border: 1px solid blue;
        }

        .content_button button:nth-child(1):hover {
            color: white;
            background-color: blue;
            border: 1px solid blue;
        }

        .content_button button:nth-child(2) {
            color: red;
            background-color: pink;
            border: 1px solid red;
        }

        .content_button button:nth-child(2):hover {
            color: white;
            background-color: red;
            border: 1px solid red;
        }



        .search-form input[type='search'] {
            /* flex: 1; */
            margin-right: 10px;

            border: 1px solid black;
            border-radius: 0.3em;
            ;
            font-size: 1em;
        }

        .search-form input[type='submit'] {
            width: 4em;
            border: 1px solid black;
            border-radius: 0.3em;
            ;
            font-size: 1em;
            background: rgba(255, 208, 208, 0.589);
        }

        .search-form input[type='submit']:active {
            background: rgb(247, 107, 107);
        }

        thead {
            background-color: gray;
            color: white;

        }

        tbody tr:hover {
            background-color: lightgray;

        }

        .tg {
            margin: 0 auto;
            width: 100%;
            border-collapse: collapse;
            border-spacing: 0;

        }

        .tg td {
            border-color: gray;
            border-style: solid;
            border-width: 2px;
            font-family: Arial, sans-serif;
            font-size: 14px;
            overflow: hidden;
            padding: 10px 5px;
            word-break: normal;
        }

        .tg th {
            border-color: gray;
            border-style: solid;
            border-width: 2px;
            font-family: Arial, sans-serif;
            font-size: 14px;
            font-weight: normal;
            overflow: hidden;
            padding: 10px 5px;
            word-break: normal;
        }

        .tg .tg-0pky {
            border-color: inherit;
            text-align: center;
            vertical-align: middle;
        }


        .indexer {
            float: right;
            justify-self: center;
        }

        .pager {
            display: flex;
            justify-self: center;
            align-items: center;
        }

        .-list- {
            margin-bottom: 0px;
            padding-left: 0px;

            display: flex;
            list-style: none;

        }

        .-list- a {
            text-decoration: none;
            color: black;
        }
    </style>
    <link rel="stylesheet" href="resources/css/header_footer.css">

</head>

<body>
    <header>
        <div class="logo">LOGO</div>
        <div class="logo_admin">판매자 어드민</div>
        <div class="nav_container">
            <ul class="nav_menu">
                <li class="menu_button">
                    <a href="">Overview</a>
                </li>
                <li class="menu_button">
                    <a href="">가게 정보</a>
                </li>
                <li class="menu_button">
                    <a href="">상품 관리</a>
                </li>
                <li class="menu_button">
                    <a href="">주문 관리</a>
                </li>
                <li class="menu_button">
                    <a href="">정산 관리</a>
                </li>
                <li class="menu_button">
                    <a href="">리뷰 관리</a>
                </li>
            </ul>
        </div>
        <div id="nav_sub">
            <a href="" class="sub_menu">회원정보 수정</a>
        </div>
    </header>

    <div class="wrapper">
        <h1>상품 관리</h1>

        <form class="search-form header-item" action="">
            <input type="search">
            <input type="submit" value="찾기">
        </form>

        <div class="content_button">
            <button>+ 상품 추가</button>
            <button>- 상품 삭제</button>
        </div>

        <table class="tg">
            <thead>
                <tr>
                    <th class="tg-0pky">번호</th>
                    <th class="tg-0pky">원산지</th>
                    <th class="tg-0pky">단위</th>
                    <th class="tg-0pky">카테고리</th>
                    <th class="tg-0pky">부위</th>
                    <th class="tg-0pky">상품명</th>
                    <th class="tg-0pky">판매가</th>
                    <th class="tg-0pky">수정</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="product" items="${list}">
                    <tr>
                        <td>${product.productNum}</td>
                        <td>${product.origin}</td>
                        <td>${product.unit}</td>
                        <td>${product.meatType}</td>
                        <td>${product.meatPart}</td>
                        <td>${product.productName}</td>
                        <td>${product.productPrice}</td>
                        <td><button type="button" onclick="location.href='/seller_product/${product.productNum};'">수정</button></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <div class="indexer">
            <div><span class="">${pageMaker.cri.currPage}</span> / ${pageMaker.realEndPage} pages</div>
        </div>

        <div class="pager">
            <c:if test="${pageMaker.prev}">
                <span class="btn btn-prev"><a href="/seller_product?currPage=${pageMaker.startPage - 1}">이전</a></span>
            </c:if>

            <ul class="-list-">
                <c:forEach var="pageNum" begin="${pageMaker.startPage}" end="${pageMaker.endPage}">
                    <li class=${pageMaker.cri.currPage==pageNum ? 'currPage' : '' }><a class="-text-"
                            href="/seller_product?currPage=${pageNum}">${pageNum}</a></li>
                </c:forEach>
            </ul>


            <c:if test="${pageMaker.next}">
                <span class="btn btn-next"><a href="/seller_product?currPage=${pageMaker.endPage + 1}">다음</a></span>
            </c:if>

        </div>
    </div>
    <footer>
        <div>Copyrightⓒ gogi. All Right Reserved.</div>
        <div>주문관련 문의 <br>
            - 전화번호: 4561-7726 <br>
            - 이메일: shop_cs@gogi.kr
        </div>
        <div>정산문의 <br>
            - 전화번호: 4561-7726 <br>
            - 이메일: shop_cs@gogi.kr
        </div>
    </footer>
</body>

</html>