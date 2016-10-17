<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/9/13
  Time: 11:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>MY MESSAGE BORAD</title>
  </head>
  <body>
<h1 align="center">欢迎大帅哥光临我的留言板！</h1>


 <%-- ${requestScope.list}--%>
<c:forEach var="m" items="${requestScope.list}">
<table border="1" width="80%" align="center">
  <tr >
   <%-- <td>${m.senduserId}</td>--%>
    <td>${m.sendUsername}</td>
  </tr>
  <tr >
    <td>${m.messageContext}</td>
</tr>
  <tr >
    <td>${m.careatTime}</td>
  </tr>
</table>
</c:forEach>
  总共${requestScope.totalPage}页,当前第${currpage}页
  <c:forEach var="p" begin="1" end="${requestScope.totalPage}">
<a href="myindex?p=${p}">${p}</a>

  </c:forEach>
  </body>
</html>
