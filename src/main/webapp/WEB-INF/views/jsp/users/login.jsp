<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>login</title>
        <link rel="stylesheet" href="resources/css/common/reset.css" />
        <link rel="stylesheet" href="resources/css/login/login.css" />
        <script defer src="resources/js/main/main.js"></script>
    </head>
    <body>
        <div> <%@ include file="/resources/components/header/headerV2.jsp" %></div>
        <div class="hd__inner400 login-container">
            <!-- 로그인 타이틀 -->
            <section class="login-title">
                <h1>로그인</h1>
            </section>

            <!-- 로그인 입력 받기 -->
            <section class="login-input">
                <form action="#" method="post">
                    <div class="email">
                        <input type="email" placeholder="아이디(이메일)" />
                    </div>
                    <div class="password">
                        <input type="password" placeholder="비밀번호" />
                        <img
                            class="password-invisible"
                            src="resources/assets/images/password-invisible.png"
                        />
                    </div>
                    <button type="submit" class="login-btn">로그인하기</button>
                </form>
            </section>

            <!-- 소셜 로그인 -->
            <section class="social-login">
                <h2>SNS 계정으로 로그인하기</h2>
                <div class="social-icon">
                    <button class="kakao">
                        <img
                            src="https://noticon-static.tammolo.com/dgggcrkxq/image/upload/v1611574965/noticon/iqg1rfbdbeaufcptuqgf.png"
                        />
                    </button>
                    <button class="naver">
                        <img
                            src="https://noticon-static.tammolo.com/dgggcrkxq/image/upload/v1644169460/noticon/frvhykszxhjz4asz77oi.png"
                        />
                    </button>
                    <button class="google">
                        <img src="resources/assets/images/google-logo.png" />
                    </button>
                    <button class="apple">
                        <img src="resources/assets/images/apple-logo.png" />
                    </button>
                </div>
                <a href="#"
                    ><button class="signup-btn">간편 회원가입하기</button></a
                >
                <div class="user-support">
                    <a href="#">계정 찾기</a>
                    <a href="#">비밀번호 찾기</a>
                    <a href="#">문의하기</a>
                </div>
            </section>
        </div>
        <div><%@ include file="/resources/components/footer/footerV2.jsp" %></div>
    </body>
</html>
