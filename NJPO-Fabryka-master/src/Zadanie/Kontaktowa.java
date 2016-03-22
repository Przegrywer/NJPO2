package Zadanie;

import java.util.Random;

public class Kontaktowa extends GenerujStrone {

	Kontaktowa() {
		super("Kontaktowa");
	}

	@Override
	public void GenerujKompletnaStrone() {
		super.GenerujKompletnaStrone();
	}

	@Override
	public StringBuilder GenerujWnetrzeStrony(StringBuilder stringBuilder) {

		Random rn = new Random();

		for (int i = 1; i < 11; i++) {
			stringBuilder.append("<h3>Kontakt " + i + "</h3>\n");

			stringBuilder.append("<p>Imiê: ");
			for (int j = 1; j < rn.nextInt(10) + 3; j++) {

				char znak = (char) (rn.nextInt(25) + 65);
				stringBuilder.append(znak);
			}

			stringBuilder.append("</p>\n<p>Nazwisko: ");
			for (int j = 1; j < rn.nextInt(10) + 3; j++) {

				char znak = (char) (rn.nextInt(25) + 65);
				stringBuilder.append(znak);
			}

			stringBuilder.append("</p>\n<p>Numer Telefonu: ");
			for (int j = 1; j < 10; j++) {
				stringBuilder.append(rn.nextInt(10));
			}
			stringBuilder.append("</p>\n");

		}
		return stringBuilder;
	}

}
