import java.util.ArrayList;
import java.util.Collections;

public class Espanyola extends Baraja {

	// CONSTRUCTOR
	public Espanyola(ArrayList<Carta> cartas) {
		super(cartas);
		reiniciar();
	}
	
	// SE ESCRIBE EL CONTENIDO DE LAS FUNCIONES DE LA CLASE ABSTRACTA BARAJA
	@Override
	public void barajar() { // Pone en orden aleatorio el contenido del arraylist cartas.
		Collections.shuffle(cartas);
	}

	@Override
	public Carta repartir() { // Devuelve el valor de la primera carta y la elimina del arraylist cartas.
		Carta aux_carta;
		aux_carta = cartas.get(0);
		cartas.remove(0);
		return aux_carta;
	}
	@Override
	public void reiniciar() {
		if (cartas.size() >= 39) 
			cartas.clear();
			
		for (int i = 0; i <  7; i++) {
			Carta aux_carta = new Carta("", "", 0);
			aux_carta = new Carta("", "", 0);
			if (i == 0) {
				aux_carta.setNombre("Uno");
				aux_carta.setValor(1);
			}
			if (i == 1) {
				aux_carta.setNombre("Dos");
				aux_carta.setValor(2);
			}
			if (i == 2) {
				aux_carta.setNombre("Tres");
				aux_carta.setValor(3);
			}
			if (i == 3) {
				aux_carta.setNombre("Cuatro");
				aux_carta.setValor(4);
			}
			if (i == 4) {
				aux_carta.setNombre("Cinco");
				aux_carta.setValor(5);
			}
			if (i == 5) {
				aux_carta.setNombre("Seis");
				aux_carta.setValor(6);
			}
			if (i == 6) {
				aux_carta.setNombre("Siete");
				aux_carta.setValor(7);
			}
			
				for (int j = 0; j < 4; j++) {
					Carta aux_carta2 = new Carta("", "", 0);
					aux_carta2 = new Carta(aux_carta.getNombre(), "", aux_carta.getValor());
					if (j == 0) {
						aux_carta2.setPalo("espadas");
						cartas.add(aux_carta2);
					}
					if (j == 1) {
						aux_carta2.setPalo("bastos");
						cartas.add(aux_carta2);
					}
					if (j == 2) {
						aux_carta2.setPalo("oros");
						cartas.add(aux_carta2);
					}
					if (j == 3) {
						aux_carta2.setPalo("copas");
						cartas.add(aux_carta2);
					}
				}
				
				if (i == 6) {
					for (int k = 0; k < 3; k++) {
						Carta aux_carta3 = new Carta("", "", 10);
						aux_carta3 = new Carta("", "", 10);
						if (k == 0) {
							aux_carta3.setNombre("Sota");
							aux_carta3.setValor(10);
						}
						
						if (k == 1) {
							aux_carta3.setNombre("Caballo");
							aux_carta3.setValor(10);
						}
						
						if (k == 2) {
							aux_carta3.setNombre("Rey");
							aux_carta3.setValor(10);
						}
						
						for (int j = 0; j < 4; j++) {
							Carta aux_carta4 = new Carta("", "", 10);
							aux_carta4 = new Carta(aux_carta3.getNombre(), "", 10);
							if (j == 0) {
								aux_carta4 = aux_carta3;
								aux_carta4.setPalo("espadas");
								cartas.add(aux_carta4);
							}
							if (j == 1) {
								aux_carta4.setPalo("bastos");
								cartas.add(aux_carta4);
							}
							if (j == 2) {
								aux_carta4.setPalo("oros");
								cartas.add(aux_carta4);
							}
							if (j == 3) {
								aux_carta4.setPalo("copas");
								cartas.add(aux_carta4);
							}
						}
						
					}
				}
		}	
	}
}