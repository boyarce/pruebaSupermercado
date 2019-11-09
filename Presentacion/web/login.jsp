<%-- 
    Document   : login
    Created on : 24-10-2019, 20:06:01
    Author     : boyarce
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>        
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LOGIN MY SITE</title>
        <jsp:include page="/jsp/template/header.jsp"/>
    </head>
    <body>        
        <form id="frm-login" action="LoginServlet" method="POST">
            <div class="container card" style="margin-top: 50px; max-width: 500px;">
                <h1>LOGIN</h1>
                <div class="row">
                    <div class="form-group col-sm-12">                        
                        <input type="text" class="form-control" id="txt-user" placeholder="USER"
                               name="user">
                    </div>
                </div>
                <div class="row">
                    <div class="form-group col-sm-12">                        
                        <input type="password" class="form-control" id="txt-pass" placeholder="PASSWORD"
                               name="pass">
                    </div>
                </div> 
                <div class="row">
                    <div class="form-group col-sm-8">                        
                    </div>                 
                    <div class="form-group col-sm-4">                        
                        <button id="bnt-calcular" type="submit" 
                                class="btn btn-success col-sm-12">LOGIN</button>
                    </div>
                </div>
                <div class="row">
                    <c:if test="${not empty sessionScope.error}">
                        <div id="msg-error" class="form-group col-sm-12 btn btn-danger">
                            ${sessionScope.error}
                        </div>                    
                    </c:if>
                </div>
            </div>
        </form>
    </body>
</html>
