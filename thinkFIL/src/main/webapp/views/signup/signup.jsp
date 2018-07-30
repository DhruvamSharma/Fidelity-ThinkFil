<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>${error}</h1>
  <form:form method="POST"
          action="/signup" modelAttribute="user">
             <table>
                <tr>
                    <td><form:label path="employeeName">Name</form:label></td>
                    <td><form:input path="employeeName"/></td>
                </tr><br>
                <tr>
                    <td><form:label path="password">
                      password</form:label></td>
                    <td><form:password path="password"/></td>
                </tr><br>
                <tr>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
            </table>
        </form:form>
</body>
</html>