package controller;

import java.io.IOException;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entities.Empleado;
import model.EmpleadoDAO;

/**
 * Servlet implementation class ActualizarEmpleado
 */
@WebServlet("/ActualizarEmpleado")
public class ActualizarEmpleado extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private EmpleadoDAO empleadoDAO;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ActualizarEmpleado() {
        super();
        empleadoDAO=new EmpleadoDAO();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-mm-dd");
		String codigo=request.getParameter("codigo");
//	Empleado empleado=	empleadoDAO.find(codigo);
		Empleado empleado=new Empleado();
	empleado.setCedula(request.getParameter("cedula"));
	empleado.setNombre(request.getParameter("nombre"));
	empleado.setCodigo(codigo);	
	

	
	
	
		String fechaingreso=request.getParameter("fechaingreso");
	    String fechanacimiento=request.getParameter("fechanacimiento");
		String fecharetiro=request.getParameter("fecharetiro");
		try {
			java.sql.Date fechai=convert(sd.parse(fechaingreso));
			empleado.setFechaingreso(fechai);
			
			java.sql.Date fechan=convert(sd.parse(fechanacimiento));
			empleado.setFechanacimiento(fechan);
			
			java.sql.Date fechar=convert(sd.parse(fecharetiro));
			empleado.setFecharetiro(fechar);
			
			
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//	try {
//		empleado.setFechanacimiento(  sd.parse(fechanacimiento) );
//		empleado.setFechaingreso ( sd.parse(fechaingreso));
//			
//		empleado.setFecharetiro ( sd.parse(fecharetiro));
//		
//		
//	} catch (ParseException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//		}

	empleadoDAO.update(empleado);	
	response.sendRedirect("formEmpleado.jsp");
	
		System.out.println(request.getParameter("fechaingreso"));
	
	
//	request.getRequestDispatcher("formEmpleado.jsp").forward(request, response);;
	}
	
	
	 private static java.sql.Date convert(java.util.Date uDate) {
	        java.sql.Date sDate = new java.sql.Date(uDate.getTime());
	        return sDate;
	    }

}
