<%--
  Created by IntelliJ IDEA.
  User: wxy_0
  Date: 2020/9/11
  Time: 14:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>下载列表</title>
</head>
<body>
<ol>
    <c:forEach items="${fileNameList}"
               var="fileName">
        <li>
            <a href="/download/files/${fileName}">
                    ${fileName}
            </a>
        </li>
    </c:forEach>
</ol>
</body>
</html>
