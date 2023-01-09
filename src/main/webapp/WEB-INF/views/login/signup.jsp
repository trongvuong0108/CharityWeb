<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="<c:url value = "/resources/css/signup.css"/>"
	rel="stylesheet" />
</head>
<body>
	<div class="signup__card">
		<!-- <div class="signup__cover">
          <img src="../img/login.jpg" alt="" srcset="" />
        </div> -->
		<div class="signup__container">
			<div class="signup__navigation">
				<a href="#">Trang Chủ</a> 
				<a href="#">Đăng Nhập</a> 
				<a href="#">Đăng Ký</a>
			</div>
			<div class="signup__logo">
				<img src="<c:url value = "/resources/img/logo.jpg "/>" alt="logo" />
			</div>
			<form:form action="save" method="post" class="signup__form" modelAttribute="user">
				<div class="signup__input">
					<label for="email">Email</label> 
					<input type="text" name="email" />
				</div>
				<div class="signup__input">
					<label for="password">Mật Khẩu</label> 
					<input type="password" name="matkhau" />
				</div>
				<div class="signup__input">
					<label for="repassword">Nhập Lại Mật Khẩu</label> 
					<input type="password" name="repassword" />
				</div>
				<div class="signup__input">
					<label for="fullName">Họ Tên</label> 
					<input type="text"name="hoten" />
				</div>
				<div class="signup__input">
					<label for="phone">Số Điện Thoại</label> 
					<input type="number" name="phone" />
				</div>
				<div class="signup__input">
					<label for="dob">Ngày Sinh</label> 
					<input type="date" name="ngaysinh" />
				</div>
				<div class="signup__input">
					<label for="location">Địa Chỉ</label> 
					<input type="text" name="diachi" />
				</div>
				<div class="signup__sex">
					<label for="sex">Giới Tính</label>
					<div class="signup__choose">
						<div class="signup__options">
							<input type="radio" name="gioitinh" /> 
							<label for="sex">Nam</label>
						</div>
						<div class="signup__options">
							<input type="radio" name="gioitinh" /> 
							<label for="sex">Nữ</label>
						</div>
					</div>
				</div>
				<div class="signup__options">
					<input type="checkbox" name="show__password" /> 
					<label for="show__password">Hiện Mật Khẩu</label>
				</div>
				<button type="submit">Đăng Ký</button>
			</form:form>
		</div>
	</div>
</body>
</html>