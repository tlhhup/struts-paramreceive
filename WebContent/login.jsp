<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div align="center">
		<form action="LoginAction.do" method="post">
			<table>
				<caption>用户登录</caption>
				<tr>
					<td>用户名：</td>
					<td>
						<input type="text" name="user.userName">
					</td>
				</tr>
				<tr>
					<td>密&nbsp;码：</td>
					<td>
						<input type="password" name="user.password">
					</td>
				</tr>
				<tr>
					<td colspan="2" align="center">
						<input type="submit" value="登录">&nbsp;
						<input type="reset" value="重置">
					</td>
				</tr>
			</table>
		</form>
	</div>

</body>
</html>