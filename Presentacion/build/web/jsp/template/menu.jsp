<%-- 
    Document   : menu
    Created on : 24-10-2019, 20:09:24
    Author     : boyarce
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<nav class="navbar navbar-expand-sm bg-light navbar-light">
    <ul class="navbar-nav mr-auto">
        <li class="nav-item active">
            <a class="nav-link" href="home.jsp">INICIO</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="mantenedor-tipo-empleado.jsp">MANTENEDOR TIPOS</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="mantenedor-empleado.jsp">MANTENEDOR EMPLEADO</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="link.jsp">Link</a>
        </li>             
    </ul>
    <form id="frm-login" action="" method="POST">
        <c:if test="${not empty sessionScope.user}">
            <i class="fas fa-user">
                ${sessionScope.user}
            </i>                   
        </c:if>                
    </form>   
</nav>