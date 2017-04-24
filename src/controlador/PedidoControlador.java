package controlador;

import vista.EskariKudatzailea;
import vista.EskariaListatu;
import vista.Nagusia;

public class PedidoControlador {
	
	private Nagusia nagusia;
	private EskariKudatzailea eskariKudatzailea;
	private EskariaListatu eskariaListatu;
	
	
	public Nagusia getNagusia() {
		return nagusia;
	}
	public void setNagusia(Nagusia nagusia) {
		this.nagusia = nagusia;
	}
	public EskariKudatzailea getEskariKudatzailea() {
		return eskariKudatzailea;
	}
	public void setEskariKudatzailea(EskariKudatzailea eskariKudatzailea) {
		this.eskariKudatzailea = eskariKudatzailea;
	}
	public EskariaListatu getEskariaListatu() {
		return eskariaListatu;
	}
	public void setEskariaListatu(EskariaListatu eskariaListatu) {
		this.eskariaListatu = eskariaListatu;
	}
	public void zabalduEskariKudatzailea() {
		// TODO Auto-generated method stub
		this.eskariKudatzailea.setVisible(true);
	}
	public void zabalduEskariaListatu() {
		// TODO Auto-generated method stub
		this.eskariaListatu.setVisible(true);
	}
	
	
	
	

}
