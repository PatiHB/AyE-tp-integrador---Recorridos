package clases;

public class Usuario {
	private String posicion;
	
	public Usuario() {
		posicion="";
	}
	public Usuario(String s) {
		posicion=s;
	}
	
	public void setPosicion(String s) {
		posicion=s;
	}
	public String getPosicion() {
		return posicion;
	}
}
