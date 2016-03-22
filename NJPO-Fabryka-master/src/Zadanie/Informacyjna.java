package Zadanie;

public class Informacyjna extends GenerujStrone {

	Informacyjna() {
		super("Informacyjna");
	}

	@Override
	public void GenerujKompletnaStrone() {
		super.GenerujKompletnaStrone();
	}

	@Override
	public StringBuilder GenerujWnetrzeStrony(StringBuilder stringBuilder) {

		for (int i = 1; i < 11; i++) {
			stringBuilder.append(
					"<p>asd asd nasjdn alsfn sdkfn alskdn lasnf laksf laksflasnf lkasnflak nsflkans flkans flkn</p>\n");
			stringBuilder.append(
					"<p>asd asd nasjdn alsfn sdkfn alskdn lasnf laksf laksflasnf lkasnflak nsflkans flkans flkn</p>\n");
		}
		return stringBuilder;
	}

}