<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>   
	
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<!-- 	
	<link href="/team4/resources/designCSS.css" rel="stylesheet" type="text/css">
 -->	
</head>
<body>
	
	<div class="container">
		<header id="header">
		 	<div class="row header">
		 		<div class="col-xs-12">
			 		<a href="/team4/debate/debateBoardMain.do">토론 게시판</a>
			 		<a href="">공약 게시판</a>
			 		<a href="">이슈 게시판</a>
			 		<a href="">신청 게시판</a>
			 	</div>
		 	</div>
	 	</header>
 	
	 	<div class="section" id="main">
	 		<div class="col-md-2">
	 		
	 		</div>
			<div class="col-md-8" id="div_table_debate">
				<table id="debate_table" class="table">
					<colgroup>
						<col width="55%">
						<col width="15%">
						<col width="10%">
						<col width="20%">				
					</colgroup>
					<tbody>
						<tr>
							<th>제목</th>
							<th>기사</th>
							<th>조회</th>
							<th>날짜</th>
						</tr>
					</tbody>
						<c:forEach var="debate" items="${articleList}">
							<tr>
								<td><a href="/team4/debate/debateBoard.do?num=${article.num}&pageNum=${currentPage}">${debate.sub}</a></td>
								<td>${debate.link}</td>
								<td>${debate.readcount}</td>
								<td>${debate.reg}</td>
							</tr>
						</c:forEach>						
				</table>			
				
				<div id="div_pageNumber" class="div_table">
					<c:if test="${count > 0 }">
						<fmt:parseNumber var="res" value="${count/pageSize}" integerOnly="true" />
						<c:set var="pageCount" value="${res + (count % pageSize == 0 ? 0 : 1)}" />
						<c:set var="pageBlock" value="10" />
						<fmt:parseNumber var="result" value="${currentPage/pageBlock}" integerOnly="true" />
						<fmt:parseNumber var="startPage" value="${result * pageBlock +1}" />
						<fmt:parseNumber var="endPage" value="${startPage + pageBlock - 1}" />
						<c:if test="${endPage > pageCount}" >
							<c:set var="endPage" value="${pageCount}" />
						</c:if>				
						<c:if test="${startPage > pageBlock}">
							<a href="/team4/debate/debateBoardMain.do?pageNum=${startPage-pageBlock}" > &lt; </a>		
						</c:if>		
						<c:forEach var="i" begin="${startPage}" end="${endPage}" step="1" >
							<a href="/team4/debate/debateBoardMain.do?pageNum=${i}" class="nums"> &nbsp; ${i} &nbsp; </a>
						</c:forEach>
						<c:if test="${endPage < pageCount}">
							<a href="/team4/debate/debateBoardMain.do?pageNum=${startPage+pageBlock}" > &gt; </a>		
						</c:if>				
					</c:if>			
				</div>
			</div>
			<div class="col-md-2">
			</div>
		</div>
		
		<footer>
			<div class="row footer">
				<div class="col-xs-12">
					<h3>푸터</h3>
				</div>
			</div>
		</footer>	
	</div>
	
</body>
</html>