package determinante;

public class Function103 implements IFunktion {

	private double alpha = -Math.E;
	
	@Override
	public double getValue(double x) {
		return alpha * Math.exp(x) + 1;
	}

}
