<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	${req }
	${app }
	${se }
	欢迎[${user.userName }]登录<br>
	<a href="UsersAction!logout.do">退出</a>
	<a href="UserActionWildcard_logout.do">退出</a>
</body>
</html>