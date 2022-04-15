<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	<link href="<c:url value = "/resources/css/info_user.css"/>"rel="stylesheet" />
</head>
<body>
<div class="header__container">
      <a class="header__logo" href="#">
        <img src="<c:url value = "/resources/img/logo.jpg "/>" alt="" />
      </a>
      <div class="header__navigation">
        <a href="#">Hello word</a>
        <a href="#">Các Bài Viết</a>
        <a href="#">Đăng nhập/ Đăng Ký</a>
      </div>
    </div>
    
    <div class="info__container">
      <div class="info__content">
        <div class="info__title">Thông tin tài khoản</div>
        <form:form action="saveInfo" method="post" class="info__form" modelAttribute = "user">
        
          <div class="info__input">
            <label for="id">Id</label>
            <input type="text" name = "id" value = "${user.id}" readonly/>
          </div>
        
		  <div class="info__input">
            <label for="email">Email</label>
            <input type="text" name = "email" value = "${user.email}" readonly/>
          </div>
          
          <div class="info__input">
            <label for="matkhau">password</label>
            <input type="password" name = "matkhau" value = "${user.matkhau}" readonly/>
          </div>
          
          <div class="info__input">
            <label for="hoten">Họ và Tên</label>
            <input type="text" name = "hoten" value = "${user.hoten}"/>
          </div>
          
          <div class="info__input">
            <label for="phone">Số Điện Thoại</label>
            <input type="number" name="phone" value = "${user.phone}"  />
          </div>
          
          <div class="info__input">
            <label for="ngaysinh">Ngày Sinh</label>
            <input type="text" name="ngaysinh" value = "${user.ngaysinh}" />
          </div>
          
          <div class="info__input">
            <label for="diachi">Địa Chỉ</label>
            <input type="text" name = "diachi" value = "${user.diachi}" />
          </div>
          
         
          
          <div class="info__sex">
            <label for="sex">Giới Tính</label>
            <div class="info__choose">
              <div class="info__options">
                <input type="radio" name="gioitinh" value = "${user.gioitinh}" />
                <label for="sex">Nam</label>
              </div>
              <div class="info__options">
                <input type="radio" name="gioitinh" value = "${user.gioitinh}" />
                <label for="sex">Nữ</label>
              </div>
            </div>
          </div>
          
          <button type="submit" class="">Lưu Thay Đổi</button>
        </form:form>
      </div>
      <div class="info__show">
        <div class="info__block">
         <%--  <div class="info__title">Email và Số điện thoại</div>
          <div class="info__item">
            <i class="fa-solid fa-envelope"></i>
            <div class="info__item__title">
              <input type="text"  value = "${user.email}">
            </div>
            <button>Cập Nhật</button>
          </div>
          <div class="info__item">
            <i class="fa-solid fa-phone"></i>
            <div class="info__item__title">
              <input type="number"  value = "${user.matkhau}">
            </div>
            <button>Cập Nhật</button>
          </div> --%>
        </div>
        
        <div class="info__block">
          <div class="info__title">Bảo Mật</div>
          <div class="info__item">
            <i class="fa-solid fa-lock"></i>
            <div class="info__item__title">
              <label>Đổi mật khẩu</label>
            </div>
            <button><a href="changePassWord?username=${user.email}">Đổi mật khẩu</a></button>
          </div>
        </div>
        
        <div class="info__block">
          <div class="info__title">Quyền hạn</div>
          <div class="info__item">
            <i class="fa-solid fa-hand-fist"></i>
            <div class="info__item__title">
              <label>${user.userRole.name}</label>
            </div>
            <button><a href="adminRequest?username=${user.email}">Xin Admin</a></button>
          </div>
        </div>
      </div>
    </div>
</body>
</html>