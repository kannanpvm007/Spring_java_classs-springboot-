<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
   <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
   <!DOCTYPE html>
   <html lang="en">
   <head>
       <meta charset="UTF-8">
       <meta name="viewport" content="width=device-width, initial-scale=1.0">
       <meta http-equiv="X-UA-Compatible" content="ie=edge">
       <title>Document</title>
   </head>
   <body>
            <form:form id="loginform" action="loginprocess" modelAttribute="loginobj" >

                   <input type="text" name="username" id="name"><br><br>
                   <input type="password" name="password" id="password"><br><br>
                   <input type="submit" value="submit">

            </form:form>
   </body>
   </html>