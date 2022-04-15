
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="<c:url value = "/resources/css/admin.css"/>"
	rel="stylesheet" />
</head>
<body>
	<div class="nav__tab">
		<div class="nav">
			<a href="/doan"><img src="<c:url value = "/resources/img/logo.jpg"/>" alt=""/></a>
			<button class="nav-item" id="nav-Account"><a href="/doan/admin/taikhoan">Tài khoảng</a></button>
			<button class="nav-item active" id="nav-News"><a href="/doan/admin/baidang">Bài Viết</a></button>
			<button class="nav-item" id="nav-Account"><a href="/doan/admin/diadiem">Địa điểm</a></button>
			<button class="nav-item" id="nav-Address"><a href="/doan/admin/dothienmau">Đợt Hiến Máu</a></button>
			<button class="nav-item" id="nav-Address"><a href="/doan/logout">Đăng Xuất</a></button>
		</div>

		<div class="tab">
			<div id="News" class="city">
				<div class="news__tool">
					<form class="account__find" action="/doan/admin/baidang/search">
						<input type="text"  name = "kw"/>
						<button type="submit">
							Tìm kiếm
						</button>
					</form>
				</div>
				
				<div class="news__table">
					<div class="table__pagination">
						<button>Trước</button>
						<span>1/10</span>
						<button>Sau</button>
					</div>
					<button class="add__address"><a href="/doan/admin/baidang/new">Thêm mới</a></button>
					<div class="table__title">
						<div class="title__item">Email</div>
						<div class="title__item">Họ Tên</div>
						<div class="title__item">Ngày Đăng</div>
						<div class="title__item">Thao Tác</div>
					</div>
					<div class="table__content">
						<c:forEach items="${listPost}" var="post">

							<div class="content__item">
								<div class="content__des">${post.user.email}</div>
								<div class="content__des">${post.user.hoten}</div>
								<div class="content__des">${post.ngaydang}</div>
								<div class="content__des">
									<button>Danh sách đăng ký</button>
								</div>

							</div>
						</c:forEach>
					</div>

				</div>
			</div>
		</div>
	</div>
</body>
</html>