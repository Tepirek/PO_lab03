
public interface Transformation {
	Point transform(Point p);
	Transformation getTransformationReverse() throws BrakTransformacjiOdwrotnejException;
}
