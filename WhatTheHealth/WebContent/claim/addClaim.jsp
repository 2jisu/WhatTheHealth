<%@ page contentType="text/html; charset=EUC-KR" %>
<%@ page pageEncoding="EUC-KR"%>

<!--  ///////////////////////// JSTL  ////////////////////////// -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>

<html lang="ko">
	
<head>
	<meta charset="EUC-KR">
	
	<!-- 참조 : http://getbootstrap.com/css/   참조 -->
	<meta name="viewport" content="width=device-width, initial-scale=1.0" />
	
	<!--  ///////////////////////// Bootstrap, jQuery CDN ////////////////////////// -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" >
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" >
	<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" ></script>
	
	<!--  ///////////////////////// CSS ////////////////////////// -->
	<style></style>
    
     <!--  ///////////////////////// JavaScript ////////////////////////// -->
	<script type="text/javascript">
	
	
	
		//=============  "사용"  Event 처리 =============
		$(function() {
			
			//==> DOM Object GET 3가지 방법 ==> 1. $(tagName) : 2.(#id) : 3.$(.className)
			$("button.btn.btn-info").on("click" , function() {
				var inputNum = $("#email").val();
				alert(inputNum);
				 $.ajax(
							{
								url : "/user/json/checkEmail/"+inputNum,
								method : "GET",
								headers : {
									"Accept" : "application/json",
									"Content-Type" : "application/json"
								},
								success : function(data) {
									alert(data);
									if (data) {
										alert("인증완료!");
										window.close();
									}else{
										alert("다시 입력하세요.");
									}
									
								}
							})
			});
		});
		
		
		//=============   "닫기"  Event  처리 =============
		$(function() {
			//==> DOM Object GET 3가지 방법 ==> 1. $(tagName) : 2.(#id) : 3.$(.className)
			$("button.btn.btn-primary").on("click" , function() {
				window.close();
			});
		});

	</script>
	
</head>

<body>
	
	<!--  화면구성 div Start /////////////////////////////////////-->
	<div class="container">
		
		<br/><br/>
		
		<!-- form Start /////////////////////////////////////-->
		<form class="form-inline">
		
		  <div class="form-group">작 성 자 : ${user.userId} 신 고 대 상 : ${post.userId}</div>
		    <input type="text" class="form-control" name="email" id="email" 	value="${ ! empty result && result ? email : '' }" >
	
		  <button type="button" class="btn btn-info">중복확인</button>
		  
		  
		  <button type="button" class="btn btn-primary">닫 기</button>
		  

		 
		</form>
		<!-- form Start /////////////////////////////////////-->
	
 	</div>
 	<!--  화면구성 div End /////////////////////////////////////-->

</body>

</html>