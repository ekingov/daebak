<!DOCTYPE html>
<html lang="ko">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>get</title>

    <link rel="shortcut icon" href="/resources/favicon.ico" type="image/x-icon">
    <link rel="icon" href="/resources/favicon.ico" type="image/x-icon">


    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-migrate/3.4.0/jquery-migrate.min.js"></script>

    <script>
        $(function () {
            console.clear();

            $('#listBtn').on('click', function () {
                self.location.href = "/notice/list";
            }); // .onclick

        }) 

        $(function () {
            console.clear();

            $('#modifyBtn').on('click', () => {
                self.location.href = "/notice/modify?noticeNum=${notice.noticeNum}";
            }); // .onclick

        }) 
    </script>


    <style>
        #container {
            width: 1024px;
            margin: 0 auto;
        }
        
        #modifyBtn {
            width: 90px;
            height: 30px;

            font-size: 14px;
            font-weight: bold;
            font-family: D2Coding;

            color: wheat;
            background-color: blueviolet;

            cursor: pointer;
        }

        #listBtn {
            width: 90px;
            height: 30px;

            font-size: 14px;
            font-weight: bold;
            font-family: D2Coding;

            color: wheat;
            background-color: blueviolet;

            cursor: pointer;
        }
    </style>

</head>

<body>
    <h1>/WEB-INF/views/Notice/getNotice.jsp</h1>
    <hr>

        <div id="container">
        <form action="#">
            <table>
                <caption>게시글 번호 : ${notice.noticeNum}</caption>

                <tr>
                    <td><label for="title">제목</label></td>
                    <td><input type="text" id="title" name="title" size="50" value="${notice.title}" readonly></td>
                </tr>

                <tr>
                    <td><label for="content">내용</label></td>
                    <td><textarea name="content" id="content" cols="52" rows="10" readonly>${notice.content}</textarea></td>
                </tr>

                <tr>
                    <td><label for="writer">작성자</label></td>
                    <td><input type="text" id="writer" name="writer" size="20" value="관리자" readonly></td>
                </tr>

                <tr>
                    <td colspan="2">&nbsp;</td>
                </tr>

                <tr>
                    <td colspan="2">
                        <button type="button" id="modifyBtn">MODIFY</button>
                        <button type="button" id="listBtn">LIST</button>
                    </td>
                </tr>
            </table>
        </form>
    </div>
</body>

</html>