<%-- 
    Document   : mantenedor-empleado
    Created on : 24-10-2019, 20:38:10
    Author     : boyarce
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MANTENEDOR EMPLEADO</title>
        <jsp:include page="/jsp/template/header.jsp"/>

    </head>
    <body>
        <jsp:include page="/jsp/template/menu.jsp"/>
        <h1>MANTENEDOR EMPLEADO</h1>
        <div class="container">
            <form id="frm-empleado" action="../CreateEmpleadoServlet" method="POST">
                <div style="margin-top: 2.5%;margin-left: 15%; max-width: 600px">
                    <h1>CREAR EMPLEADO</h1>
                    <div class="row">
                        <div class="form-group col-sm-12">                        
                            <input type="text" class="form-control" id="txt-rut" 
                                   required oninput="checkRut(this)" 
                                   placeholder="RUN" maxlength="18"
                                   name="rut">
                        </div>
                    </div>
                    <div class="row">
                        <div class="form-group col-sm-12">                        
                            <input type="text" class="form-control" id="txt-nombre"
                                   required
                                   placeholder="NOMBRE" maxlength="60"
                                   name="nombre">
                        </div>
                    </div>
                    <div class="row">
                        <div class="form-group col-sm-12">                        
                            <input type="text" class="form-control" id="txt-apa" 
                                   required
                                   placeholder="APELLIDO PATERNO" maxlength="60"
                                   name="apa">
                        </div>
                    </div>
                    <div class="row">
                        <div class="form-group col-sm-12">                        
                            <input type="text" class="form-control" id="txt-ama" 
                                   required
                                   placeholder="APELLIDO MATERNO" maxlength="60"
                                   name="ama">
                        </div>
                    </div>
                    <div class="row">
                        <div class="form-group col-sm-12">                        
                            <select name="cmb-tipos" class="form-control form-control-sm">
                                <c:forEach var="tipo" items="${tipos}" varStatus="i">
                                    <c:if test="${tipo.id == empleado.tipo.id}">
                                        <option value="${tipo.id}">${tipo.nombre}</option>
                                    </c:if>
                                    <c:if test="${tipo.id != empleado.tipo.id}">
                                        <option value="${tipo.id}">${tipo.nombre}</option>
                                    </c:if> 
                                </c:forEach>
                            </select>
                        </div>
                    </div>     
                    <div class="row">
                        <div class="form-group col-sm-12">                        
                            <input type="text" class="form-control" id="txt-telefono" 
                                   required
                                   placeholder="TELEFONO" maxlength="9"
                                   name="telefono">
                        </div>
                    </div>
                    <div class="row">
                        <div class="form-group col-sm-12">                        
                            <input type="text" class="form-control" id="txt-remuneracion" 
                                   required
                                   placeholder="REMUNERACION" maxlength="9"
                                   name="remuneracion">
                        </div>
                    </div>
                    <div class="row">
                        <div class="form-group col-sm-12">                        
                            <input type="date" class="form-control" id="dt-fecha" 
                                   required
                                   max="2001-09-27"
                                   name="fecha">
                        </div>
                    </div>
                    <div class="row">
                        <div class="form-group col-sm-12">                        
                            <input type="text" class="form-control" id="txt-direccion" 
                                   required
                                   placeholder="DIRECCION" maxlength="280"
                                   name="direccion">
                        </div>
                    </div>
                    <div class="row">
                        <div class="form-group col-sm-12">                        
                            <input type="text" class="form-control" id="txt-correo" 
                                   placeholder="CORREO ELECTRONICO" maxlength="100"
                                   required
                                   name="correo">
                        </div>
                    </div>
                    <div class="row">
                        <div class="form-group col-sm-8">                        
                        </div>                 
                        <div class="form-group col-sm-4">                        
                            <button id="bnt-calcular" type="submit" 
                                    class="btn btn-success col-sm-12">CREATE</button>
                        </div>
                    </div>
                    <script src="../js/rut.js"></script>
                    <div class="row">
                        <c:if test="${not empty sessionScope.errorCreateEmpleado}">
                            <div id="msg-error" class="form-group col-sm-12 btn btn-danger" style="font-size: 10px !important">
                                ${sessionScope.errorCreateEmpleado}
                            </div>                    
                        </c:if>
                    </div>     
                </div>
                <div style="margin-top: 1%;margin-left: 5%;max-width:800px">
                    <div class="row">
                        <table class="table table-striped">
                            <thead>
                                <tr>
                                    <th scope="col">RUN</th>
                                    <th scope="col">NOMBRE</th>
                                    <th scope="col">APELLIDO PATERNO</th>
                                    <th scope="col">APELLIDO MATERNO</th>
                                    <th scope="col">TIPO EMPLEADO</th>
                                    <th scope="col">TELEFONO</th>
                                    <th scope="col">REMUNERACION</th>
                                    <th scope="col">FECHA NACIMIENTO</th>
                                    <th scope="col">DIRECCION</th>
                                    <th scope="col">CORREO ELECTRONICO</th>
                                </tr>
                            </thead>
                            <c:forEach var="empleado" items="${empleados}" varStatus="i">
                                <tr>
                                    <td>
                                        <input type="text" class="form-control" id="txt-run-${i.count}"
                                               placeholder="RUN" value="${empleado.run}" disabled="true"
                                                style="font-size: 8px !important">                                    
                                    </td>
                                    <td>
                                        <input type="text" class="form-control" id="txt-nombre-${i.count}"
                                               placeholder="NOMBRE" value="${empleado.numbre}" disabled="true"
                                                style="font-size: 8px !important">                                        
                                    </td> 
                                    <td>
                                        <input type="text" class="form-control" id="txt-apa-${i.count}"
                                               placeholder="APELLIDO PATERNO" value="${empleado.apa}" disabled="true"
                                                style="font-size: 8px !important">                                        
                                    </td> 
                                    <td>
                                        <input type="text" class="form-control" id="txt-ama-${i.count}"
                                               placeholder="APELLIDO MATERNO" value="${empleado.ama}" disabled="true"
                                                style="font-size: 8px !important">                                        
                                    </td> 
                                    <td>
                                       <select id="cmb-tipos-${i.count}" name="cmb-tipos-${i.count}" class="form-control form-control-sm" disabled="true" style="font-size: 8px !important">
                                            <c:forEach var="tipo" items="${tipos}" varStatus="j">
                                                <c:if test="${tipo.id == empleado.tipo.id}">
                                                    <option value="${tipo.id}" selected="true">${tipo.nombre}</option>
                                                </c:if>
                                                <c:if test="${tipo.id != empleado.tipo.id}">
                                                    <option value="${tipo.id}">${tipo.nombre}</option>
                                                </c:if>                        
                                            </c:forEach>
                                        </select>                          
                                    </td>  
                                    
                                    <td>
                                        <input type="text" class="form-control" id="txt-telefono-${i.count}"
                                               placeholder="TELEFONO" value="${empleado.telefono}" disabled="true"
                                               style="font-size: 8px !important">                                        
                                    </td> 
                                    <td>
                                        <input type="text" class="form-control" id="txt-remuneracion-${i.count}"
                                               placeholder="REMUNERACION" value="${empleado.remuneracion}" disabled="true"
                                                style="font-size: 8px !important">                                        
                                    </td> 
                                    <td>
                                        <input type="date" class="form-control" id="txt-fecha-${i.count}"
                                                value="${empleado.fecha}" disabled="true"
                                                style="font-size: 8px !important">                                        
                                    </td> 
                                    <td>
                                        <input type="text" class="form-control" id="txt-direccion-${i.count}"
                                               placeholder="DIRECCION" value="${empleado.direccion}" disabled="true"
                                                style="font-size: 8px !important">                                        
                                    </td> 
                                    <td>
                                        <input type="text" class="form-control" id="txt-correo-${i.count}"
                                               placeholder="CORREO" value="${empleado.correo}" disabled="true"
                                                style="font-size: 8px !important">                                        
                                    </td> 
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
    <script src="../js/empleado.js" ></script>
</html>
