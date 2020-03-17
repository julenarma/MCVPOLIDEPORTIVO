package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.bean.Actividad;
import modelo.dao.ModeloActividad;
import java.util.ArrayList;
/**
 * Servlet implementation class VerActividades
 */
@WebServlet("/VerActividades")
public class VerActividades extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VerActividades() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		ModeloActividad mActividades= new ModeloActividad();
		
      //Guardar en un arraylist el selectAll
		
		
	ArrayList<Actividad> actividades= mActividades.selectAll();
		
	   //Dar valor a actividades
		request.setAttribute("actividades", actividades);
		
		//Abrir jsp
		
		request.getRequestDispatcher("verActividades.jsp").forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
