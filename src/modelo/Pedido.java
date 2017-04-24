package modelo;

import java.util.ArrayList;
import java.util.Date;

public class Pedido {
	
	private int id;
	private int idCliente;
	private Date fecha;
	private int codPostal;
	private Cliente cliente;
	
	
	
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	private ArrayList<DetallesPedido> detallesPedidos;
	
	
	public ArrayList<DetallesPedido> getDetallesPedidos() {
		return detallesPedidos;
	}

	public void setDetallesPedidos(ArrayList<DetallesPedido> detallesPedidos) {
		this.detallesPedidos = detallesPedidos;
	}

	public Pedido() {
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public int getCodPostal() {
		return codPostal;
	}
	public void setCodPostal(int codPostal) {
		this.codPostal = codPostal;
	}
	
	
	
	

}
