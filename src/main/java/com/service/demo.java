<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">

<head>
	<title>Login</title>
	<link href="dist/css/bootstrap.min.css" rel="stylesheet">
	<style>
		.container {
			display: flex;
			align-items: center;
			justify-content: center;
			height: 100vh;

		}

		.box {
			width: 300px;
			height: 200px;
			border: 1px solid #ccc;
			display: flex;
			align-items: center;
			justify-content: center;
			background-color: rgb(192, 192, 192);
		}

		.submit {
			display: flex;
			align-items: center;
			justify-content: center;
		}
	</style>
</head>
<script>
</script>

<body>
	<div th:insert="~{Header::Header}" />
	<div class="container">
		<div class="box">
			<form action="/login" method="post">
				<table>
					<tr>
						<td for="loginId" class="form-label">ユーザID:</td>
						<td><input type="text" id="loginId" name="loginId" class="form-control" required></td>
					</tr>
					<tr>
						<td for="password" class="form-label">パスワード: </td>
						<td><input type="password" id="password" name="password" class="form-control" required></td>
					</tr>
				</table>
				<div class="submit"><input type="submit" value="ログイン" class="btn btn-warning btn-sm "></div>
			</form>
		</div>
	</div>
	<script src="js/jquery-3.6.1.min.js"></script>
	<script src="dist/css/bootstrap.min.js"></script>
</body>

</html>