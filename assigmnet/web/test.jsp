<%-- 
    Document   : test
    Created on : Mar 15, 2022, 8:33:02 PM
    Author     : ADMIN
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="test">
            <input type="number" step="1" max="99" min="1" value="1" name="a"
                                           size="4">
            <br>
            <input type="submit">
        </form>
    </body>
</html>
