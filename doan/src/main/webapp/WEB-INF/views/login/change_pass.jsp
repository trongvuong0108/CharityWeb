<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"  isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="<c:url value = "/resources/css/change_pass.css"/>"
	rel="stylesheet" />
</head>
<body>
	<div class="header__container">
		<a class="header__logo" href="#"> <img src="<c:url value = "/resources/img/logo.jpg "/>"
			alt="" />
		</a>
		<div class="header__navigation">
			<a href="#">Hello word</a> <a href="#">Các Bài Viết</a> <a href="#">Đăng
				nhập/ Đăng Ký</a>
		</div>
	</div>
	<div class="signup__card">
		<div class="signup__container">
			<div class="signup__navigation">
				<a href="#">Trở Về</a>
			</div>
			<form:form action="savePassword?username=${param.username}" method="post" class="signup__form" modelAttribute = "user">
				<div class="signup__input">
					<label for="email">Email</label> 
					<input type="text" name="email" />
				</div>
				<div class="signup__input">
					<label for="password">Mật Khẩu</label> 
					<input type="password"  />
				</div>
				
				<div class="signup__input">
					<label for="newPassword">Mật Khẩu Mới</label> 
					<input type="password" name="matkhau" />
				</div>
				
				<div class="signup__input">
					<label for="repassword">Nhập Lại Mật Khẩu mới</label> 
					<input type="password"  />
				</div>
				<div class="signup__options">
					<input type="checkbox" name="show__password" /> 
					<label for="show__password">Hiện Mật Khẩu</label>
				</div>
				<button type="submit">Lưu</button>
			</form:form>
		</div>
	</div>
</body>
</html>