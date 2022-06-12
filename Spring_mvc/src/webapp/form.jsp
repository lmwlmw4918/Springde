<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/3/21
  Time: 23:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/quick12" method="post">
<%--    表明是一个第一个user对象的username--%>
    <input type="text" name="list[0].name"><br>
    <input type="text" name="list[0].age"><br>
    <input type="text" name="list[1].name"><br>
    <input type="text" name="list[1].age"><br>
    <input type="submit" value="提交">

</form>
</body>
</html>
