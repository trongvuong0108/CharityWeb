<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Home</title>
<link href="<c:url value = "/resources/css/home.css"/>" rel="stylesheet" />
</head>

<body>
	<div class="header__container">
		<a class="header__logo" href="#"> <img
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

			<a href="#">Các Bài Viết</a>

		</div>
	</div>

	<div class="find__toolbar">
		<div>
			<label for="date-post">Ngày Đăng</label> <input type="date"
				name="date-post" />
		</div>
		<div>
			<label for="owner">Người Đăng</label> <input type="text" name="owner" />
		</div>
		<button>Tìm Kiếm</button>
	</div>

	<div class="home__list__news">
		<div class="homoe__pagination">
			<button>Trước</button>
			<span>1/10</span>
			<button>Sau</button>
		</div>
		<div class="home__news">
			<c:forEach items="${listPost}" var="post">
				<img src="<c:url value = "/resources/img/login.jpg "/>" alt="" />
				<div class="news__description">
					<p class="news__owner">Người Đăng:</p>
					<p class="news__owner">${post.user.hoten}</p>
					<p class="news__date">Ngày Đăng: ${post.ngaydang}</p>
					<button><a href="news?id=${post.id}">Xem chi tiết</a></button>
				</div>
			</c:forEach>
		</div>

	</div>
</body>

</html>