<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/5/9
  Time: 12:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>添加账户信息</h1>
        <form name="account" action="${pageContext.request.contextPath}/account/save"method="post">
            账户名称:<input name="name" type="text"><br>
            账户金额:<input name="money" type="text"><br>
            <input type="submit" value="保存"><br>
        </form>
</body>
</html>
