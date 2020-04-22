
public class Graduation implements Transformation {
	public final double scaleX;
	public final double scaleY;
	
	public Graduation(double scaleX, double scaleY) {
		this.scaleX = scaleX;
		this.scaleY = scaleY;
	}
	
	@Override
	public Point transform(Point p) {
		return new Point(p.getX() * scaleX, p.getY() * scaleY);
	}

	@Override
	public Transformation getTransformationReverse() throws BrakTransformacjiOdwrotnejException {
		if(scaleX == 0 || scaleY == 0) throw new BrakTransformacjiOdwrotnejException("Brak transformacji odwrotnej. Przynajmniej jeden z czynników skalowania jest równy 0.");
		
		return new Graduation(1 / scaleX, 1 / scaleY);
	}

	public double getScaleX() {
		return scaleX;
	}

	public double getScaleY() {
		return scaleY;
	}

	@Override
	public String toString() {
		return "Skalowanie " + scaleX + "x oraz " + scaleY + "y";
	}
}
