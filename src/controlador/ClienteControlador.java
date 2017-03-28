/**
 * 
 */
package controlador;


import modelo.Cliente;
import vista.BezeroFormulario;
import vista.BezeroKudeatzailea;
import vista.Nagusia;


/**
 * @author enautirakasle
 * 24 mar. 2017
 */

public class ClienteControlador {

	private BezeroFormulario bezeroFormulario;
	private BezeroKudeatzailea bezeroKudeatzailea;
	private Nagusia nagusia;

	//TODO atributuak jarri
	
	public void zabalduBezeroKuedeatzailea(){
		//TODO bezero kudeatzailea leihoa zabaldu
		
	}
	
	public void zabalduBezeroFormularioa(){
		//TODO bezero formularioa zabaldu
		
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
}
