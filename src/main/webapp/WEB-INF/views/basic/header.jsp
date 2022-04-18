<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<link rel="stylesheet" href="/resources/css/main.css" type="text/css">
	<link rel="stylesheet" href="/resources/css/libs.min.css" type="text/css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com">    
    <link href="https://fonts.googleapis.com/css2?family=Marcellus&display=swap" rel="stylesheet">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
</head>
<body>
	<header class="page-header">
	    <div class="page-header__inner">
	        <div class="page-header__sidebar">
	            <div class="page-header__menu-btn"><button class="menu-btn ico_menu is-active"></button></div>
	            <div class="page-header__logo"><a href="/"><img src="/resources/imgs/logo.png" alt="logo" id="header_logo"></a></div>
	        </div>
	        <div class="page-header__content">
	            <div class="page-header__search">
	                <div class="search">
	                    <div class="search__input"><i class="ico_search"></i><input type="search" name="search" placeholder="Search"></div>
	                </div>
	            </div>
	            <div class="page-header__action">
	            	<a class="profile" href="/profile/profile.do"><img src="/resources/imgs/profile_icon/5.png" alt="profile"></a>
	            	<ul id="profile_dropdown">
	            		<li class="profile_dropdown_list"><a href="#">내 전적</a></li>
	            		<li class="profile_dropdown_list"><a href="#">회원정보</a></li>
	            		<li class="profile_dropdown_list"><a href="#">고객센터</a></li>
	            		<li class="profile_dropdown_list"><a href="#">로그아웃</a></li>
	            	</ul>
	            </div>
	        </div>
	    </div>
	</header>
    <aside class="sidebar is-show">
        <div class="sidebar-box">
            <ul class="uk-nav">
                <li class="uk-active"><a href="/board_list/board_list.do"><i class="ico_home"></i><span>구인게시판</span></a></li>

                <li><a href="/chat/chat.do"><i class="ico_chats"></i><span>채팅</span></a></li>

                <li><a href="/shop/shop.do"><i class="ico_store"></i><span>포인트샵</span></a></li>
                
                <li><a href="/record/record.do"><i class="ico_profile"></i><span>전적검색</span></a></li>
            </ul>
            <div class="uk-nav">
            </div>
        </div>
    </aside>  
    
    <script src="/resources/js/lib.js"></script>
    <script src="/resources/js/main.js"></script>
</body>
</html>