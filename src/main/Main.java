package main;

import controlador.ClienteControlador;
import controlador.ProductoControlador;
import modelo.ClienteModelo;
import modelo.ProductoModelo;
import vista.BezeroFormulario;
import vista.BezeroKudeatzailea;
import vista.Nagusia;
import vista.ProduktuFormulario;
import vista.ProduktuKudeaketa;

public class Main {

	public static void main(String[] args) {
		//TODO ondorengo komentarioeta jartzen duena bete
		
		//kontroladore eta modeloen instantziak sortu
		ClienteControlador clienteControlador = new ClienteControlador();
		ProductoControlador productoControlador = new ProductoControlador();
		ClienteModelo clienteModelo = new ClienteModelo();
		ProductoModelo productoModelo = new ProductoModelo();
		
	
		//lehioak sortu
		Nagusia nagusia = new Nagusia();
		BezeroKudeatzailea bezeroKudeatzailea= new BezeroKudeatzailea(nagusia,true);
		BezeroFormulario bezeroFormulario = new BezeroFormulario(bezeroKudeatzailea,true);
		ProduktuFormulario produktuFomulario = new ProduktuFormulario();
		ProduktuKudeaketa produktuKudeatzailea = new ProduktuKudeaketa();
		
		//leihoei controladoreak ezarri
		nagusia.setClienteControlador(clienteControlador);
		bezeroKudeatzailea.setClienteControlador(clienteControlador);
		bezeroFormulario.setClienteControlador(clienteControlador);
		
		
		//controladoreei modelo eta lehioak ezarri
		
	}

}
