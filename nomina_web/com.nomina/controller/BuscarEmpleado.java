package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import entities.Empleado;
import model.EmpleadoDAO;

/**
 * Servlet implementation class BuscarEmpleado
 */
@WebServlet("/BuscarEmpleado")
public class BuscarEmpleado extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private EmpleadoDAO empleadoDAO;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuscarEmpleado() {
        super();
        empleadoDAO=new EmpleadoDAO();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Empleado empleado = new Empleado();
		String codigo=request.getParameter("codigo");
		empleado.setCodigo(codigo);
		System.out.println(request.getParameter("codigo"));
		EmpleadoDAO empleadoDao = new EmpleadoDAO();
		
		Empleado aux = empleadoDao.find(empleado.getCodigo());
		request.getSession().setAttribute("empleado", aux);
		RequestDispatcher r = getServletContext().getRequestDispatcher("/formEmpleado.jsp");
		r.forward(request, response);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
