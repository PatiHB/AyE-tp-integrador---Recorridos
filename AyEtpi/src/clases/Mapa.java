package clases;

import java.util.HashMap;
import java.util.Map;

import grafoDirigido.*;

public class Mapa extends GrafoDirigido{
	private ListaAutos autos;
	private ListaUsuarios usuarios;
	Map<String, Integer> puntosUnicos;
	
	public Mapa() {
		this.matrizCosto=
		autos=new ListaAutos();
		usuarios=new ListaUsuarios();
	}
	
	
}
