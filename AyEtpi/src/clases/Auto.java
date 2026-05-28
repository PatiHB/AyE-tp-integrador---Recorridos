package clases;

public class Auto {
	private String posicion;
	
	public Auto(String s){
		posicion=s;
	}
	public Auto() {
		posicion="";
	}
	
	public void setPosicion(String s) {
		posicion=s;
	}
	public String getPosicion() {
		return posicion;
	}
}
