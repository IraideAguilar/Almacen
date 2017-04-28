package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import controlador.ClienteControlador;
import controlador.PedidoControlador;
import modelo.Cliente;
import modelo.ClienteModelo;
import modelo.DetallesPedido;
import modelo.DetallesPedidoModelo;
import modelo.Pedido;
import modelo.PedidoModelo;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
	private JTable tableClientes;
	private JTable tableBezeroarenEskaintza;
	private JTable table_2;
	private JTextField textField;

	
	public BezeroarenEskariakErakutzi(JDialog modal, boolean parent) {
		super(modal,parent);
		setBounds(100, 100, 650, 500);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblBezeroak = new JLabel("BEZEROAK");
		lblBezeroak.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblBezeroak.setBounds(132, 25, 90, 14);
		contentPanel.add(lblBezeroak);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 50, 328, 160);
		contentPanel.add(scrollPane);
		
		tableClientes = new JTable();
		tableClientes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				//taulatik ze lerro klikatu den jakin
				int aukeratutakoLerroa = tableClientes.getSelectedRow();
				//lerrotik,guk nahi ditugun zutabearen lerroa jaso
				String idCliente = (String)tableClientes.getModel().getValueAt(aukeratutakoLerroa, 0);
				String nombre = (String)tableClientes.getModel().getValueAt(aukeratutakoLerroa, 1);
				String telefono = (String)tableClientes.getModel().getValueAt(aukeratutakoLerroa, 2);
				//pedido eta bezero erakutzi
				clienteControlador.pedidoarenDatuakErakutzi(idCliente,nombre, telefono);
				
			
			}
		});
		scrollPane.setViewportView(tableClientes);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 270, 328, 140);
		contentPanel.add(scrollPane_1);
		
		tableBezeroarenEskaintza = new JTable();
		scrollPane_1.setViewportView(tableBezeroarenEskaintza);
		
		JLabel lblBezeroarenEskaintzak = new JLabel("BEZEROAREN ESKAINTZAK");
		lblBezeroarenEskaintzak.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblBezeroarenEskaintzak.setBackground(Color.BLACK);
		lblBezeroarenEskaintzak.setBounds(90, 241, 178, 14);
		contentPanel.add(lblBezeroarenEskaintzak);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(416, 51, 183, 262);
		contentPanel.add(scrollPane_2);
		
		table_2 = new JTable();
		scrollPane_2.setViewportView(table_2);
		
		JLabel lblEskaitzenDetaileak = new JLabel("ESKAITZEN DETAILEAK");
		lblEskaitzenDetaileak.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEskaitzenDetaileak.setBackground(new Color(240, 240, 240));
		lblEskaitzenDetaileak.setBounds(437, 26, 138, 14);
		contentPanel.add(lblEskaitzenDetaileak);
		
		textField = new JTextField();
		textField.setBounds(458, 370, 125, 37);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		JLabel lblPrezioa = new JLabel("PREZIOA");
		lblPrezioa.setBounds(496, 344, 46, 14);
		contentPanel.add(lblPrezioa);
	}


	public void tablaOsotu(ArrayList<Cliente> clientes) {
		// TODO Apéndice de método generado automáticamente
		//tabla sortu
				DefaultTableModel tableModel = new DefaultTableModel();
				//kabezera sortu
				Object[] cabecera = { "id", "nombre", "telefono" };
				tableModel.setColumnIdentifiers(cabecera);
				
				//rellenar tabla pedidos
				for (Cliente cliente : clientes) {
					Object[] linea = { cliente.getId(), cliente.getNombre(), cliente.getTelefono(),};
					tableModel.addRow(linea);
				}
				tableClientes.setModel(tableModel);
				
				TableRowSorter<DefaultTableModel> ordenar;
				ordenar = new TableRowSorter<DefaultTableModel>(tableModel);
				this.tableClientes.setRowSorter(ordenar);
	}


	public void rellenarTablaConPedidosCliente(ArrayList<Pedido> pedidos) {
		// TODO Apéndice de método generado automáticamente
		DefaultTableModel defaultTableModel = new DefaultTableModel();

		// cabecerako arraya sortu eta modeloari ezarri
		Object[] cabecera = { "ID", "FECHA", "COD.POSTAL", "CANTIDAD" };
		defaultTableModel.setColumnIdentifiers(cabecera);

		// modeloa datuekin bete
		for (Pedido pedido : pedidos) {

			Object[] linea = { pedido.getId(), pedido.getFecha(), pedido.getCodPostal(), pedido.getDetallesPedidos().size() };
			defaultTableModel.addRow(linea);
		}

		// modeloa taulari ezarri
		tableBezeroarenEskaintza.setModel(defaultTableModel);

		// taula ordenagarria bihurtu
		TableRowSorter<DefaultTableModel> modeloOrdenado;
		modeloOrdenado = new TableRowSorter<DefaultTableModel>(defaultTableModel);
		this.tableBezeroarenEskaintza.setRowSorter(modeloOrdenado);
	}

		
	}

				


