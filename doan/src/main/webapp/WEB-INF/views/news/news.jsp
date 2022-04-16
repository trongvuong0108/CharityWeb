
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="<c:url value = "/resources/css/news.css"/>" rel="stylesheet" />
</head>
<body>
	<%@ include file="/WEB-INF/component/header.jsp" %>
	<div class="news__container">
		<img src="<c:url value = "/resources/img/cover-01-2.jpg"/>" alt="">
		<p class="news__date">Ngày Đăng: 08/08/0808</p>
		<p class="news__date__start">Đợt Hiến Máu: ${baidang.dothienmau.ngaybd} - ${baidang.dothienmau.ngaykt}</p>
		<p class="news__date__start">Nơi Hiến Máu: ${baidang.diadiem.diachi}</p>
		<p class="news__content">${baidang.noidung}</p>
		<button class="news__register"><a href="dangki/dienEmail?id=${baidang.id}">Đăng kí</a></button>
	</div>
</body>
</html>