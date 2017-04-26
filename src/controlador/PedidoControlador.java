package controlador;

import java.util.ArrayList;

import modelo.Cliente;
import modelo.ClienteModelo;
import modelo.DetallesPedido;
import modelo.DetallesPedidoModelo;
import modelo.Pedido;
import modelo.PedidoModelo;
import vista.EskariKudatzailea;
import vista.EskariaListatu;
import vista.Nagusia;

public class PedidoControlador {
	
	private Nagusia nagusia;
	private EskariKudatzailea eskariKudatzailea;
	private EskariaListatu eskariaListatu;
	private PedidoModelo pedidoModelo;
	private ClienteModelo clienteModelo;
	private DetallesPedidoModelo detallesPedidoModelo;
	
	public PedidoModelo getPedidoModelo() {
		return pedidoModelo;
	}
	public void setPedidoModelo(PedidoModelo pedidoModelo) {
		this.pedidoModelo = pedidoModelo;
	}
	public Nagusia getNagusia() {
		return nagusia;
	}
	public void setNagusia(Nagusia nagusia) {
		this.nagusia = nagusia;
	}
	public EskariKudatzailea getEskariKudatzailea() {
		return eskariKudatzailea;
	}
	public void setEskariKudatzailea(EskariKudatzailea eskariKudatzailea) {
		this.eskariKudatzailea = eskariKudatzailea;
	}
	public EskariaListatu getEskariaListatu() {
		return eskariaListatu;
	}
	public void setEskariaListatu(EskariaListatu eskariaListatu) {
		this.eskariaListatu = eskariaListatu;
	}
	public void zabalduEskariKudatzailea() {
		// TODO Auto-generated method stub
		this.eskariKudatzailea.setVisible(true);
	}
	public void zabalduEskariaListatu() {
		// TODO Auto-generated method stub
		ArrayList<Pedido> pedidos = this.pedidoModelo.select();
		this.eskariaListatu.tablaOsotu(pedidos);
		
		
		
		this.eskariaListatu.setVisible(true);
	}
	public void eskariarenDatuakIrakurri(int idPedido, String idCliente) {
		// TODO Apéndice de método generado automáticamente
        // IDpedidoarekin detalleak atera
		ArrayList<DetallesPedido> detallesPedido = detallesPedidoModelo.selectPedidoPorId(idPedido);
		// IDbezereoarekin bezeroaren datuak atera
		Cliente cliente = clienteModelo.select(idCliente);
		// bistaratu detalleak
		eskariaListatu.rellenarTablaDetallesPedido(detallesPedido);
		// biztaratu bezeroak
		eskariaListatu.rellenarTablaCamposCliente(cliente);
		
		
	}
	
	
	
	

}
