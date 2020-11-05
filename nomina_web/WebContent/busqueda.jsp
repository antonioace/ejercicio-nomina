<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>

 <nav class="navbar navbar-expand-md navbar-dark" style="background-color: tomato">
                    <div>
                        <a href="" class="navbar-brand"> Administracion de nomina</a>
                    </div>

                    
                </nav>
            </header>
<div class="container">
<span>

<form action="${pageContext.request.contextPath}/BuscarEmpleado?accion=mostrar&codigo=${empleado.codigo}" method="get" >
<p> Codigo </p>
 <input type="text"  class="form-control col-md-3" name="codigo">


 <%-- <a href="${pageContext.request.contextPath}/BuscarEmpleado?accion=buscar&codigo=${empleado.codigo}"  class="btn btn-primary">Buscar</a> --%>
 <button class="btn btn-primary" type=submit >Buscar</button>
 <a href="${pageContext.request.contextPath}/MostrarForm?accion=ir" class="btn btn-primary">Registrar</a>
<%--     <a href="${pageContext.request.contextPath}/MostrarForm?accion=ir" class="btn btn-primary">Registrar</a> --%>
</form>
 
</span>


</div>
</body>
</html>