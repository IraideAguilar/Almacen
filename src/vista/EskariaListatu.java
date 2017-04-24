package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.PedidoControlador;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class EskariaListatu extends JDialog {

	private final JPanel contentPanel = new JPanel();
	
	private PedidoControlador pedidoControlador;
	
	
	
	public PedidoControlador getPedidoControlador() {
		return pedidoControlador;
	}



	public void setPedidoControlador(PedidoControlador pedidoControlador) {
		this.pedidoControlador = pedidoControlador;
	}



	private JTable table;
	private JTable table_1;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	

	/**
	 * Create the dialog.
	 */
	public EskariaListatu(JDialog parent, boolean modal) {
		super();
		setFont(new Font("Dialog", Font.PLAIN, 18));
		setBounds(100, 100, 650, 500);
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 634, 461);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(24, 50, 274, 163);
		contentPanel.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JLabel lblListadoDePedidos = new JLabel("LISTADO DE PEDIDOS");
		lblListadoDePedidos.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblListadoDePedidos.setBounds(84, 23, 162, 14);
		contentPanel.add(lblListadoDePedidos);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(364, 50, 239, 163);
		contentPanel.add(scrollPane_1);
		
		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);
		
		JLabel lblDetallesPedido = new JLabel("DETALLES PEDIDO");
		lblDetallesPedido.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDetallesPedido.setBounds(437, 25, 107, 14);
		contentPanel.add(lblDetallesPedido);
		
		JLabel lblClienteDelPedido = new JLabel("CLIENTE DEL PEDIDO SELECCIONADO");
		lblClienteDelPedido.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblClienteDelPedido.setBounds(38, 276, 239, 14);
		contentPanel.add(lblClienteDelPedido);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(38, 315, 46, 14);
		contentPanel.add(lblNombre);
		
		textField_1 = new JTextField();
		textField_1.setBounds(127, 312, 86, 20);
		contentPanel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblDireccin = new JLabel("Direcci\u00F3n");
		lblDireccin.setBounds(38, 346, 46, 14);
		contentPanel.add(lblDireccin);
		
		textField_2 = new JTextField();
		textField_2.setBounds(127, 343, 86, 20);
		contentPanel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("C\u00F3digo Postal");
		lblNewLabel.setBounds(38, 377, 78, 14);
		contentPanel.add(lblNewLabel);
		
		textField_3 = new JTextField();
		textField_3.setBounds(127, 374, 86, 20);
		contentPanel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(127, 409, 86, 20);
		contentPanel.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblTelfono = new JLabel("Tel\u00E9fono");
		lblTelfono.setBounds(38, 412, 78, 14);
		contentPanel.add(lblTelfono);
	}
}
