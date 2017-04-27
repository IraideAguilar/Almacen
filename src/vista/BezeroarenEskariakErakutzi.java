package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.ClienteControlador;
import controlador.PedidoControlador;
import modelo.ClienteModelo;
import modelo.DetallesPedidoModelo;
import modelo.PedidoModelo;

public class BezeroarenEskariakErakutzi extends JDialog {
	private ClienteControlador clienteControlador;
	private ClienteModelo clienteModelo;
	private PedidoControlador pedidoControlador;
	private PedidoModelo pedidoModelo;
	private DetallesPedidoModelo detallesPedidoModelo;




	public ClienteControlador getClienteControlador() {
		return clienteControlador;
	}


	public void setClienteControlador(ClienteControlador clienteControlador) {
		this.clienteControlador = clienteControlador;
	}


	public ClienteModelo getClienteModelo() {
		return clienteModelo;
	}


	public void setClienteModelo(ClienteModelo clienteModelo) {
		this.clienteModelo = clienteModelo;
	}


	public PedidoControlador getPedidoControlador() {
		return pedidoControlador;
	}


	public void setPedidoControlador(PedidoControlador pedidoControlador) {
		this.pedidoControlador = pedidoControlador;
	}


	public PedidoModelo getPedidoModelo() {
		return pedidoModelo;
	}


	public void setPedidoModelo(PedidoModelo pedidoModelo) {
		this.pedidoModelo = pedidoModelo;
	}


	public DetallesPedidoModelo getDetallesPedidoModelo() {
		return detallesPedidoModelo;
	}


	public void setDetallesPedidoModelo(DetallesPedidoModelo detallesPedidoModelo) {
		this.detallesPedidoModelo = detallesPedidoModelo;
	}


	public JPanel getContentPanel() {
		return contentPanel;
	}


	private final JPanel contentPanel = new JPanel();

	
	public BezeroarenEskariakErakutzi(JDialog modal, boolean parent) {
		super(modal,parent);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
	}

}
