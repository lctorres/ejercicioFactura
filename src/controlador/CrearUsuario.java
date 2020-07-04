package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UsuarioDao;
import modelo.Usuario;

/**
 * Servlet implementation class CrearUsuario
 */
@WebServlet("/CrearUsuario")
public class CrearUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrearUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.getRequestDispatcher("CreacionUsuario.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		String nombre = request.getParameter("txtnombre");
		String fecha = request.getParameter("txtfecha");
		String concepto = request.getParameter("txtconcepto");
		String cantidad = request.getParameter("txtcantidad");
		String precio = request.getParameter("txtprecio");
		String subtotal = request.getParameter("txtsubtotal");
		String iva = request.getParameter("txtiva");
		String total = request.getParameter("txttotal");

		Usuario user = new Usuario(nombre, fecha, concepto, cantidad, precio, subtotal, iva, total);
		
		UsuarioDao userdao = new UsuarioDao();
		boolean agregar = userdao.crearUsuario(user);
		
		String mensaje = "";
		
		if (agregar)
			mensaje = "El usuario se ha creado exitosamente";
		else
			mensaje = "Ocurrió un error al crear el usuario";
		
		request.setAttribute("cumensaje", mensaje);
		request.getRequestDispatcher("CreacionUsuario.jsp").forward(request, response);
		
	}

}
