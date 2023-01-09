<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="<c:url value = "/resources/css/news_info.css"/>"
	rel="stylesheet" />
</head>
<body>
	<div class="news__info__container">
		<div class="news__tool">
			<form class="account__find">
				<input type="text" /> <select id="find__option">
					<option value="email">Email</option>
					<option value="TÃªn">TÃªn</option>
				</select>
				<button type="submit">
					<i class="fa-solid fa-magnifying-glass"></i>
				</button>
			</form>
			<button>
				<i class="fa-solid fa-file-excel"></i>
			</button>
			<button>Trá» Vá»</button>
		</div>

		<div class="news__info__content">
			<div class="news__onwer">NgÆ°á»i ÄÄng: Äá»©c TÃ­</div>
			<div class="news__date">NgÃ y ÄÄng: 08/08/2008</div>
			<div class="news__date__start">Äá»£t TiÃªm: 08:08 08/08/0808 08/8
				Äá»©c TrÃ­, quáº­n Äá»©c trÃ­, tá»nh Äá»©c TÃ­</div>
		</div>

		<div class="account__content">
			<div class="account__table__list">
				<div class="table__pagination">
					<button>TrÆ°á»c</button>
					<span>1/10</span>
					<button>Sau</button>
				</div>
				<div class="table__title">
					<div class="title__item">Email</div>
					<div class="title__item">Há» TÃªn</div>
					<div class="title__item">SDT</div>
					<div class="title__item">NgÃ y Sinh</div>
					<div class="title__item">CÃ¢n Náº·ng</div>
					<div class="title__item">Giá»i TÃ­nh</div>
					<div class="title__item">Äá»a Chá»</div>
				</div>
				<div class="table__content">
					<div class="content__item">
						<div class="content__des">Email</div>
						<div class="content__des">Há» TÃªn</div>
						<div class="content__des">SDT</div>
						<div class="content__des">NgÃ y Sinh</div>
						<div class="content__des">CÃ¢n Náº·ng</div>
						<div class="content__des">Giá»i TÃ­nh</div>
						<div class="content__des">Äá»a Chá»</div>
					</div>
					<div class="content__item">
						<div class="content__des">
							Emasssssssssssssssssssssssssssssssssssssssssssssssssil</div>
						<div class="content__des">Há» TÃªn</div>
						<div class="content__des">SDT</div>
						<div class="content__des">NgÃ y Sinh</div>
						<div class="content__des">CÃ¢n Náº·ng</div>
						<div class="content__des">Giá»i TÃ­nh</div>
						<div class="content__des">Äá»a Chá»</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>