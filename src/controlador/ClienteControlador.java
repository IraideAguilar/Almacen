/**
 * 
 */
package controlador;

import java.util.ArrayList;

import modelo.Cliente;
import modelo.ClienteModelo;
import modelo.DetallesPedido;
import modelo.DetallesPedidoModelo;
import modelo.Pedido;
import modelo.PedidoModelo;
import modelo.ProductoModelo;
import vista.BezeroFormulario;
import vista.BezeroKudeatzailea;
import vista.BezeroarenEskariakErakutzi;
import vista.BorrarCliente;
import vista.Nagusia;
import vista.ProduktuFormulario;
import vista.ProduktuKudeaketa;

/**
 * @author enautirakasle
 * 24 mar. 2017
 */

public class ClienteControlador {

	//TODO atributuak jarri
	private BezeroFormulario bezeroFormulario;
	private BezeroKudeatzailea bezeroKudeatzailea;
	private Nagusia nagusia;
	private ClienteModelo clienteModelo;
	private BorrarCliente borrarCliente;
	private BezeroarenEskariakErakutzi bezeroarenEskariaErakutzi;
	private PedidoModelo pedidoModelo;
	private DetallesPedidoModelo detallesPedidoModelo;
	
	
	
	public PedidoModelo getPedidoModelo() {
		return pedidoModelo;
	}

	public void setPedidoModelo(PedidoModelo pedidoModelo) {
		this.pedidoModelo = pedidoModelo;
	}

	public BezeroarenEskariakErakutzi getBezeroarenEskariaErakutzi() {
		return bezeroarenEskariaErakutzi;
	}

	public void setBezeroarenEskariaErakutzi(BezeroarenEskariakErakutzi bezeroarenEskariaErakutzi) {
		this.bezeroarenEskariaErakutzi = bezeroarenEskariaErakutzi;
	}

	public void zabalduBezeroKuedeatzailea(){
		//TODO bezero kudeatzailea leihoa zabaldu
		this.bezeroKudeatzailea.setVisible(true);
	}
	
	public void zabalduBezeroFormularioa(){
		//TODO bezero formularioa zabaldu
		this.bezeroFormulario.setVisible(true);
	}

	public BezeroFormulario getBezeroFormulario() {
		return bezeroFormulario;
	}

	public void setBezeroFormulario(BezeroFormulario bezeroFormulario) {
		this.bezeroFormulario = bezeroFormulario;
	}

	public BezeroKudeatzailea getBezeroKudeatzailea() {
		return bezeroKudeatzailea;
	}

	public void setBezeroKudeatzailea(BezeroKudeatzailea bezeroKudeatzailea) {
		this.bezeroKudeatzailea = bezeroKudeatzailea;
	}

	public Nagusia getNagusia() {
		return nagusia;
	}

	public void setNagusia(Nagusia nagusia) {
		this.nagusia = nagusia;
	}

	public ClienteModelo getClienteModelo() {
		return clienteModelo;
	}

	public void setClienteModelo(ClienteModelo clienteModelo) {
		this.clienteModelo = clienteModelo;
	}
	
	
	public BorrarCliente getBorrarCliente() {
		return borrarCliente;
	}

	public void setBorrarCliente(BorrarCliente borrarCliente) {
		this.borrarCliente = borrarCliente;
	}

	public void itxiBezeroFormulario() {
		// TODO Apéndice de método generado automáticamente
		this.bezeroFormulario.dispose();
	}

	public void guardarCliente(String id, String nombre, String telefono, String direccion, String codPostal) {
		
		Cliente cliente = new Cliente();
		
		cliente.setId(id);
		cliente.setNombre(nombre);
		cliente.setTelefono(telefono);
		cliente.setDireccion(direccion);
		cliente.setCodPostal(codPostal);
		this.clienteModelo.insert(cliente);
		
	}

	public void abrirBorrarFormulario() {
		
		ArrayList<Cliente> clientes = this.clienteModelo.selectAll();
		borrarCliente.conboBoxBete(clientes);
		
		this.borrarCliente.setVisible(true);		
	}

	public void zabalduBezeroarenEskaria() {
		// TODO Apéndice de método generado automáticamente
		ArrayList<Cliente> clientes = this.clienteModelo.selectAll();
		this.bezeroarenEskariaErakutzi.tablaOsotu(clientes);
		
		this.bezeroarenEskariaErakutzi.setVisible(true);
		
	}

	public void pedidoarenDatuakErakutzi(String idCliente, String nombre, String telefono) {
		// TODO Apéndice de método generado automáticamente
		// TODO Apéndice de método generado automáticamente
        // pedidoarekin detalleak atera
		ArrayList<Pedido> pedidos = pedidoModelo.selectPedidosPorId(idCliente);
		
		for(Pedido pedido: pedidos){
			ArrayList<DetallesPedido> detallesPedido = this.detallesPedidoModelo.selectPedidoPorId(pedido.getId());
			pedido.setDetallesPedidos(detallesPedido);
		}
		// bistaratu pedidoak
		bezeroarenEskariaErakutzi.rellenarTablaConPedidosCliente(pedidos);
		// biztaratu bezeroak
	}

	public DetallesPedidoModelo getDetallesPedidoModelo() {
		return detallesPedidoModelo;
	}

	public void setDetallesPedidoModelo(DetallesPedidoModelo detallesPedidoModelo) {
		this.detallesPedidoModelo = detallesPedidoModelo;
	}

	

	
}
