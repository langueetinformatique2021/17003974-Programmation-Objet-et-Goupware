package TD4;

public class Conditionnelle1 {

	public static void main(String[] args) {
		int p1 = 10, p2 = 9, p3 = -1, p4= 0;
		
		if (p1 > p2) {			/**si p1 est plus grand que p2 **/
			if (p3 > p1)       /**si p3 est plus grand que p1 **/
				p4 = p3;		/**p4 est = a p3**/
			else p4 = p1;		/** si p3 n'est pas plus grand que p1 alors p4 = p1**/
		}
		else {
			if (p3 > p2)		/**sinon si p3 est plus grand que p2**/
				p4 = p3;		/**alors p4 = p3 **/
			else 
				p4 = p2;		/**si p3 n'est pas plus grand que p2 alors p4 = p2**/
		}

		System.out.println(p4);
	}

}
