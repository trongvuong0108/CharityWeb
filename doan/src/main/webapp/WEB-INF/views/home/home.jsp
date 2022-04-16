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
	<%@ include file="/WEB-INF/component/header.jsp" %>
	<div class="home__list__news">
		<div class="homoe__pagination">
            <button><a href="/doan/?p=0">Đầu</a></button>
            
            <c:choose>
                <c:when test="${listPost.number -1 >= 0}">
                    <button><a href="/doan/?p=${listPost.number -1 }"> Trước </a></button>
                </c:when>
            </c:choose>

            <c:choose>
                <c:when test="${listPost.number < listPost.totalPages-1 }">
                    <button><a href="/doan/?p=${listPost.number + 1 }">Sau</a></button>
                </c:when>
            </c:choose>	
            
            <button><a href="/doan/?p=${listPost.totalPages-1}">Cuối</a></button>
        </div>
		<div class="home__news">
			<c:forEach items="${listPost.content}" var="post">
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