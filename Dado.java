package proyecto;
import java.util.*;

public class Dado {
	private static Dado miDado;
	Random al;
	
	private Dado() {
		al = new Random();
	}
	
	public static Dado getDado() {
		if (Dado.miDado == null) {
			Dado.miDado = new Dado();
		}
		return Dado.miDado;
	}
	
	public int lanzarDado() {
		int n = al.nextInt(6) + 1;
		return n;
	}
}
