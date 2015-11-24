<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>
<form action="registration" method="post">
    <table>
        <tr>
            <td>name :</td>
            <td><input type="text" name="name"></td>
            <c:if test="${not empty requestScope.errors.nameError}">
                <td>${requestScope.errors.nameError}</td>
            </c:if>
        </tr>
        <tr>
            <td>surname :</td>
            <td><input type="text" name="surname"></td>
            <c:if test="${not empty requestScope.errors.surnameError}">
                <td>${requestScope.errors.surnameError}</td>
            </c:if>
        </tr>
        <tr>
            <td>username :</td>
            <td><input type="text" name="username"></td>
            <c:if test="${not empty requestScope.errors.usernameError}">
                <td>${requestScope.errors.usernameError}</td>
            </c:if>
        </tr>
        <tr>
            <td>surname :</td>
            <td><input type="text" name="email"></td>
            <c:if test="${not empty requestScope.errors.emailError}">
                <td>${requestScope.errors.emailError}</td>
            </c:if>
        </tr>
        <tr>
            <td>gender:</td>
            <td><input type="checkbox" name="gender" value="male"></td>
            <td><input type="checkbox" name="gender" value="female"></td>
            <c:if test="${not empty requestScope.errors.genderError}">
                <td>${requestScope.errors.genderError}</td>
            </c:if>
        </tr>
            <tr>
            <td>password :</td>
            <td><input type="text" name="password"></td>
            <c:if test="${not empty requestScope.errors.passwordError}">
                <td>${requestScope.errors.passwordError}</td>
            </c:if>
        </tr>
        <tr>
            <td>confirmPassword :</td>
            <td><input type="text" name="confirmPassword"></td>
            <c:if test="${not empty requestScope.errors.confirmPasswordError}">
                <td>${requestScope.errors.confirmPasswordError}</td>
            </c:if>
        </tr>
        <tr>
            <td>
                <input type="submit" value="register">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
