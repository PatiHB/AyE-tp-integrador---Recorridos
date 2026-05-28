package clases;
import contenedores.*;

public class ListaUsuarios extends Lista1DLinkedL{

	@Override
	public boolean iguales(Object elementoL, Object elemento) {
		Usuario A=(Usuario)elementoL;
		Usuario B=(Usuario)elemento;
		return (A.equals(B));
	}

}
