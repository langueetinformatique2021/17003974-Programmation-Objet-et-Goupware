package TD4;

public class Conditionnelle2 {

	public static void main(String[] args) {
		int p1 = 10, p2 = 9, p3 = -1, p4 = 0;

		if (p1 < p2) {
			if (p3 < p1)
				p4 = p3;
			else
				p4 = p1;
		} else {
			if (p3 < p2)
				p4 = p3;
			else
				p4 = p2;
		}

		System.out.println(p4);
	}

}
