package linearUnabhaengigkeit;

import java.util.Random;

public class LinUnab {
	
	private Funktion f1, f2, f3;

	public LinUnab(Funktion f1, Funktion f2, Funktion f3) {
		super();
		this.f1 = f1;
		this.f2 = f2;
		this.f3 = f3;
	}
	
	public boolean isLinUnab(double a, double b){
		Random rnd = new Random();
		for(int i = 0; i < 10; i++){
			
			double x1 = a + (b - a) * rnd.nextDouble();
			double x2 = a + (b - a) * rnd.nextDouble();
			double x3 = a + (b - a) * rnd.nextDouble();
			
			if(this.berechneDeterminante(x1, x2, x3) >= 10e-8){
				return true;
			}
		}
		return false;
	}

	private double berechneDeterminante(double x1, double x2, double x3) {
		return f1.getFunktionswert(x1) * f2.getFunktionswert(x2) * f3.getFunktionswert(x3)
				+ f1.getFunktionswert(x2) * f2.getFunktionswert(x3) * f3.getFunktionswert(x3)
				+ f1.getFunktionswert(x3) * f2.getFunktionswert(x1) * f3.getFunktionswert(x2)
				- f3.getFunktionswert(x1) * f2.getFunktionswert(x2) * f1.getFunktionswert(x3)
				- f3.getFunktionswert(x2) * f2.getFunktionswert(x3) * f1.getFunktionswert(x1)
				- f3.getFunktionswert(x3) * f2.getFunktionswert(x1) * f1.getFunktionswert(x2);
	}

}
