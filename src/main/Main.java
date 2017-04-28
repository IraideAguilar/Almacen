package main;

import controlador.ClienteControlador;
import controlador.PedidoControlador;
import controlador.ProductoControlador;
import modelo.ClienteModelo;
import modelo.DetallesPedidoModelo;
import modelo.PedidoModelo;
import modelo.ProductoModelo;
import vista.BezeroFormulario;
import vista.BezeroKudeatzailea;
import vista.BezeroarenEskariakErakutzi;
import vista.BorrarCliente;
import vista.EskariKudatzailea;
import vista.EskariaListatu;
import vista.Nagusia;
import vista.ProduktuFormulario;
import vista.ProduktuKudeaketa;

public class Main {

	public static void main(String[] args) {
		
		//kontroladore eta modeloen instantziak sortu
		
		ClienteControlador clienteControlador = new ClienteControlador();
		ProductoControlador productoControlador = new ProductoControlador();
		ClienteModelo clienteModelo = new ClienteModelo();
		ProductoModelo productoModelo = new ProductoModelo();
		PedidoModelo pedidoModelo = new PedidoModelo();
		DetallesPedidoModelo detallesPedidoModelo = new DetallesPedidoModelo();
		PedidoControlador pedidoControlador = new PedidoControlador();
		
		
		//lehioak sortu
		Nagusia nagusia = new Nagusia();
		BezeroKudeatzailea bezeroKudeatzailea = new BezeroKudeatzailea(nagusia,true);
		BezeroFormulario bezeroFormulario = new BezeroFormulario(bezeroKudeatzailea,true);
		ProduktuFormulario produktuFormulario = new ProduktuFormulario();
		ProduktuKudeaketa produktuKudeaketa = new ProduktuKudeaketa();
		BorrarCliente borrarCliente = new BorrarCliente(bezeroKudeatzailea,true);
		EskariKudatzailea eskariKudatzailea = new EskariKudatzailea(nagusia,true);
		EskariaListatu eskariaListatu = new EskariaListatu(eskariKudatzailea,true);
		BezeroarenEskariakErakutzi bezeroarenEskariakErakutzi = new BezeroarenEskariakErakutzi(bezeroKudeatzailea,true);
		
		//leihoei controladoreak ezarri
	
		bezeroFormulario.setClienteControlador(clienteControlador);
		bezeroFormulario.setProductoControlador(productoControlador);
		bezeroKudeatzailea.setClienteControlador(clienteControlador);
		bezeroKudeatzailea.setProductoControlador(productoControlador);
		
		
		nagusia.setClienteControlador(clienteControlador);
		nagusia.setProductoControlador(productoControlador);
		nagusia.setPedidoControlador(pedidoControlador);
		
		produktuFormulario.setClienteControlador(clienteControlador);
		produktuFormulario.setProductoControlador(productoControlador);
		produktuKudeaketa.setClienteControlador(clienteControlador);
		produktuKudeaketa.setProductoControlador(productoControlador);
		
		borrarCliente.setClientecontrolador(clienteControlador);
		
		eskariKudatzailea.setPedidoControlador(pedidoControlador);
		
		eskariaListatu.setPedidoControlador(pedidoControlador);
		
		
		bezeroarenEskariakErakutzi.setPedidoControlador(pedidoControlador);
		bezeroarenEskariakErakutzi.setClienteControlador(clienteControlador);
		
		//controladoreei modelo eta lehioak ezarri
		
		clienteControlador.setClienteModelo(clienteModelo);
		clienteControlador.setBezeroFormulario(bezeroFormulario);
		clienteControlador.setBezeroKudeatzailea(bezeroKudeatzailea);
		clienteControlador.setNagusia(nagusia);
		clienteControlador.setBorrarCliente(borrarCliente);
		clienteControlador.setBezeroarenEskariaErakutzi(bezeroarenEskariakErakutzi);
		clienteControlador.setPedidoModelo(pedidoModelo);
		clienteControlador.setDetallesPedidoModelo(detallesPedidoModelo);
		
		pedidoControlador.setEskariKudatzailea(eskariKudatzailea);
		pedidoControlador.setEskariaListatu(eskariaListatu);
		pedidoControlador.setNagusia(nagusia);
		pedidoControlador.setPedidoModelo(pedidoModelo);
		pedidoControlador.setDetallesPedidoModelo(detallesPedidoModelo);
		pedidoControlador.setClienteModelo(clienteModelo);
		pedidoControlador.setBezeroarenEskariakErakutzi(bezeroarenEskariakErakutzi);
		
		
		nagusia.setVisible(true);
		
		
		
	}

}
