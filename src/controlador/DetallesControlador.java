package controlador;

import java.util.ArrayList;

import modelo.DetallesPedido;
import modelo.DetallesPedidoModelo;
import modelo.Producto;
import modelo.ProductoModelo;

//public class DetallesControlador {
//	private DetallesPedidoModelo detallesPedidoModelo;
//	private ProductoModelo productoModelo;
//	
//	public void mostrarDetallesDePedido(int idPedido){
//		//pedidoaren detalleak lortu
//		ArrayList<DetallesPedido> detaileak = this.detallesPedidoModelo.selectPedidoPorId(idPedido);
//		//pedido bakoitzari artikulua bete
//		for(DetallesPedido detallesPedido: detaileak){
//			Producto producto = this.productoModelo.select(detallesPedido.getIdProducto());
//			detallesPedido.setProducto(producto);
//		}
//		
//	//detaileak taulan erakutsi (artikulu izena, kopurua, prezioa)
//		this.bezeroarenEskariakErakutzi.detalleTaulaBete(detaileak);
//	}
//
//}
