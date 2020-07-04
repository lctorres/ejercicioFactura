package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import idao.IUsuarioDao;
import modelo.Usuario;
import conectar.ConexionSingleton;

public class UsuarioDao implements IUsuarioDao {

	@Override
	public boolean crearUsuario(Usuario user) {
		// TODO Auto-generated method stub

		boolean registrar = false;
		
		Statement stm = null;
		Connection con = null;
		
		String sql = "INSERT INTO usuarios VALUES (null,'" + user.getNombre() + "','"+ user.getFecha()+"','"+user.getConcepto()+"','"+user.getCantidad()+"','"+user.getPrecio()+"','"+user.getSubtotal()+"','"+user.getIva()+"','"+user.getTotal()+"')";
		
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			stm.execute(sql);
			registrar = true;
			stm.close();
			//con.close();
		}catch(SQLException e) {
			System.out.println("Error: Clase UsuarioDao, método crearUsuario");
			e.printStackTrace();
		}
		
		return registrar;	
	
	}

	@Override
	public List<Usuario> leerUsuarios() {
		// TODO Auto-generated method stub

		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;
		
		String sql = "select * from usuarios ORDER BY ID";
		
		List<Usuario> listaUsuarios = new ArrayList<Usuario>();
		
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			while (rs.next()) {
				Usuario c = new Usuario();
				c.setId(rs.getInt(1));
				c.setNombre(rs.getString(2));
				c.setFecha(rs.getString(3));
				c.setConcepto(rs.getString(4));
				c.setCantidad(rs.getString(5));
				c.setPrecio(rs.getString(6));
				c.setSubtotal(rs.getString(7));
				c.setIva(rs.getString(8));
				c.setTotal(rs.getString(9));
				listaUsuarios.add(c);
			}
			stm.close();
			rs.close();
			//con.close();
		} catch(SQLException e) {
			System.out.println("Error: Clase UsuarioDao, método leerUsuarios ");
			e.printStackTrace();
		}
		
		return listaUsuarios;
	}

	@Override
	public boolean actualizarUsuario(Usuario user) {
		// TODO Auto-generated method stub

		Connection con = null;
		Statement stm = null;
		
		boolean actualizar = false;
		
		String sql = "UPDATE usuarios SET nombre = '" + user.getNombre() + "', fecha = '" + user.getFecha() + "', concepto = '" + user.getConcepto() + "', cantidad = '" + user.getCantidad() + "', precio = '" + user.getPrecio() + "', subtotal = '" + user.getSubtotal() + "', iva = '" + user.getIva() + "', total = '" + user.getTotal() + "' WHERE id = '" + user.getId() + "'";
		
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			stm.execute(sql);
			actualizar = true;
			stm.close();
			//con.close();
		}catch(SQLException e) {
			System.out.println("Error: Clase UsuarioDao, método actualizar");
			e.printStackTrace();
		}
		
		return actualizar;

	}

	@Override
	public boolean eliminarUsuario(Usuario user) {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement stm = null;
		
		boolean eliminar = false;
		
		String sql = "DELETE FROM usuarios WHERE id = " + user.getId();
		
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			stm.execute(sql);
			eliminar = true;
			stm.close();
			//con.close();
		}catch(SQLException e) {
			System.out.println("Error: Clase UsuarioDao, método eliminarUsuario");
			e.printStackTrace();
		}
		
		return eliminar;
	}

	@Override
	public Usuario obtenerUsuario(int idusuario) {
		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;
		
		String sql = "select * from usuarios where ID = " + idusuario;
		
		Usuario u = new Usuario();
		try {
			con = ConexionSingleton.getConnection();
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			while (rs.next()) {
				u.setId(rs.getInt(1));
				u.setNombre(rs.getString(2));
				u.setFecha(rs.getString(3));
				u.setConcepto(rs.getString(4));
				u.setCantidad(rs.getString(5));
				u.setPrecio(rs.getString(6));
				u.setSubtotal(rs.getString(7));
				u.setIva(rs.getString(8));
				u.setTotal(rs.getString(9));
			}
			stm.close();
			rs.close();
			//con.close();
		} catch(SQLException e) {
			System.out.println("Error: Clase UsuarioDao, método obtenerUsuario ");
			e.printStackTrace();
		}
		
		return u;
	}

	
	
}
