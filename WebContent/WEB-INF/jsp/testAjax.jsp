<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="${pageContext.request.contextPath}/resources/js/jquery-1.11.3.min.js"></script>
<script type="text/javascript">

	function test() {
		$.ajax({
			type : 'post',
			url : '${pageContext.request.contextPath}/springTest/ajaxTest.do',
			data : {name: $("#name").val(),age : $("#age").val()},
			success : function(data) {
				alert(data);
			}
		});
	}
</script>
</head>
<body>
	<h1>测试Ajax</h1>
	姓名:<input type="text" id="name" />
	年龄:<input type="text" id="age" />
	<input type="button" value="开始测试" onclick="test()"/>
</body>
</html>