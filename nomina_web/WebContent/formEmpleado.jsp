<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
        <html>

        <head>
            <title>Administrcion de nomina</title>
            <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        </head>

        <body>

            <header>
                <nav class="navbar navbar-expand-md navbar-dark" style="background-color: tomato">
                    <div>
                        <a href="" class="navbar-brand"> Administracion de nomina</a>
                    </div>

                    
                </nav>
            </header>
            <br>
            <div class="container col-md-5">
                <div class="card">
                    <div class="card-body">
                        <c:if test="${empleado != null}">
                           <%--  <form action="${pageContext.request.contextPath}/ActualizarEmpleado?accion=edita&codigo=${empleado.codigo}"  method="post"> --%>
                           <form action="ActualizarEmpleado"  method="POST">
                        </c:if>
                        <c:if test="${empleado == null}">
                           <%--  <form action="${pageContext.request.contextPath}/AgregarEmpleado?accion=agregar&codigo=${empleado.codigo}"  method="POST"> --%>
                            <form action="AgregarEmpleado"  method="POST">
                        </c:if>

                        <caption>
                            <h2>
                                Registro Empleado
                            </h2>
                        </caption>

                        

                        <fieldset class="form-group">
                            <label>Codigo</label> <input type="text" value="<c:out value='${empleado.codigo}' />" class="form-control" name="codigo" required="required">
                        </fieldset>

                        <fieldset class="form-group">
                            <label>Cedula</label> <input type="text" value="<c:out value='${empleado.cedula}' />" class="form-control" name="cedula">
                        </fieldset>
                           <fieldset class="form-group">
                            <label>nombre</label> <input type="text" value="<c:out value='${empleado.nombre}' />" class="form-control" name="nombre">
                        </fieldset>
                        
                        <fieldset class="form-group">
                            <label>Fecha Nacimiento</label> <input type="text" value="<c:out value='${empleado.fechanacimiento}' />" class="form-control" name="fechanacimiento">
                        </fieldset>
                        
                        
                        <fieldset class="form-group">
                            <label>Fecha Ingreso</label> <input type="date" value="<c:out value='${empleado.fechaingreso}' />" class="form-control" name="fechaingreso">
                        </fieldset>
                        
                        <fieldset class="form-group">
                            <label>Fecha Retiro</label> <input type="text" value="<c:out value='${empleado.fecharetiro}' />" class="form-control" name="fecharetiro">
                        </fieldset>
                        

                        

                        <button type="submit" class="btn btn-success" >Registrar</button>
                        <a href="${pageContext.request.contextPath}/busqueda.jsp" class="btn btn-primary">Volver</a>
                        </form>
                    </div>
                </div>
            </div>
        </body>

        </html>