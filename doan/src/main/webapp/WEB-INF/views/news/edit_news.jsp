<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="<c:url value = "/resources/css/edit_news.css"/>"
	rel="stylesheet" />
</head>
<body>
	<div class="header__container">
		<a class="header__logo" href="#"> <img src="../../img/logo.jpg"
			alt="" />
		</a>
		<div class="header__navigation">
			<a href="#">Hello word</a> <a href="#">Bài Viết của tôi</a> <a
				href="#">Các Bài Viết</a> <a href="#">Đăng nhập/ Đăng Ký</a>
		</div>
	</div>
	<div class="news__container">
		<div class="news__date">
			Ngày Đăng: <input type="date" />
		</div>
		<div class="news__date__start">
			Đợt Tiêm:
			<div>
				<input type="date" /> <input type="date" />
			</div>
			<select id="find__option">
				<option value="email">TP.HCM</option>
				<option value="Tên">Hà Nội</option>
			</select>
		</div>
		<textarea placeholder="Diền nội dung bản tin" rows="30"
			class="news__content"></textarea>
		<button class="news__register">Cập Nhật bài viết</button>
		<button class="delete">Xóa bài viết</button>
	</div>
</body>
</html>