package determinante;

public class Function101 implements IFunktion {

	@Override
	public double getValue(double x) {
		return Math.pow(x, 2) + x;
	}

}
