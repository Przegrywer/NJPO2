package Zadanie;

public class Galeria extends GenerujStrone {

	Galeria() {
		super("Galeria");
	}

	@Override
	public void GenerujKompletnaStrone() {
		super.GenerujKompletnaStrone();
	}

	@Override
	public StringBuilder GenerujWnetrzeStrony(StringBuilder stringBuilder) {

		for (int i = 1; i < 11; i++) {
			stringBuilder.append("<h3>Obrazek " + i + "</h3>\n");
			stringBuilder.append("<img src='http://mamadladomu.blog.pl/files/2015/04/91.jpg'/>\n");
		}

		return stringBuilder;
	}

}
