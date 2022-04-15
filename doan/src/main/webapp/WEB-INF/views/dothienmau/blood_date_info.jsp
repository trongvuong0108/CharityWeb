<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="<c:url value = "/resources/css/address_info.css"/>" rel="stylesheet" />
</head>
<body>
	<div class="signup__card">
		<div class="signup__container">
			<div class="signup__navigation">
				<a href="#">Trở Về</a>
			</div>
			<form:form action="saveEdit?id=${dothienmau.id}" method="post" class="signup__form" modelAttribute="dothienmau">
				<div class="signup__input">
					<label for="email">Ngày Bắt Đầu</label> 
					<form:input type="date" name="ngaybd" path= "ngaybd" />
				</div>
				<div class="signup__input">
					<label for="fullName">Ngày Kết Thúc</label> 
					<form:input type="date" name="ngaykt" path= "ngaykt" />
				</div>
				<div class="signup__input">
					<label for="phone">Nội Dung</label> 
					<form:input type="text" name="noidung" path="noidung" />
				</div>
				<div>
					<button id="signup__volumtee" type="submit">Cập Nhật</button>		
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>