package Zadanie;

public class Aktualnosci extends GenerujStrone {

	Aktualnosci() {
		super("Aktualnosci");
	}

	@Override
	public void GenerujKompletnaStrone() {
		super.GenerujKompletnaStrone();
	}

	public StringBuilder GenerujWnetrzeStrony(StringBuilder stringBuilder) {

		for (int i = 1; i < 11; i++) {
			stringBuilder.append("<h3>Wiadomosc " + i + "</h3>\n");
			stringBuilder.append("<p>bla bla bla bla bla bla bla bla bla bla bla bla</p>\n");
		}

		return stringBuilder;
	}

}
