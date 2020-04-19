<%--
  Created by IntelliJ IDEA.
  User: INS
  Date: 2020/4/15
  Time: 13:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传</title>
</head>
<body>
    <!--
        文件上传三要素
           1.表单提交方式必须是post
           2.表单类型必须是：multipart/form-data多功能表单数据
           3.必须有一个type="file"的表单元素
    -->
    <form action="${pageContext.request.contextPath}/upload/load" method="post"
          enctype="multipart/form-data">
        <input type="text" name="username"/><br>
        <input type="file" name="upload"/><br>
        <input type="submit" value="提交"/>
    </form>
</body>
</html>
