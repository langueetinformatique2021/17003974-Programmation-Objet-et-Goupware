package TD4;

public class Boucle1 {
	public static void main(String[] args) {
		String s1 = "azerty", s2 = "ytreza";

		boolean flag = false;

		if (s1.length() == s2.length()) { /**si la longueur de s1 est = a la longueur de s2**/
			int i, n = s1.length();
			for (i = 0; i < n; i++) {  /**pour i = 0, pour i est inférieur a la longueur de n qui est s1, on incrémente i de 1**/
				if (s1.charAt(i) != s2.charAt(n - i - 1))  /**si les characteres numero i de s1 est différent des characteres numero i inversé de s2**/
					break;						/**alors on renvoie false**/
			}
			if (i == n)
				flag = true;

		}

		System.out.println(flag);
	}
}
