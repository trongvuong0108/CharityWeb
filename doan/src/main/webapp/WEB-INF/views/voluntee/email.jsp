
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
	<div id="signup__model__container" class="signup__model__container">
		<div class="signup__model">
			<div class="model__title">Đã gửi mã xác nhận qua email của bạn.</div>

			<div class="model__code">
				<label for="signup__confirm">Điền mã xác nhận</label> <input
					type="number" name="signup__confirm" />
			</div>

			<div class="model__resend">
				<label for="signup__resend">Nếu chưa nhận được nhấn ở đấy:</label>
				<button>Gửi lại mã</button>
			</div>

			<button class="model__confirm">Xác nhận</button>

			<button class="model__close"></button>
		</div>
	</div>
	<div class="header__container">
		<a class="header__logo" href="#"> <img src="<c:url value = "/resources/img/logo.jpg "/>" 
			alt="" />
		</a>
		<div class="header__navigation">
			<a href="#">Hello word</a> <a href="#">Bài Viết của tôi</a> <a
				href="#">Các Bài Viết</a> <a href="#">Đăng nhập/ Đăng Ký</a>
		</div>
	</div>
	<div class="signup__card">
		<div class="signup__container">
			<div class="signup__navigation">
				<a href="#">Trở Về</a>
			</div>
			<!-- <div class="signup__logo"><img src="../img/logo.jpg" alt="logo" /></div> -->
			<form:form action="saveEmail?id_post=${param.id}" method="post" class="signup__form" modelAttribute = "thongtin">
				<div class="signup__input">
					<label for="email">Email</label>
					<input type="text" name="email"/>
				</div>
				<button id="signup__volumtee" type="submit">Đăng Ký</button>
			</form:form>
		</div>
	</div>
</body>
<!-- <script>
    // console.log(document.getElementsByClassName("signup__model")[0])
    document
      .getElementById("signup__volumtee")
      .addEventListener("click", (e) => {
        e.preventDefault();
        document.getElementById("signup__model__container").style.display =
          "flex";
      });
    document
      .getElementsByClassName("model__close")[0]
      .addEventListener("click", () => {
        document.getElementById("signup__model__container").style.display =
          "none";
      });
  </script> -->
</html>