<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>
<div class="header__container">
	<a class="header__logo" href="/doan"> <img
		src="<c:url value = "/resources/img/logo.jpg "/>" alt="" />
	</a>
	<div class="header__navigation">
		<c:choose>
			<c:when test="${name == 'anonymousUser'}">
				<a href="<c:url value= "/login"/>">Đăng nhập/ Đăng Ký</a>
			</c:when>
			
			<c:otherwise>
				<a href="changeInfo?username=${name}">Hello,${name}</a>
				<div></div>
				<a href="<c:url value= "/logout"/>">Đăng xuất</a>
			</c:otherwise>
		</c:choose>

		<a href="/doan">Trang Chủ</a>

	</div>
</div>