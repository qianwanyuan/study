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
		

</html>
