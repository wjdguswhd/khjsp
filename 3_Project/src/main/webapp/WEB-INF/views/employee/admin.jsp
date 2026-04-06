<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	html, body{width: 99%; height: 98%;}
	#container{width: 99%; height: 75%; display: flex;}
 	#adminDiv{height: 100%; width: 15%; background: #111; display: inline-block;}
	.adminMenu{
		width: 95%; height: 60px; background: #888; text-align: center; margin: auto; 
		line-height: 60px; font-size: 20px; color: #eee;
	}
	.adminMenu:hover{font-weight: bold; cursor: pointer;}
	
	.menuContent{margin-left: 10px; width: 85%; height: 100%; display:none;}
	
	#enrollDiv{margin: auto; padding: 130px;}
	#enrollDiv td{text-align: right;}
	.enrollInput{height: 30px; width: 200px;}
	.enrollInput.select{width: 208px;}
	#enrollButton{border: 1px solid black; width: 300px; padding: 15px; border-radius: 15px; background: white;}
	#enrollButton:hover{background: black; color: white; cursor: pointer;}

	#adminDiv+div{height: 92%; width: 80%; padding: 30px; overflow: scroll;}
	#adminDiv+div>table{width: 100%; text-align: center;}
	th{border-bottom: 1px solid black;}
	#adminDiv+div>table td{height: 35px;}
</style>
</head>
<body>
	<jsp:include page="../common/top.jsp"/>
	<jsp:include page="../common/loginbar.jsp"/>

	<hr>
	
	<div id="container">
		<div id="adminDiv">
			<h2 style="margin-left: 5px;">
				<a href="${ contextPath }" style="color: white;">
					JSP&amp;Servlet<br>
					JDBC Project
				</a>
			</h2>
			<div class="adminMenu">사원 전체 보기</div>
			<br>
			<div class="adminMenu">사원 등록 하기</div>
		</div>
		
		<div class="menuContent" style="background: pink;"></div>
		<div class="menuContent" style="background: yellowgreen;"></div>
	</div>
</body>
</html>