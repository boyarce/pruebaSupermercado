<%-- 
    Document   : mantenedor-tipo-empleado
    Created on : 24-10-2019, 20:41:05
    Author     : boyarce
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>TIPOS</title>
        <jsp:include page="/jsp/template/header.jsp"/>
    </head>
    <body>
        <jsp:include page="/jsp/template/menu.jsp"/>
        <h1>TIPOS DE EMPLEADOS</h1>
        <div class="container">
            <form action="../CreateTipoServlet" method="POST">
                <div style="margin-top: 2.5%;margin-left: 15%; max-width: 600px">
                    <h1>INGRESAR TIPOS</h1>
                    <div class="row">
                        <div class="form-group col-sm-12">                        
                            <input type="text" class="form-control" id="txt-id" placeholder="ID"
                                   name="id">
                        </div>
                    </div>
                    <div class="row">
                        <div class="form-group col-sm-12">                        
                            <input type="text" class="form-control" id="txt-nombre" placeholder="NOMBRE"
                                   name="nombre">
                        </div>
                    </div>
<!--                    <div class="row">
                        <div class="form-group col-sm-12">                        
                            <input type="text" class="form-control" id="txt-descripcion" placeholder="DESCRIPCION"
                                   name="descripcion">
                        </div>
                    </div>-->
                    <div class="row">
                        <div class="form-group col-sm-8">                        
                        </div>                 
                        <div class="form-group col-sm-4">                        
                            <button id="bnt-calcular" type="submit" 
                                    class="btn btn-success col-sm-12">CREATE</button>
                        </div>
                    </div>
                    <div class="row">
                        <c:if test="${not empty sessionScope.errorCreateTipo}">
                            <div id="msg-error" class="form-group col-sm-12 btn btn-danger" style="font-size: 10px !important">
                                ${sessionScope.errorCreateTipo}
                            </div>                    
                        </c:if>
                    </div>    
                </div>
                <div style="margin-top: 2.5%;margin-left: 8%;max-width:800px">
                    <div class="row">
                        <table class="table table-striped">
                            <thead>
                                <tr>
                                    <th scope="col">ID</th>
                                    <th scope="col">NOMBRE</th>
                                    <th scope="col">DESCRIPCION</th>
                                </tr>
                            </thead>
                            <c:forEach var="tipo" items="${tipos}" varStatus="i">
                                <tr>
                                    <td>
                                        <input type="text" class="form-control" id="txt-id-${i.count}"
                                               placeholder="ID" value="${tipo.id}" disabled="true"
                                               name="id" style="font-size: 8px !important">                                    
                                    </td>
                                    <td>
                                        <input type="text" class="form-control" id="txt-nombre-${i.count}"
                                               placeholder="ID" value="${tipo.nombre}" disabled="true"
                                               name="id" style="font-size: 8px !important">                                        
                                    </td> 
<!--                                    <td>
                                        <input type="text" class="form-control" id="txt-descripcion-${i.count}"
                                               placeholder="ID" value="${tipo.descripcion}" disabled="true"
                                               name="id" style="font-size: 8px !important">                                      
                                    </td>-->
                                    <td>
                                        <button id="bnt-edit-${i.count}" type="button" 
                                                onclick="edit('${i.count}')"
                                                class="btn btn-warning col-sm-5">EDIT</button>    
                                        <button id="bnt-delete-${i.count}" type="button" 
                                                onclick="deleteRow('${i.count}')"                                               
                                                class="btn btn-danger col-sm-5">DELETE</button>  
                                        <button id="bnt-save-${i.count}" type="button"
                                                onclick="saveRow('${i.count}')"                                                
                                                class="btn btn-success col-sm-5" hidden="true">SAVE</button>    
                                        <button id="bnt-cancel-${i.count}" type="button"
                                                onclick="cancelRow('${i.count}')"                                                
                                                class="btn btn-danger col-sm-5" hidden="true">CANCEL</button>                                      
                                    </td>                                   
                                </tr>
                            </c:forEach>
                        </table>
                    </div>
                </div>
            </form>
        </div>
    </body>
    <script src="../js/tipo.js"></script>
</html>
