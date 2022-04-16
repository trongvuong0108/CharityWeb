<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="<c:url value = "/resources/css/login.css"/>"
	rel="stylesheet" />
</head>
<body>
	<div class="login__card">
		<div class="login__cover">
			<img src="<c:url value = "/resources/img/login.jpg "/>" alt="" />
		</div>
		<div class="login__container">
			
			<%@ include file="/WEB-INF/component/login_header.jsp" %>
			
			<div class="login__logo">
				<img src="<c:url value = "/resources/img/logo.jpg "/>" alt="logo" />
			</div>
			
			
			
			<form:form action="login" method="post" class="login__form">
				<div class="login__input">
					<label for="email">Email</label>
					<input type="text" name="email" />
				</div>
				<div class="login__input">
					<label for="password">Mật Khẩu</label> 
					<input type="password" name="password" />
				</div>
				<button type="submit">Đăng Nhập</button>
			</form:form>
			
			
		</div>
	</div>
</body>
</html>