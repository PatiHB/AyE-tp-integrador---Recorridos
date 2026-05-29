package clases;

import java.util.*;

import grafoDirigido.*;

public class Mapa{
	private GrafoDirigido grafo;
	private ListaAutos autos;
	private ListaUsuarios usuarios;
	private Map<String, Integer> puntosUnicos;
	
	public Mapa() {
		grafo=null;
		autos=new ListaAutos();
		usuarios=new ListaUsuarios();
		puntosUnicos=null;
	}
	
	public void agregarAuto(String posicion) {
		if(puntosUnicos.containsKey(posicion)) {
			autos.insertar(new Auto(posicion), 0);
		}
		else {
			System.out.println("agregarAuto: La posición no existe");
		}
	}
	public void agregarUsuario(String posicion) {
		if(puntosUnicos.containsKey(posicion)) {
			usuarios.insertar(new Usuario(posicion), 0);
		}
		else {
			System.out.println("agregarUsuario: La posición no existe");
		}
	}
	public void eliminarUsuario(int pos) {
		autos.eliminar(pos);
	}
	public void eliminarAuto(int pos) {
		usuarios.eliminar(pos);
	}
	
	public void cargarHash(Map<String, Integer> M) {
		puntosUnicos=M;
	}
	public void cargarGrafo(GrafoDirigido G) {
		grafo=G;
	}
}
