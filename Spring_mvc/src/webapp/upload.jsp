<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/3/23
  Time: 13:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/quick18" method="post" enctype="multipart/form-data">
    名称 <input type="text" name="username"><br>
    文件<input type="file" name="uploadFile"><br>
        <input type="submit" value="提交">
</form>
</body>
</html>
