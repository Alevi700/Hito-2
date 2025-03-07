package Hito2;

public class Pokeball {
	protected int integridad;
	protected int probabilidad;
	
	// constructor 
	public Pokeball(int integridad, int probabilidad) {
		this.integridad = integridad;
		this.probabilidad = probabilidad;
	}
	
	public int getIntegridad() {
		return integridad;
	}


	public void setIntegridad(int integridad) {
		this.integridad = integridad;
	}


	public int getProbabilidad() {
		return probabilidad;
	}


	public void setProbabilidad(int probabilidad) {
		this.probabilidad = probabilidad;
	}


	public String toString() {
		return "Usando la Pokeball probabilidad de captura: " + getProbabilidad() + "%  |  integridad: " + getIntegridad();
	}

}

class Superball extends Pokeball{
	int racha = 0;
	public Superball(int integridad, int probabilidad){
		super(integridad, probabilidad);
	}
	public int getRacha() {
		return racha;
	}
	public void setRacha(int racha) {
		this.racha = racha;
	}
	public String toString() {
		return "Usando la Superball probabilidad de captura: " + getProbabilidad() + "%  |  integridad: " + getIntegridad() + " | racha: " + getRacha();
	}
	
}

class Ultraball extends Pokeball{
	double potencia = 0;
	public Ultraball(int integridad, int probabilidad){
		super(integridad, probabilidad);
	}
	public double getPotencia() {
		return potencia;
	}
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	public String toString() {
		return "Usando la Ultraball probabilidad de captura: " + getProbabilidad() + "%  |  integridad: " + getIntegridad() + " | potencia: " + getPotencia();
	}
}

class Masterball extends Pokeball{
	private double estabilidad;
	
	public Masterball(int integridad, int probabilidad, int estabilidad){
		super(integridad, probabilidad);
		this.integridad = 4;
		this.estabilidad = estabilidad;
	}
	
	public double getEstabilidad() {
		return estabilidad;
	}
	
	public void setEstabilidad(double estabilidad) {
		this.estabilidad = estabilidad;
	}
	
	public String toString() {
		return "Usando la Masterball probabilidad de captura: " + getProbabilidad() + "%  |  estabilidad: " + getEstabilidad();
	}
}
