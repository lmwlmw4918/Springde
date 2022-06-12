<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/3/22
  Time: 0:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery-3.3.1.js"></script>
    <script>
        var userList=new Array();
        userList.push({name:"zhangshan",age:18});
        userList.push({name:"wangwu",age:19});
        $.ajax({
            type:"POST",
            url:"${pageContext.request.contextPath}/user/quick13",
            data:JSON.stringify(userList),
            contentType:"application/json;charset=utf-8"
        })

    </script>
</head>
<body>

</body>
</html>
