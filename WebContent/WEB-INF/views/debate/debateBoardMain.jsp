<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
	
<!DOCTYPE html>
<html>
<head>
	<meta charset="EUC-KR">
	<title>Insert title here</title>
	<link href="/team4/resources/debateCSS.css" rel="stylesheet" type="text/css">
</head>
<body>

	<div id="div_table_debate" class="div_table">
		<table id="debate_table" class="table">
			<colgroup>
				<col width="55%">
				<col width="15%">
				<col width="10%">
				<col width="10%">
				
			</colgroup>
			<tbody>
				<tr>
					<th>����</th>
					<th>�۾���</th>
					<th>��ȸ</th>
					<th>��ǥ��</th>
				</tr>
			</tbody>
				<c:forEach var="debateList" items="$">
					<tr></tr>
				</c:forEach>						
		</table>	
	</div>

</body>
</html>