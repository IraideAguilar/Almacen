package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import controlador.PedidoControlador;
import modelo.Cliente;
import modelo.DetallesPedido;
import modelo.Pedido;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EskariaListatu extends JDialog {

	private final JPanel contentPanel = new JPanel();
	
	private PedidoControlador pedidoControlador;
	
	
	
	public PedidoControlador getPedidoControlador() {
		return pedidoControlador;
	}



	public void setPedidoControlador(PedidoControlador pedidoControlador) {
		this.pedidoControlador = pedidoControlador;
	}



	private JTable tablaPedidos;
	private JTable tablaDetallesPedido;
	private JTextField textFieldNombre;
	private JTextField textFieldDireccion;
	private JTextField textFieldCodPostal;
	private JTextField textFieldTelefono;

	

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
		
		tablaPedidos = new JTable();
		tablaPedidos.addMouseListener(new MouseAdapter() {
			@Override
			
			public void mouseClicked(MouseEvent arg0) {
				//taulatik ze lerro klikatu den jakin
				int aukeratutakoLerroa = tablaPedidos.getSelectedRow();
				//lerrotik,guk nahi ditugun zutabearen lerroa jaso
				int idPedido = (int)tablaPedidos.getModel().getValueAt(aukeratutakoLerroa, 0);
				String idCliente = (String)tablaPedidos.getModel().getValueAt(aukeratutakoLerroa, 1);
				//pedido eta bezero erakutzi
				pedidoControlador.eskariarenDatuakIrakurri(idPedido,idCliente);
				
			}
		});
		scrollPane.setViewportView(tablaPedidos);
		
		JLabel lblListadoDePedidos = new JLabel("LISTADO DE PEDIDOS");
		lblListadoDePedidos.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblListadoDePedidos.setBounds(84, 23, 162, 14);
		contentPanel.add(lblListadoDePedidos);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(364, 50, 239, 163);
		contentPanel.add(scrollPane_1);
		
		tablaDetallesPedido = new JTable();
		scrollPane_1.setViewportView(tablaDetallesPedido);
		
		JLabel lblDetallesPedido = new JLabel("DETALLES PEDIDO");
		lblDetallesPedido.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDetallesPedido.setBounds(437, 25, 107, 14);
		contentPanel.add(lblDetallesPedido);
		
		JLabel lblClienteDelPedido = new JLabel("CLIENTE DEL PEDIDO SELECCIONADO");
		lblClienteDelPedido.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblClienteDelPedido.setBounds(38, 276, 239, 14);
		contentPanel.add(lblClienteDelPedido);
		
		JLabel Nombre = new JLabel("Nombre");
		Nombre.setBounds(38, 315, 46, 14);
		contentPanel.add(Nombre);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(127, 312, 86, 20);
		contentPanel.add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		JLabel lblDireccin = new JLabel("Direcci\u00F3n");
		lblDireccin.setBounds(38, 346, 46, 14);
		contentPanel.add(lblDireccin);
		
		textFieldDireccion = new JTextField();
		textFieldDireccion.setBounds(127, 343, 86, 20);
		contentPanel.add(textFieldDireccion);
		textFieldDireccion.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("C\u00F3digo Postal");
		lblNewLabel.setBounds(38, 377, 78, 14);
		contentPanel.add(lblNewLabel);
		
		textFieldCodPostal = new JTextField();
		textFieldCodPostal.setBounds(127, 374, 86, 20);
		contentPanel.add(textFieldCodPostal);
		textFieldCodPostal.setColumns(10);
		
		textFieldTelefono = new JTextField();
		textFieldTelefono.setBounds(127, 409, 86, 20);
		contentPanel.add(textFieldTelefono);
		textFieldTelefono.setColumns(10);
		
		JLabel lblTelfono = new JLabel("Tel\u00E9fono");
		lblTelfono.setBounds(38, 412, 78, 14);
		contentPanel.add(lblTelfono);
	}



	public void tablaOsotu(ArrayList<Pedido> pedidos) {
		// TODO Apéndice de método generado automáticamente
		//tabla sortu
		DefaultTableModel tableModel = new DefaultTableModel();
		//kabezera sortu
		Object[] cabecera = { "id", "id_cliente", "fecha" };
		tableModel.setColumnIdentifiers(cabecera);
		
		//rellenar tabla pedidos
		for (Pedido pedido : pedidos) {
			Object[] linea = { pedido.getId(), pedido.getIdCliente(), pedido.getFecha(),};
			tableModel.addRow(linea);
		}
		tablaPedidos.setModel(tableModel);
		
		
	}
	public void rellenarTablaDetallesPedido(ArrayList<DetallesPedido> detallesPedidos) {
		// TODO Apéndice de método generado automáticamente
		// modeloa sortu
				DefaultTableModel defaultTableModel = new DefaultTableModel();

				// cabecerako arraya sortu eta modeloari ezarri
				Object[] cabecera = { "IdPedido", "IdCliente", "Cantidad" };
				defaultTableModel.setColumnIdentifiers(cabecera);

				// modeloa datuekin bete
				for (DetallesPedido detallesPedido : detallesPedidos) {

					Object[] linea = { detallesPedido.getIdPedido(), detallesPedido.getIdProducto(), detallesPedido.getCantidad() };
					defaultTableModel.addRow(linea);
				}

				// modeloa taulari ezarri
				tablaDetallesPedido.setModel(defaultTableModel);

				// taula ordenagarria bihurtu
				TableRowSorter<DefaultTableModel> modeloOrdenado;
				modeloOrdenado = new TableRowSorter<DefaultTableModel>(defaultTableModel);
				this.tablaDetallesPedido.setRowSorter(modeloOrdenado);
			}



	public void rellenarTablaCamposCliente(Cliente cliente) {
		// TODO Apéndice de método generado automáticamente
		this.textFieldNombre.setText(cliente.getNombre());
		this.textFieldDireccion.setText(cliente.getDireccion());
		this.textFieldTelefono.setText(cliente.getTelefono());
		this.textFieldCodPostal.setText(cliente.getCodPostal());
	}
		
}

	

