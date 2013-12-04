package determinante;

public class DeterminantenRechner {

	public static void main(String[] args) {
		IFunktion f1 = new Function7c1();
		IFunktion f2 = new Function7c2();
		IFunktion f3 = new Function7c3();
		
		double x1 = 1;
		double x2 = 2;
		double x3 = 3;
		
		System.out.println(DeterminantenRechner.berechneDeterminante(f1, f2, f3, x1, x2, x3));
	}
	
	public static double berechneDeterminante(IFunktion f1, IFunktion f2, IFunktion f3, double x1, double x2, double x3){
		return f1.getValue(x1) * f2.getValue(x2) * f3.getValue(x3)
				+ f1.getValue(x2) * f2.getValue(x3) * f3.getValue(x3)
				+ f1.getValue(x3) * f2.getValue(x1) * f3.getValue(x2)
				- f3.getValue(x1) * f2.getValue(x2) * f1.getValue(x3)
				- f3.getValue(x2) * f2.getValue(x3) * f1.getValue(x1)
				- f3.getValue(x3) * f2.getValue(x1) * f1.getValue(x2);
	}

}
