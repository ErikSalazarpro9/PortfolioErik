package net.controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.UsuarioDTO;
import Model.ConexionMySQL;
import Model.DAOUsuario;

 import net.controlador.*;


/**
 * Servlet implementation class servletIngresarUsuario
 */
public class servletIngresarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public servletIngresarUsuario() {
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
		// TODO Auto-generated method stub
		
		doGet(request, response);
		String nombre= request.getParameter("nombreUsuario");
		String contraseña = request.getParameter("contraseña");
		String correo = request.getParameter("correo");
		String telefono= request.getParameter("telfono");
		
		UsuarioDTO usuarioDTO= new UsuarioDTO();
		usuarioDTO.setNombre(nombre);
		usuarioDTO.setContrasena(contraseña);
		usuarioDTO.setCorreo(correo);
		usuarioDTO.setTelefono(telefono);
		
		try{
			Connection conn = ConexionMySQL.getConexionUnica
			("localhost", "zapato", "root", "fenix123");
			
			
			DAOUsuario usuarioDAO = new DAOUsuario(conn);
			int idPersona = usuarioDAO.insertarUsuario(usuarioDTO);
			usuarioDTO.setIdUsuario(idPersona);
			
			System.out.println
			("Se inserto correctamente la persona, con el id:" + idPersona);
			
			
			request.setAttribute("usuarioaDTO", usuarioDTO);
			
			/*
			RequestDispatcher view = request.getRequestDispatcher("resultado.jsp");
			view.forward(request, response);
			*/
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		
		
	}

}
