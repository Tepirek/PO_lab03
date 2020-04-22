
public class Translation implements Transformation {
	private final double dX;
	private final double dY;
	
	public Translation(double dX, double dY) {
		this.dX = dX;
		this.dY = dY;
	}
	
	@Override
	public Point transform(Point p) {
		return new Point(p.getX() + dX, p.getY() + dY);
	}
	
	@Override
	public Transformation getTransformationReverse() throws BrakTransformacjiOdwrotnejException {
		return new Translation(-dX, -dY);
	}

	public double getdX() {
		return dX;
	}

	public double getdY() {
		return dY;
	}

	@Override
	public String toString() {
		return "Translacja o wektor (" + dX + ", " + dY + ")";
	}
	
}
