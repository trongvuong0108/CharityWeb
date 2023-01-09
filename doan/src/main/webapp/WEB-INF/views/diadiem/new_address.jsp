<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
				<a href="#">Trở Về</a>
			</div>
			<form:form action="save" method="post" class="signup__form" modelAttribute = "diadiem">
				<div class="signup__input">
					<label for="email">Địa chỉ</label> 
					<input type="text" name="diachi" />
				</div>
				<div class="signup__input">
					<label for="phone">Chú ý</label> 
					<input type="text" name="chuy" />
				</div>
				<div class="signup__input">
					<label for="fullName">Tên</label> 
					<input type="text" name="ten" />
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