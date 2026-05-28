package clases;

import contenedores.*;

public class ListaAutos extends Lista1DLinkedL {
	
	@Override
	public boolean iguales(Object elementoL, Object elemento) {
		return (elementoL.equals(elemento));
	}

}
