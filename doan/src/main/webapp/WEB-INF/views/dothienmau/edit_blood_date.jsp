<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="<c:url value = "/resources/css/address_info.css"/>"
	rel="stylesheet" />
</head>
<body>
	<div class="signup__card">
		<div class="signup__container">
			<div class="signup__navigation">
				<a href="#">Trở Về</a>
			</div>
			<form:form action="save" method="post" class="signup__form" modelAttribute="dothienmau">
				<div class="signup__input">
					<label for="email">Ngày Bắt Đầu</label> 
					<input type="date" name="ngaybd" />
				</div>
				<div class="signup__input">
					<label for="fullName">Ngày Kết Thúc</label> 
					<input type="date" name="ngaykt" />
				</div>
				<div class="signup__input">
					<label for="phone">Nội Dung</label> 
					<input type="text" name="noidung" />
				</div>
				<div>
					<button id="signup__volumtee" type="submit">Thêm</button>
					<button id="signup__volumtee" type="submit">Cập Nhật</button>
					<button id="signup__volumtee" type="submit">Xóa</button>
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>