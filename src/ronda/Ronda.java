package ronda;

import partido.Partido;
public class Ronda {
	
	private int nro;
	private int contadorNro;
	private Partido[] partido;
	
	public Ronda() {
		this.nro = ++contadorNro;
	}
	
	public Ronda(Partido[] partido) {
		this.partido = partido;
	}

}
