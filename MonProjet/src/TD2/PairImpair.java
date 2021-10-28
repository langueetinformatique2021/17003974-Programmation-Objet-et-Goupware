package TD2;

public class PairImpair {
	public static void main(String[] args) {
		// test de pair et impair
		System.out.println(pair(10));
		System.out.println(pair(11));
		System.out.println(impair(11));
		System.out.println(impair(10));

	}
	public static boolean pair(int v) {
		return ((v % 2) == 0);
	}
	
	public static boolean impair (int v) {
		return !pair(v);
	}

}
