<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="ko">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    
    <script defer src="<c:url value='resources/js/myPage/myPage-main.js'/>"></script>
    <title>마이페이지 사이드바</title>
  </head>
  <body>
    <nav class="mypage-menu">
      <ul>
        <li class="myProfile menu-section">
          <span class="title"> <b>My Profile</b></span>
          <br />
          <ul class="list">
            <li class="item">
              <a href="../../html/mypage/mypage.html">MyProfile</a>
            </li>

            <li class="item" id="myPage_Visit">
              <a href="../../html/mypage/mypage.html">방문 일정</a>
            </li>

            <li class="item" id="myPage_Reservation">
              <a href="../../html/mypage/reservationList.html"> 예약 현황</a>
            </li>
            <br />
            <li class="item">
              <a href="../../html/mypage/likeList.html">My Like</a>
            </li>

            <li class="item">
              <a href="../../html/mypage/myPayment.html">결제 내역</a>
            </li>

            <li class="item">
              <a href="../../html/mypage/estimateStorage.html">견적함</a>
            </li>
          </ul>
        </li>
        <li class="menu-section">
          <span class="title"><b>설정</b></span>
          <ul class="list">
            <li class="item"><a href="#">계정 설정</a></li>
            <li class="item"><a href="#">시스템 설정</a></li>
          </ul>
        </li>
      </ul>
    </nav>
  </body>
</html>