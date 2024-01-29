<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="DepartmentListServlet" method="post">
    <label for="departmentName">名称:</label>
    <input type="text" id="departmentName" name="departmentName">
    <br>
    <input type="submit" value="提交">
  </form>
</body>
</html>