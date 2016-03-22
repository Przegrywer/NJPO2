package Zadanie;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public abstract class GenerujStrone implements Strona {

	private String nazwaPliku;

	GenerujStrone(String nazwaPliku) {
		this.nazwaPliku = nazwaPliku;
	}

	public static void SkasujPlik(String nazwaPliku) {
		File plik = new File(nazwaPliku + ".html");
		plik.delete();
	}

	public static void UtworzPlik(String nazwaPliku) {
		File plik = new File(nazwaPliku + ".html");
		try {
			plik.createNewFile();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Nie mozna utworzyc pliku.");
		}
	}

	public static void ZapiszDoPliku(String dane, String nazwaPliku) {
		try {
			FileWriter file = new FileWriter(nazwaPliku + ".html", true);
			BufferedWriter out = new BufferedWriter(file);
			out.write(dane);
			out.close();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "B³ad przy zapisie do pliku.");
		}

	}

	public static String GenerujPoczatekStrony() {
		return "<!DOCTYPE html>\n" + "<html>\n" + "<body>\n";
	}

	public static String GenerujTytulStrony(String tytul) {
		return "<title>" + tytul + "</title>\n";
	}

	public static String GenerujKoniecStrony() {
		return "</body>\n" + "</html>";
	}

	@Override
	public void GenerujKompletnaStrone() {

		SkasujPlik(nazwaPliku); // Kasowanie danej strony

		StringBuilder stringBuilder = new StringBuilder();

		stringBuilder.append(GenerujStrone.GenerujPoczatekStrony());
		stringBuilder.append(GenerujStrone.GenerujTytulStrony(nazwaPliku));
		stringBuilder.append(GenerujWnetrzeStrony(stringBuilder));
		stringBuilder.append(GenerujStrone.GenerujKoniecStrony());

		GenerujStrone.UtworzPlik(nazwaPliku);
		GenerujStrone.ZapiszDoPliku(stringBuilder.toString(), nazwaPliku);

	}

	protected abstract StringBuilder GenerujWnetrzeStrony(StringBuilder stringBuilder);

}
