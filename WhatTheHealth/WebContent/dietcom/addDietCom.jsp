<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">

<!-- include libraries(jQuery, bootstrap) -->
<link href="http://netdna.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.css" rel="stylesheet">
<script src="http://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.js"></script> 
<script src="http://netdna.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.js"></script> 

<!-- include summernote css/js-->
<link href="http://cdnjs.cloudflare.com/ajax/libs/summernote/0.8.8/summernote.css" rel="stylesheet">
<script src="http://cdnjs.cloudflare.com/ajax/libs/summernote/0.8.8/summernote.js"></script>

<script type="text/javascript">

	function fncAddDietCom(){
		$("form").attr("method","POST").attr("action","/dietCom/addDietCom").attr("enctype","multipart/form-data").submit();	
	}
	
	 $(document).ready(function() {
        $('#summernote').summernote({
        		height: 300,
        		
        		callbacks: {
                   onImageUpload: function(files) {
                	   console.log(files)
                       sendFile(files[0]);
                   }
               }
    });
        
        function sendFile(file) {
        	 console.log(file)
        	 var data2 = new FormData();
        	 data2.append("file", file);
        	 console.log(data2)
                $.ajax({
                    url: '/dietCom/addDietCom',
                    method: "POST",
                    enctype : 'multipart/form-data',
                    data : data2,
                    cache: false,
                    contentType: false,
                    processData: false,
                    success: function(url) {
                    	console.log(url)
                    	alert(url);
                        $('#summernote').summernote('insertImage', url);
                    }
                });
            }
    }); 
	
	/*  $(function(){
		$('#summernote').summernote({
			height: 600,
			onImageUpload : function(files, editor, welEditable){
				console.log(files);
				console.log(files[0]); 
				
				data = new FormData();
				data.append("file", files[0]);
				
				var $note = $(this);
				
				$.ajax({
					url : '/dietCom/addDietCom',
					data : data,
					method : "POST",
					enctype : 'multipart/form-data',
					cache : false,
					contentType : false,
					processData : false,
					success : function(url){
						alert(url);
						$note.summernote('insertImage',url);		
					}	
				});
			}
		});
	});  */
	
	//============= "등록"  Event 연결 =============
	 $(function() {
		$( "button.btn.btn-primary" ).on("click" , function() {
			fncAddDietCom();
		});
	});	
	
	
	//============= "취소"  Event 처리 및  연결 =============
	$(function() {
		$("a[href='#' ]").on("click" , function() {
			resetData();
		});
	});	

</script>

<title>식단 커뮤니티 글쓰기 페이지</title>
</head>
<body>

	<!-- <div id="summernote"><p>Hello Summernote</p></div> -->
	
		  <textarea id="summernote" name="contents"></textarea>
		  
	 
		<div class="form-group">
		    <div class="col-sm-offset-4  col-sm-4 text-center">
		      <button type="button" class="btn btn-primary"  >등록</button>
				<a class="btn btn-primary btn" href="#" role="button">취 &nbsp;소</a>
		    </div>
		  </div>
	</form>
	
</body>
</html>