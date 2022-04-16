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
			<img src="<c:url value = "/resources/img/logo.jpg"/>" alt=""/>
			<button class="nav-item" id="nav-Account"><a href="/doan/admin/taikhoan">Tài khoảng</a></button>
			<button class="nav-item" id="nav-News"><a href="/doan/admin/baidang">Bài Viết</a></button>
			<button class="nav-item active" id="nav-Account"><a href="/doan/admin/diadiem">Địa điểm</a></button>
			<button class="nav-item" id="nav-Address"><a href="/doan/admin/dothienmau">Đợt Hiến Máu</a></button>
			<button class="nav-item" id="nav-Address"><a href="/doan/logout">Đăng Xuất</a></button>
		</div>

		<div class="tab">
			<div id="Address" class="city">
				<form class="account__find" action = "/doan/admin/diadiem/search">
					<input type="text" name = "kw"/>
					<button type="submit">
						<i class="fa-solid fa-magnifying-glass">Tìm kiếm</i>
					</button>
				</form>
				<div class="account__content">
					<div class="account__table__list" style="flex-basis: 100%;">
						<div class="table__pagination">
							<button>Trước</button>
							<span>1/10</span>
							<button>Sau</button>
						</div>
						<button class="add__address"><a href="/doan/admin/diadiem/new">Thêm mới</a></button>
						<div class="table__title">
							<div class="title__item">Địa Chỉ</div>
							<div class="title__item">Tên</div>
							<div class="title__item">Chú Ý</div>
							<div class="title__item">Thao Tác</div>
						</div>
						<div class="table__content">
						<c:forEach items="${listDiadiem}" var="diadiem">
							<div class="content__item">
								<div class="content__des">${diadiem.diachi}</div>
								<div class="content__des">${diadiem.ten}</div>
								<div class="content__des">${diadiem.chuy}</div>
								<div class="content__des">
									<a href="diadiem/edit?id=${diadiem.id}">Edit</a>
									<a href="diadiem/delete?id=${diadiem.id}">Delete</a>
								</div>
							</div>
						</c:forEach>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</body>
</html>