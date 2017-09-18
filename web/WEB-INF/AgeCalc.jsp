<%-- 
    Document   : AgeCalc
    Created on : Sep 18, 2017, 8:29:36 AM
    Author     : 740991
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>YOUR AGE NEXT BIRTHDAY</title>
    </head>
    <body>
        <h1> YOUR AGE NEXT BIRTHDAY</h1>
        <div>
        <form action ="AgeCalc" method="get">
            Your current age: <input type="number" name="age" value="${age}">
            <input type="submit" value="Submit">
        </form>
        </div>
            ${response}
            ${ErrorMessage}
    </body>
</html>
