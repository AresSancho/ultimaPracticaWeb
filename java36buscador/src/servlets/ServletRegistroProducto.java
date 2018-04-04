package servlets;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import modelo.Producto;
import daos.ProductosDAO;
import daosImpl.ProductosDAOImpl;


@WebServlet("/ServletRegistroProducto")
@MultipartConfig
public class ServletRegistroProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//que no se nos olvide marcar este servlet como @MultipartConfig
		//asi indicamos a java que este servlet va a recibir archivos
		String nombre = request.getParameter("campoNombre");
		String precio = request.getParameter("campoPrecio");
		String idCategoria = 
				request.getParameter("campoIdCategoria");
		Part imagen = request.getPart("campoImagen");
		
		//faltaria parte de validacion
		
		Producto productoAregistrar = 
				new Producto(nombre, Double.parseDouble(precio), 
						imagen, Long.parseLong(idCategoria));
		
		ProductosDAO dao = new ProductosDAOImpl();
		dao.registrarProducto(productoAregistrar);
		System.out.println("producto registrado ok");
		
	}//end doPost

}




