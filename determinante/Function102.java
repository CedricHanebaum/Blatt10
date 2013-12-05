package determinante;

public class Function102 implements IFunktion {

	@Override
	public double getValue(double x) {
		return Math.pow(x, 2) - x - 2;
	}

}
