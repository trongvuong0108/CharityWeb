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
			<button class="nav-item active"id="nav-Account"><a href="/doan/admin/taikhoan">Tài khoảng</a></button>
			<button class=" nav-item" id="nav-News"><a href="/doan/admin/baidang">Bài Viết</a></button>
			<button class="nav-item" id="nav-Account"><a href="/doan/admin/diadiem">Địa điểm</a></button>
			<button class="nav-item" id="nav-Address"><a href="/doan/admin/dothienmau">Đợt Hiến Máu</a></button>
			<button class="nav-item" id="nav-Address"><a href="/doan/logout">Đăng Xuất</a></button>
		</div>

		<div class="tab">
			<div id="Account" class="city">
				<form class="account__find"  action="/doan/admin/taikhoan/search">
					<input type="text" name ="kw"/> 
					<button type="submit">
						Tìm kiếm
					</button>
				</form>
				<div class="account__content">
					<div class="account__table__list">
						<div class="table__pagination">
							<button>Trước</button>
							<span>1/10</span>
							<button>Sau</button>
						</div>
						<div class="table__title">
							<div class="title__item">Email</div>
							<div class="title__item">Họ Tên</div>
							<div class="title__item">Quyền</div>
							<div class="title__item">Thao Tác</div>
						</div>
						<div class="table__content">
						<c:forEach items="${listUser}" var="user">
							<div class="content__item">
								<div class="content__des">${user.email}</div>
								<div class="content__des">${user.hoten}</div>
								<div class="content__des">${user.userRole.name}</div>
								<div class="content__des">
									<button>Xem Chi Tiết</button>
								</div>
							</div>
						</c:forEach>
						</div>
					</div>

					<div class="account__request__list">
						<div class="table__pagination">
							<button>Trước</button>
							<span>1/10</span>
							<button>Sau</button>
						</div>
						<form class="account__find">
							<input type="text" />
							<!-- <select id="find__option">
                  <option value="email">Email</option>
                  <option value="Tên">Tên</option>
                </select> -->
							<button type="submit">
								Tìm kiếm
							</button>
						</form>
						<div class="request__list">
						<c:forEach items="${userbyStatus}" var="user">
							<div class="request__item">
								<div class="request__email">${user.email}</div>
								<div class="request__nav">
									<button class="accept">
										<a href="/doan/admin/taikhoan/accept?username=${user.email}"> Accept</a>
									</button>
								</div>
							</div>
						</c:forEach>
							
						</div>
						<!-- <div class="request__nav request__nav__general">
							<button class="accept">Chấp Nhận Tất Cả</button>
							<button class="defuse">Từ Chối Tất Cả</button>
						</div> -->
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>