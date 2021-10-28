package TD4;

public class mediane2 {

	public static void main(String[] args) {
		//pour que valeur soit médiane, doit être inférieure à 2 valeurs et supérieure à 2 valeurs
		//faire chaque cas : cas où p1 est la médiane, p2 est médiane, ...
		//int p1 = 10, p2 = 9, p3 = -1, p4 = 4, p5 = 8;
		int p6=0;
		int p1 = 3, p2 = 10, p3 = 2, p4 = 4, p5 = 8;
			
		//si p1 est médiane = inférieur à 2 autres valeurs
		if ((p1>p2 && p1>p3) | (p1>p2 && p1>p4) | (p1>p2 && p1>p5) | (p1>p3 && p1>p4) | (p1>p3 && p1>p5)| (p1>p4 && p1>p5)) {
			//+ supérieur à 2 autres valeurs
			if ((p1<p2 && p1<p3) | (p1<p2 && p1<p4) | (p1<p2 && p1<p5) | (p1<p3 && p1<p4) | (p1<p3 && p1<p5)| (p1<p4 && p1<p5)) {
				p6 = p1; 
			}}
		
		//pour que p2 soit médiane
		if ((p2>p1 && p2>p3) | (p2>p1 && p2>p4) | (p2>p1 && p2>p5) | (p2>p3 && p2>p4) | (p2>p3 && p2>p5)| (p2>p4 && p2>p5)) { 
			//+ supérieur à 2 autres valeurs
			if ((p2<p1 && p2<p3) | (p2<p1 && p2<p4) | (p2<p1 && p2<p5) | (p2<p3 && p2<p4) | (p2<p3 && p2<p5)| (p2<p4 && p2<p5)) {
				p6 = p2; 
			} }
		
		//pour que p3 soit médiane
		if ((p3>p1 && p3>p2) | (p3>p1 && p3>p4) | (p3>p1 && p3>p5) | (p3>p2 && p3>p4) | (p3>p2 && p3>p5)| (p3>p4 && p3>p5)) { 
				//+ supérieur à 2 autres valeurs
				if ((p3<p1 && p3<p2) | (p3<p1 && p3<p4) | (p3<p1 && p3<p5) | (p3<p2 && p3<p4) | (p3<p2 && p3<p5)| (p3<p4 && p3<p5)) {
					p6 = p3; 
				} }
				
		//pour que p4 soit médiane
		if ((p4>p1 && p4>p2) | (p4>p1 && p4>p3) | (p4>p1 && p4>p5) | (p4>p2 && p4>p3) | (p4>p2 && p4>p5)| (p4>p3 && p4>p5)) { 
			//+ supérieur à 2 autres valeurs
			if ((p4<p1 && p4<p2) | (p4<p1 && p4<p3) | (p4<p1 && p4<p5) | (p4<p2 && p4<p3) | (p4<p2 && p4<p5)| (p4<p3 && p4<p5)) {
				p6 = p4; 
				} }
			
		//pour que p5 soit médiane (A FAIRE)
		if ((p5>p1 && p5>p2) | (p5>p1 && p5>p3) | (p5>p1 && p5>p4) | (p5>p2 && p5>p3) | (p5>p2 && p5>p4)| (p5>p3 && p5>p4)) { 
				//+ supérieur à 2 autres valeurs
			if ((p5<p1 && p5<p2) | (p5<p1 && p5<p3) | (p5<p1 && p5<p4) | (p5<p2 && p5<p3) | (p5<p2 && p5<p4)| (p5<p3 && p5<p4)) {
				p6 = p5; 
				} }
			
		System.out.println(p6);


		}
}
