/**
 * 
 */
package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * @author enautirakasle
 * 24 mar. 2017
 */
public class ProductoModelo extends Conector{
	
	public ArrayList<Producto> selectAll() {
		//TODO produkutu guztiak itzuliko ditu
		return null;
	}
	
	public Producto select(int id){
		//TODO id hori duen produktua itzultzen du
		try {
			Statement st = this.conexion.createStatement();
			ResultSet rs = st.executeQuery("select * from socios where id='" + id + "'");
			rs.next();
			Producto producto = new Producto();
			producto.setId(id);
			producto.setNombre(rs.getString("nombre"));
			producto.setProveedor(rs.getString("proveedor"));
			producto.setPrecio(rs.getDouble("precio"));
			producto.setExistencias(rs.getInt("existencias"));
			return producto;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			return null;
	}
	
	public void update(Producto producto) {
		//TODO produktuaren id-a erabilita update egiten du
	}
	
	public void insert(Producto producto) {
		//TODO produktuaren insert egiten du
	}
	

	

}
