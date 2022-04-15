
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="<c:url value = "/resources/css/write_news.css"/>"
	rel="stylesheet" />
</head>
<body>
	<div class="header__container">
		<a class="header__logo" href="#"> 
			<img  src="<c:url value = "/resources/img/logo.jpg "/>" alt="" />
		</a>
		<div class="header__navigation">
			<a href="#">Hello word</a> 
			<a href="#">Bài Viết của tôi</a> 
			<a href="#">Các Bài Viết</a> 
			<a href="#">Đăng nhập/ Đăng Ký</a>
		</div>
	</div>
	<form:form action="save" method="post" class="signup__form" modelAttribute="baidang">
		<div class="news__container">
		
			<div class="news__date"> Địa điểm
				<select name = "diadiemId">		    
					<option  value="NONE" label="--- Select ---" />
				    <c:forEach items="${diadiems}" var="diadiem">
				        <option  value="${diadiem.id}"/>  ${diadiem.ten}
				    </c:forEach>
				</select>
			</div>
			
			
			<div class="news__date__start"> Đợt hiếm máu
				 <select name = "dothienmauId" >
				    <option value="NONE" label="--- Select ---" />
					<c:forEach items="${dothienmaus}" var="dothienmau">
				        <option value="${dothienmau.id}"/> ${dothienmau.ngaybd} đến ${dothienmau.ngaykt}
				    </c:forEach> 
				</select>			
			</div>
			
			
			<textarea name = "noidung" placeholder="Diền nội dung bản tin" rows="30" class="news__content" ></textarea>
			<button type="submit" class="news__register">Thêm bài viết</button>
		</div>
	</form:form>
	
</body>
</html>