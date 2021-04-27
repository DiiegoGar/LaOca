package proyecto;
import java.util.*;

public class ListaJugadores {
	private ArrayList <Jugador> lista;
	private int minJug = 2;
	private int maxJug = 4;
	
	public ListaJugadores() {
		this.lista = new ArrayList <Jugador>();
	}
	
	public void elegirNumJugadores(int pNum) {
		if (pNum < minJug || pNum > maxJug) {
			System.out.println("Numero de jugadores no valido");
			
		} else if (pNum == 2) {
			Jugador j1 = new Jugador("Azul",1);
			this.lista.add(j1);

			
			Jugador j2 = new Jugador("Amarillo",2);
			this.lista.add(j2);
	

			
		} else if (pNum == 3) {
			Jugador j1 = new Jugador("Azul",1);
			this.lista.add(j1);
			
			
			Jugador j2 = new Jugador("Amarillo",2);
			this.lista.add(j2);
			
			
			Jugador j3 = new Jugador("Rojo",3);
			this.lista.add(j3);
			
			
		} else {
			Jugador j1 = new Jugador("Azul",1);
			this.lista.add(j1);
			
			
			Jugador j2 = new Jugador("Amarillo",2);
			this.lista.add(j2);
			
			Jugador j3 = new Jugador("Rojo",3);
			this.lista.add(j3);
			
			
			Jugador j4 = new Jugador("Verde",4);
			this.lista.add(j4);
			
		}
	}

	public Jugador elegirJugador(int i) {
		return this.lista.get(i);
	}
	
	public boolean volverAlPrimero(int i) {
		boolean volver=false;
		
		return volver;
	}
	
}
