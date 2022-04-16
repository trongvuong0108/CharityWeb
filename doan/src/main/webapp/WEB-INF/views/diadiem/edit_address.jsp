<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Home</title>
<link href="<c:url value = "/resources/css/address_info.css"/>"
	rel="stylesheet" />
</head>
<body>
	<div class="signup__card">
		<div class="signup__container">
			<div class="signup__navigation">
				<a href="/doan/admin/diadiem">Trở Về</a>
			</div>
			<form:form action="saveEdit?id=${diadiem.id}" method="post" class="signup__form" modelAttribute = "diadiem">
				<div class="signup__input">
					<label for="diachi">Địa chỉ</label> 
					<form:input type="text" name="diachi" path="diachi"/>
				</div>
				<div class="signup__input">
					<label for="chuy">Chú ý</label> 
					<form:input type="text" name="chuy" path="chuy" />
				</div>
				<div class="signup__input">
					<label for="ten">Tên</label> 
					<form:input type="text" name="ten" path ="ten" />
				</div>
				<div>
					<button id="signup__volumtee" type="submit">Cập Nhật</button>
				</div>
			</form:form>
		</div>
	</div>
</body>

</html>