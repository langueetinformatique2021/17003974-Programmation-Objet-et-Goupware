package TD4;

public class Iteration {
	public static void main(String[] args) {
		String[] prenoms = { "Christian", "Karen", "Victoria", "Agatha", "Philippe", "Djam�" };

		int imin = 0;
		for (int i = 1; i < prenoms.length; i++) {
			if (prenoms[i].compareTo(prenoms[imin]) < 0)
				imin = i;

		}
		System.out.println(prenoms[imin]);

	}

}
