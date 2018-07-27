<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:form method = "POST" action = "/signup">
         <table>
            <tr> <td>
               Name<br>
               <form:input path = "name" /></td>
            </tr>
             <tr> <td>
               AID <br>
               <form:input path = "aid" /></td>
            </tr>
            <tr> <td>
               Password<br>
               <form:input path = "password" /></td>
            </tr>
            <tr> <td>
               Confirm Password<br>
              <form:input path = "confirmPassword" /></td>
            </tr>
            <tr>
               <td colspan = "2">
                  <input type = "submit" value = "Sign Up"/>
               </td>
            </tr>
         </table>  
      </form:form>



</body>
</html>