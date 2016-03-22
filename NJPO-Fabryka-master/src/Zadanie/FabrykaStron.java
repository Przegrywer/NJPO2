package Zadanie;

public class FabrykaStron {
	public static Strona StworzStrone(TypStrony typ) {

		switch (typ) {
		case GALERIA:
			return new Galeria();
		case INFORMACYJNA:
			return new Informacyjna();
		case KONTAKTOWA:
			return new Kontaktowa();
		case AKTUALNOSCI:
			return new Aktualnosci();
		}

		return null;

	}
}
