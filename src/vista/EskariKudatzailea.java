package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.PedidoControlador;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EskariKudatzailea extends JDialog {

	private final JPanel contentPanel = new JPanel();
	
	private PedidoControlador pedidoControlador;


	public PedidoControlador getPedidoControlador() {
		return pedidoControlador;
	}


	public void setPedidoControlador(PedidoControlador pedidoControlador) {
		this.pedidoControlador = pedidoControlador;
	}


	/**
	 * Create the dialog.
	 */
	public EskariKudatzailea(JFrame parent,boolean modal) {
		super();
		
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JButton btnEskariaListatu = new JButton("Eskaria Listatu");
			btnEskariaListatu.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					pedidoControlador.zabalduEskariaListatu();
				}
			});
			btnEskariaListatu.setBounds(141, 90, 139, 23);
			contentPanel.add(btnEskariaListatu);
		}
	}

}
