package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		for (int g : tabell) {
			// System.out.print(g);
		}

	}

	// b)
	public static String tilStreng(int[] tabell) {
		String g = "[";
		for (int f = 0; f < tabell.length; f++) {

			g = g + String.valueOf(tabell[f]);
			if (f < tabell.length - 1)
				g = g + ",";
		}

		g = g + "]";

		return g;
	}

	// c)
	public static int summer(int[] tabell) {
		int sum = 0;

		for (int i : tabell) {
			sum = sum + i;

		}
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		boolean finnes = false;
		for (int i : tabell) {
			if (i == tall) {
				finnes = true;
				break;

			}
		}
		return finnes;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		int pos = -1;
		for (int i = 0; i < tabell.length; i++) {
			if (tall == tabell[i]) {
				pos = i;
			}

		}
		return pos;

	}

	// f)
	public static int[] reverser(int[] tabell) {
		int[] stand = new int[tabell.length];

		for (int i = 0; i < tabell.length; i++) {
			stand[i] = tabell[tabell.length - i - 1];

		}
		return stand;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		boolean sortert = true;

		for (int i = 0; i < tabell.length - 1; i++) {

			if (tabell[i] > tabell[i + 1]) {
				sortert = false;

			}

		}
		return sortert;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		throw new UnsupportedOperationException("Metoden settSammen ikke implementert");

	}
}
