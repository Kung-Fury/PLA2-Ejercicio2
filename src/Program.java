import java.util.ArrayList;

public class Program {
	public static void main(String args[]) {
		
		// VARIABLES Y SALIDA EN PANTALLA DEL EJERCICIO 1
		Carta card1, card2, card3;
		Jugador jug1;
		
		card1 = new Carta("Ocho", "diamantes", 8);
		card2 = new Carta("Seis", "trébol", 6);
		card3 = new Carta("Cuatro", "pica", 4);
		jug1 = new Jugador();
		
		jug1.darCarta(card1);
		System.out.println("El jugador " + jug1.getNombre() + " recibe " + card1.toString() + ".");
		jug1.darCarta(card2);
		System.out.println("El jugador " + jug1.getNombre() + " recibe " + card2.toString() + ".");
		System.out.println("El jugador " + jug1.getNombre() + " retira la carta " + jug1.retirarCarta(0) + ".");
		jug1.darCarta(card3);
		System.out.println("El jugador " + jug1.getNombre() + " recibe " + card3.toString() + ".");
		System.out.println("Las cartas que tiene " + jug1.getNombre() + " son:");
		System.out.println(jug1.juego());
	
	// ---------------------------------------------------------------------------------------------------
		
		// VARIABLES Y SALIDA EN PANTALLA DEL EJERCICIO 2
		ArrayList<Carta> cartas = new ArrayList<Carta>();
		Francesa baraja_francesa;
		baraja_francesa = new Francesa(cartas);
		System.out.println("-----------------------------------------------------");
		System.out.println("--- CARTAS BARAJA FRANCESA ---");
		for (int i = 0; i < baraja_francesa.cartas.size(); i++)
			System.out.println(baraja_francesa.cartas.get(i));
		System.out.println("--- CARTAS BARAJA FRANCESA MEZCLADAS ---");
		baraja_francesa.barajar();
		for (int i = 0; i < baraja_francesa.cartas.size(); i++)
			System.out.println(baraja_francesa.cartas.get(i));
		System.out.println("--- SE REPARTE LA PRIMERA CARTA DE LA MEZCLA ANTERIOR ---");
			System.out.println(baraja_francesa.repartir());
		System.out.println("--- SE MUESTRA LA BARAJA SIN LA CARTA REPARTIDA ---");
		for (int i = 0; i < baraja_francesa.cartas.size(); i++)
			System.out.println(baraja_francesa.cartas.get(i));
		System.out.println("--- SE VUELVE A COMPLETAR Y ORDENAR LA BARAJA FRANCESA ---");
		baraja_francesa.reiniciar();
		for (int i = 0; i < baraja_francesa.cartas.size(); i++)
			System.out.println(baraja_francesa.cartas.get(i));
		
		Espanyola baraja_espanyola;
		baraja_espanyola = new Espanyola(cartas);
		System.out.println("-----------------------------------------------------");
		System.out.println("--- CARTAS BARAJA ESPAÑOLA ---");
		for (int i = 0; i < baraja_espanyola.cartas.size(); i++)
			System.out.println(baraja_espanyola.cartas.get(i));
		System.out.println("--- CARTAS BARAJA ESPAÑOLA MEZCLADAS ---");
		baraja_espanyola.barajar();
		for (int i = 0; i < baraja_espanyola.cartas.size(); i++)
			System.out.println(baraja_espanyola.cartas.get(i));
		System.out.println("--- SE REPARTE LA PRIMERA CARTA DE LA MEZCLA ANTERIOR ---");
			System.out.println(baraja_espanyola.repartir());
		System.out.println("--- SE MUESTRA LA BARAJA SIN LA CARTA REPARTIDA ---");
		for (int i = 0; i < baraja_espanyola.cartas.size(); i++)
			System.out.println(baraja_espanyola.cartas.get(i));
		System.out.println("--- SE VUELVE A COMPLETAR Y ORDENAR LA BARAJA ESPAÑOLA ---");
		baraja_espanyola.reiniciar();
		for (int i = 0; i < baraja_espanyola.cartas.size(); i++)
			System.out.println(baraja_espanyola.cartas.get(i));

	}
}
