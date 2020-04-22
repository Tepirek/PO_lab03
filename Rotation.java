import java.lang.Math;

public class Rotation implements Transformation {
	public final double angle;
	
	public Rotation(double angle) {
		this.angle = angle;
	}
	
	@Override
	public Point transform(Point p) {
		double a = Math.toRadians(angle);
		double newX = p.getX() * Math.cos(a) - p.getY() * Math.sin(a);
		double newY = p.getX() * Math.sin(a) + p.getY() * Math.cos(a);
		return new Point(newX, newY);
	}

	@Override
	public Transformation getTransformationReverse() throws BrakTransformacjiOdwrotnejException {
		return new Rotation(-angle);
	}

	public double getAngle() {
		return angle;
	}

	@Override
	public String toString() {
		return "Rotowanie o kąt " + angle + "°";
	}
}
