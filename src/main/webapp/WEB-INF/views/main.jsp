<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>gogi</title>


    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">


    <link rel="stylesheet" href="resources/css/basic.css">
    <link rel="stylesheet" href="resources/css/home.css">
    <link rel="stylesheet" href="resources/css/basicMedia.css">
    <link rel="stylesheet" href="resources/css/homeMedia.css">

    <style>
        
    </style>
</head>


<body>
    
    <div class="page">
        <!-- header -->
        <div class="header">
            
            <h1 class="website-logo header-item"><img src="/resources/img/logo2.png" width="500px"></h1>

            <form class="search-form header-item" action="">
                <input type="search">
                <input type="submit" value="검색">
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
                    <a href="/notice/list" class="header-menu-link">고객센터</a>
                </li>
            </ul>
        </div>
        <!-- nav -->
        <div class="nav">
            <ul class="menu">
                <li class="menu-item">
                    <a href="/marketPrice/select" class="menu-link" >시세</a>
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
                <div class="main-left-container">
                    <div class="main-left-container-item">
                        <div class="content">
                            여기다가는 글을 적을 거요
                        </div> 
                    </div>
                <form class="main-search-form main-left-container-item" action="">
                    <input type="search" placeholder="">
                    <?xml version="1.0" encoding="iso-8859-1"?>
                    <!-- Generator: Adobe Illustrator 19.0.0, SVG Export Plug-In . SVG Version: 6.00 Build 0)  -->
                    <svg class="search-icon" width="2rem" version="1.1" id="Capa_1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" x="0px" y="0px"
                        viewBox="0 0 487.95 487.95" style="enable-background:new 0 0 487.95 487.95;" xml:space="preserve">
                        <g>
                            <g>
                                <path d="M481.8,453l-140-140.1c27.6-33.1,44.2-75.4,44.2-121.6C386,85.9,299.5,0.2,193.1,0.2S0,86,0,191.4s86.5,191.1,192.9,191.1
                                c45.2,0,86.8-15.5,119.8-41.4l140.5,140.5c8.2,8.2,20.4,8.2,28.6,0C490,473.4,490,461.2,481.8,453z M41,191.4
                                c0-82.8,68.2-150.1,151.9-150.1s151.9,67.3,151.9,150.1s-68.2,150.1-151.9,150.1S41,274.1,41,191.4z"/>
                            </g>
                        </g>
                    </svg>
                </form>

                <div class="hashtag-container main-left-container-item">
                    <div class="hashtag"> 해쉬태그</div>
                    <div class="hashtag"> 해쉬태그</div>
                    <div class="hashtag"> 해쉬태그</div>
                    <div class="hashtag"> 해쉬태그</div>
                </div>
                </div>

                <div id="carouselExampleControls" class="carousel slide" data-bs-ride="carousel">
                        <div class="carousel-inner">
                        <div class="carousel-item active">
                            <div class="overlay-image d-block w-100" style="background-image: url(resources/img/cache_b638c94d-b28f-4f68-cf8f-8c3a503df572.png); width: 500px; height: 300px;"></div>
                        </div>
                        <div class="carousel-item">
                            <div class="overlay-image d-block w-100" style="background-image: url(resources/img/cache_b638c94d-b28f-4f68-cf8f-8c3a503df572.png); width: 500px; height: 300px;"></div>
                        </div>
                        <div class="carousel-item">
                            <div class="overlay-image d-block w-100" style="background-image: url(resources/img/cache_b638c94d-b28f-4f68-cf8f-8c3a503df572.png); width: 500px; height: 300px;"></div>
                        </div>
                        </div>
                        <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="prev">
                        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                        <span class="visually-hidden">Previous</span>
                        </button>
                        <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="next">
                        <span class="carousel-control-next-icon" aria-hidden="true"></span>
                        <span class="visually-hidden">Next</span>
                        </button>
                </div>
            </div>
        </div>

        <div class="menu-helper"> 
            <div class="menu-helper-container">
                <ul class="helper-button-container">
                    <li class="helper-button"> 
                            <a href="#"> 
                                <?xml version="1.0" encoding="iso-8859-1"?>
                                <!-- Generator: Adobe Illustrator 19.0.0, SVG Export Plug-In . SVG Version: 6.00 Build 0)  -->
                                <svg width="70px" version="1.1" id="Capa_1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" x="0px" y="0px"
                                     viewBox="0 0 55 65" style="enable-background:new 0 0 55 55" xml:space="preserve">
                                     
                                <rect x="0.5" y="50" style="fill:#546A79;" width="54" height="5"/>
                                <path style="fill:#38454F;" d="M51.5,50h-48v-3c3.866,0,7-3.134,7-7h34c0,3.866,3.134,7,7,7V50z"/>
                                <rect x="23.5" y="36" style="fill:#F29C1F;" width="8" height="4"/>
                                <path style="fill:#F0C419;" d="M10.5,36V24c0-9.35,7.65-17,17-17h0c9.35,0,17,7.65,17,17v12H10.5z"/>
                                <path style="fill:#EDE71B;" d="M14.5,25c-0.553,0-1-0.448-1-1c0-7.72,6.28-14,14-14c0.553,0,1,0.448,1,1s-0.447,1-1,1
                                    c-6.617,0-12,5.383-12,12C15.5,24.552,15.053,25,14.5,25z"/>
                                <polygon style="fill:#BDC3C7;" points="32.5,0 22.5,0 22.5,2 26.5,2 26.5,7 28.5,7 28.5,2 32.5,2 "/>
                                <g>                          
                                </svg>
                                
                            땡처리 
                        </a> 
                    </li>
                    <li class="helper-button"> 
                            <a href="#">
                                <?xml version="1.0" encoding="iso-8859-1"?>
                                <!-- Generator: Adobe Illustrator 19.0.0, SVG Export Plug-In . SVG Version: 6.00 Build 0)  -->
                                <svg width="70px" version="1.1" id="Layer_1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" x="0px" y="0px"
                                     viewBox="0 0 511.999 511.999" style="enable-background:new 0 0 511.999 511.999;" xml:space="preserve">
                                <rect x="10.199" y="67.458" style="fill:#FFE6B8;" width="377.075" height="377.075"/>
                                <path style="fill:#D35B38;" d="M496.297,89.587L484.91,78.199c-7.337-7.337-19.234-7.337-26.571,0l-35.302,35.302l37.959,37.959
                                    l35.302-35.302C503.636,108.82,503.636,96.924,496.297,89.587z"/>
                                <polygon style="fill:#FFAD61;" points="423.036,113.501 197.559,338.979 178.579,395.918 235.518,376.938 460.996,151.46 "/>
                                <g>
                                    <path style="fill:#4D3D36;" d="M397.473,124.639V67.463c0-5.632-4.567-10.199-10.199-10.199H10.199C4.566,57.263,0,61.831,0,67.463
                                        v377.074c0,5.632,4.566,10.199,10.199,10.199h377.075c5.632,0,10.199-4.567,10.199-10.199l-0.004-215.126l106.04-106.041
                                        c5.475-5.475,8.49-12.755,8.49-20.498s-3.015-15.022-8.49-20.496l-11.386-11.388c-5.475-5.475-12.755-8.49-20.498-8.49
                                        s-15.022,3.015-20.498,8.49L397.473,124.639z M230.008,368.024l-35.304,11.767l11.768-35.304l216.563-216.563l23.536,23.536
                                        L230.008,368.024z M377.075,434.337H20.398V77.663h356.676v67.376L190.347,331.766c-1.12,1.12-1.963,2.486-2.464,3.987
                                        l-18.98,56.939c-1.222,3.665-0.268,7.705,2.464,10.437c1.944,1.944,4.551,2.987,7.214,2.987c1.079,0,2.167-0.171,3.224-0.523
                                        l56.939-18.979c1.502-0.501,2.867-1.344,3.987-2.464l134.344-134.344V434.337z M489.085,108.945l-28.09,28.091l-11.768-11.768
                                        L437.46,113.5l28.091-28.091c1.623-1.623,3.779-2.516,6.074-2.516s4.451,0.893,6.074,2.515l11.387,11.388
                                        c0,0.001,0,0.001,0.001,0.001c1.622,1.623,2.515,3.779,2.515,6.073C491.602,105.166,490.708,107.323,489.085,108.945z"/>
                                    <path style="fill:#4D3D36;" d="M308.401,141.408h9.724c5.632,0,10.199-4.567,10.199-10.199s-4.567-10.199-10.199-10.199h-9.724
                                        c-5.632,0-10.199,4.567-10.199,10.199S302.768,141.408,308.401,141.408z"/>
                                    <path style="fill:#4D3D36;" d="M78.267,141.408h185.837c5.632,0,10.199-4.567,10.199-10.199s-4.567-10.199-10.199-10.199H78.267
                                        c-5.633,0-10.199,4.567-10.199,10.199S72.634,141.408,78.267,141.408z"/>
                                    <path style="fill:#4D3D36;" d="M78.267,200.833h176.113c5.632,0,10.199-4.567,10.199-10.199c0-5.632-4.567-10.199-10.199-10.199
                                        H78.267c-5.633,0-10.199,4.567-10.199,10.199C68.067,196.265,72.634,200.833,78.267,200.833z"/>
                                    <path style="fill:#4D3D36;" d="M78.267,260.257h112.367c5.633,0,10.199-4.567,10.199-10.199s-4.566-10.199-10.199-10.199H78.267
                                        c-5.633,0-10.199,4.567-10.199,10.199S72.634,260.257,78.267,260.257z"/>
                                    <path style="fill:#4D3D36;" d="M142.014,298.202H78.267c-5.633,0-10.199,4.567-10.199,10.199c0,5.632,4.566,10.199,10.199,10.199
                                        h63.746c5.633,0,10.199-4.567,10.199-10.199C152.212,302.769,147.647,298.202,142.014,298.202z"/>
                                </g>
                                </svg>
                                
                            입점신청
                        </a> 
                    </li>
                    <li class="helper-button">
                        <a href="">
                            <?xml version="1.0" encoding="iso-8859-1"?>
                            <!-- Generator: Adobe Illustrator 19.0.0, SVG Export Plug-In . SVG Version: 6.00 Build 0)  -->
                            <svg version="1.1" id="Layer_1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" x="0px" y="0px"
                            viewBox="0 0 471.836 471.836" style="enable-background:new 0 0 471.836 471.836;" xml:space="preserve">
                            <circle style="fill:#F2BE3E;" cx="235.918" cy="235.918" r="235.918"/>
                            <polygon style="fill:#F2EF8F;" points="388.047,357.188 127.833,398.741 94.285,193.224 354.498,151.672 "/>
                            <g>

                                <rect x="128.465" y="216.567" transform="matrix(-0.9875 0.1578 -0.1578 -0.9875 494.8586 406.8546)" style="fill:#988534;" width="205.627" height="13.01"/>

                                <rect x="134.327" y="248.674" transform="matrix(-0.9875 0.1577 -0.1577 -0.9875 511.55 469.7617)" style="fill:#988534;" width="205.624" height="13.003"/>

                                <rect x="139.693" y="282.815" transform="matrix(-0.9875 0.1577 -0.1577 -0.9875 527.6082 536.7776)" style="fill:#988534;" width="205.631" height="13.01"/>
                                <polygon style="fill:#988534;" points="259.274,327.116 147.332,345.001 145.266,332.156 257.212,314.27 	"/>
                            </g>
                            <g>
                                <polygon style="fill:#7D8880;" points="225.104,201.572 219.069,163.983 231.824,163.983 225.617,201.572 	"/>
                                <polygon style="fill:#F06668;" points="197.348,72.384 199.514,76.119 213.269,88.672 206.41,138.943 209.045,161.902 
                                218.871,167.477 237.523,167.934 251.207,159.975 242.257,145.513 237.171,90.741 237.433,83.254 249.669,75.793 251.162,71.98 	
                                "/>
                                <path style="fill:#E84849;" d="M248.019,164.787c-4.572,3.027-10.174,4.992-16.292,5.658l-2.058,0.176
                                c-0.236,0.019-0.464,0.052-0.7,0.052l-1.89,0.056c-3.753-0.019-7.379-0.513-10.72-1.493c-12.524-3.633-21.549-13.351-21.717-24.879
                                c-0.086-6.466,3.308-7.809,9.672-11.977l7.431-43.064c-6.028-2.043-10.802-8.947-13.246-14.196
                                c8.254,6.881,17.957,8.52,24.89,8.587c0.236,1.74,0.883,6.687,0.909,7.416c4.426,0.015,8.093-0.636,10.642-1.336l0.007-0.026
                                l1.216-7.607c5.422-1.392,10.174-3.633,13.497-6.357c-1.998,4.501-5.28,9.946-9.47,11.966c0,0,5.339,30.581,7.465,43.393
                                c6.881,3.948,12.584,5.616,12.685,12.295C260.475,152.043,255.63,159.751,248.019,164.787z M235.072,91.138
                                c-2.623,0.7-6.309,1.343-10.754,1.325l-0.296,58.993c1.916,0.172,3.847,0.239,5.736,0.086c4.015-0.337,7.633-1.5,10.6-3.3
                                L235.072,91.138z M248.681,160.686l-7.903-11.139c-3.102,1.815-6.806,2.986-10.907,3.33c-1.983,0.168-4.007,0.079-6.028-0.101
                                l-5.729,12.561l-0.041,0.094c3.094,0.606,6.357,0.913,9.744,0.868c7.936-0.116,15.195-2.14,20.834-5.422L248.681,160.686z
                                M227.346,82.259c-6.941,0.509-20.041-0.116-29.998-9.875c-0.651-1.25-1.055-2.552-1.07-3.914
                                c-0.019-1.474,0.378-2.904,1.096-4.269c3.356-6.238,14.002-10.889,26.686-11.076c12.685-0.168,23.453,4.198,26.971,10.331
                                c0.778,1.343,1.205,2.765,1.231,4.243c0.019,1.482-0.37,2.919-1.104,4.284c-0.079,0.228-0.187,0.505-0.281,0.745
                                C246.709,77.653,237.22,81.54,227.346,82.259z"/>
                            </g>
                            </svg>
                            공지사항
                        </a>   
                    </li>
                </ul> 
            </div>    
        </div>

        <div class="footer">footer 부분</div>
    </div>

    
    <script src="resources/js/home.js"></script>

    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.5/dist/umd/popper.min.js" integrity="sha384-Xe+8cL9oJa6tN/veChSP7q+mnSPaj5Bcu9mPX5F5xIGE0DVittaqT5lorf0EI7Vk" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.min.js" integrity="sha384-ODmDIVzN+pFdexxHEHFBQH3/9/vQ9uori45z4JjnFsRydbmQbmL5t1tQ0culUzyK" crossorigin="anonymous"></script>

</body>

</html>