
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="<c:url value = "/resources/css/signup_voluntee.css"/>"
	rel="stylesheet" />
</head>
<body>
	<%@ include file="/WEB-INF/component/header.jsp" %>
	
	<div class="signup__card">
		<div class="signup__container">
			<div class="signup__navigation">
				<a href="/doan/news?id=${param.id_post}">Trở Về</a>
				<div>Đăng kí thông tin</div>
			</div>
			<!-- <div class="signup__logo"><img src="../img/logo.jpg" alt="logo" /></div> -->
			<form:form action="savedontHasInfo?id_post=${param.id_post}" method="post" class="signup__form" modelAttribute = "thongtin">
				<div class="signup__input">
					<label for="email">Email</label>
					<input type="text" name="email" value="${param.username}" readonly/>
				</div>
				<div class="signup__input">
					<label for="ten">Họ Tên</label> 
					<input type="text" name="ten" />
				</div>
				<div class="signup__input">
					<label for="phone">Số điện thoại</label> 
					<input type="text" name="phone" />
				</div>
				<div class="signup__input">
					<label for="ngaysinh">Ngày Sinh</label> 
					<input type="Date" name="ngaysinh" />
				</div>
				<div class="signup__input">
					<label for="diachi">Địa Chỉ</label> 
					<input type="text" name="diachi" />
				</div>
				<div class="signup__input">
					<label for="sokg">Cân Nặng</label> 
					<input type="number" name="sokg" />
				</div>
				<div class="signup__sex">
					<label for="gioitinh">Giới Tính</label>
					<div class="signup__choose">
						<div class="signup__options">
							<input type="radio" name="gioitinh" /> <label for="gioitinh">Nam</label>
						</div>
						<div class="signup__options">
							<input type="radio" name="gioitinh" /> <label for="gioitinh">Nữ</label>
						</div>
					</div>
				</div>
				<button id="signup__volumtee" type="submit">Đăng Ký</button>
			</form:form>
		</div>
	</div>
</body>
</html>