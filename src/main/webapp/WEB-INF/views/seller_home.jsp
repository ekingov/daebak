<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>gogi seller page</title>
    <script src="https://kit.fontawesome.com/a8031502e9.js" crossorigin="anonymous"></script>


    <style>

        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }


        .wrapper {
            height: 100vh;
            margin: 0 auto;
            display: flex;
            flex-direction: column;
            justify-content: space-between;

        }



        #body_div {
            margin: 0 auto;
            display: flex;
            flex-direction: column;

            
            width: 90%;


        }


        #bodyitem_top {

            display: flex;
            justify-content: space-around;
            align-items: center;


            background-color: #ebeef5;
            padding: 50px 0;
            border: 1px solid #ebeef5;
            box-shadow: 0 2px 12px 0 rgb(0 0 0 / 50%);
            border-radius: 4px;

        }

        .item_title {


            font-weight: bold;
            font-size: large;
            margin-bottom: 10px;

        }


        .sell_status {
            text-align: center;
            width: 130px;
            display: inline-block;
            box-shadow: 0 2px 12px 0 rgb(0 0 0 / 20%);

        }

        .sell_num{
            border: 1px solid black;
            padding: 20px;
            font-size: 30px;
            border-radius: 5px 5px 0 0 ;
            color: #409EFF;
        }

        .sell_text{
            border: 1px solid black;
            background-color: rgba(0, 0, 0, 0.363);
            padding: 10px;
            font-weight: bold;
            color: white;


        }

        #bodyitem_bottom {
            display: flex;
            justify-content: space-between;

            flex-grow: 1;
            margin-top: 60px;
            

        }

        .bottom_item {
            display: flex;
            flex-direction: column;
            border: 1px solid black;
            background-color: #ebeef5;
            padding: 20px;
            border: 1px solid #ebeef5;
            box-shadow: 0 2px 12px 0 rgb(0 0 0 / 50%);
            border-radius: 10px;
            width: 45%;

        }

        .admin_notice, .admin_review {
            list-style: none;
        }
    </style>
    <link rel="stylesheet" href="/resources/css/header_footer.css">

</head>

<body>
    <div class="wrapper">
        <header>
            <div class="logo"><img src="/resources/img/logo2.png" width="300px"></div>
            <div class="logo_admin">????????? ?????????</div>
            <div class="nav_container">
                <ul class="nav_menu">
                    <li class="menu_button">
                        <a href="">Overview</a>
                    </li>
                    <li class="menu_button">
                        <a href="">?????? ??????</a>
                    </li>
                    <li class="menu_button">
                        <a href="/seller_product">?????? ??????</a>
                    </li>
                    <li class="menu_button">
                        <a href="">?????? ??????</a>
                    </li>
                    <li class="menu_button">
                        <a href="">?????? ??????</a>
                    </li>
                    <li class="menu_button">
                        <a href="">?????? ??????</a>
                    </li>
                </ul>
            </div>
            <div id="nav_sub">
                    <a href="" class="sub_menu">???????????? ??????</a>
            </div>
        </header>

        <main>
        <div id="body_div">
            <div id="bodyitem_top">
                <div class="item_title"><i class="fa-solid fa-cart-shopping"></i> ?????? ??????</div>
                <div class="sell_status">
                    <div class="sell_num">10</div>
                    <div class="sell_text">????????? ??????</div>
                </div>
                <div class="sell_status">
                    <div class="sell_num">10</div>
                    <div class="sell_text">????????????</div>
                </div>
                <div class="sell_status">
                    <div class="sell_num">1</div>
                    <div class="sell_text">?????? ??????</div>
                </div>
                <div class="sell_status">
                    <div class="sell_num">10</div>
                    <div class="sell_text">????????? ??????</div>
                </div>
            </div>
            <div id="bodyitem_bottom">
                <div class="bottom_item">
                    <div class="item_title"><i class="fa-solid fa-check"></i> ????????? ????????????</div>
                     <div>
                        <ul>
                            <li class="admin_notice">1</li>
                            <li class="admin_notice">2</li>
                            <li class="admin_notice">3</li>
                            <li class="admin_notice">4</li>
                            <li class="admin_notice">5</li>
                        </ul>
                     </div>
                </div>
                <div class="bottom_item">
                    <div class="item_title"><i class="fa-solid fa-pen"></i> ?????? ??????</div>
                    <div>
                        <ul>
                            <li class="admin_review">1</li>
                            <li class="admin_review">2</li>
                            <li class="admin_review">3</li>
                            <li class="admin_review">4</li>
                            <li class="admin_review">5</li>
                        </ul>
                    </div>
                </div>
            </div>

        </div>
        </main>

        <footer>
            <div>Copyright??? gogi. All Right Reserved.</div>
            <div>???????????? ?????? <br>
                - ????????????: 4561-7726 <br>
                - ?????????: shop_cs@gogi.kr
            </div>
            <div>???????????? <br>
                - ????????????: 4561-7726 <br>
                - ?????????: shop_cs@gogi.kr
            </div>
        </footer>
    </div>

</body>

</html>