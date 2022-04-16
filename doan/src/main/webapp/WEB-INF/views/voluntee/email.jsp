
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
				<a href="/doan/news?id=${param.id}">Trở Về</a>
			</div>
			<form:form action="saveEmail?id_post=${param.id}" method="post"
				class="signup__form" modelAttribute="thongtin">
				<div class="signup__input">
					<label for="email">Email</label> <input type="text" name="email" />
				</div>
				<button id="signup__volumtee" type="submit">Đăng Ký</button>
			</form:form>
		</div>
	</div>
</body>
</html>