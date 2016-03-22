package Zadanie;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Strona> ListaStron = new ArrayList<>();

		ListaStron.add(FabrykaStron.StworzStrone(TypStrony.GALERIA));
		ListaStron.add(FabrykaStron.StworzStrone(TypStrony.INFORMACYJNA));
		ListaStron.add(FabrykaStron.StworzStrone(TypStrony.KONTAKTOWA));
		ListaStron.add(FabrykaStron.StworzStrone(TypStrony.AKTUALNOSCI));

		ListaStron.forEach(Strona::GenerujKompletnaStrone);
	}

}
