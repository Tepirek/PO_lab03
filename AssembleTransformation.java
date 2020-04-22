
public class AssembleTransformation implements Transformation {
	private final Transformation[] transformations;
	
	public AssembleTransformation(Transformation[] transformations) {
		this.transformations = transformations;
	}
	
	@Override
	public Point transform(Point p) {
		Point point = p;
		for(int i = 0; i < transformations.length; i++) {
			point = transformations[i].transform(point);
		}
		return point;
	}

	@Override
	public Transformation getTransformationReverse() throws BrakTransformacjiOdwrotnejException {
		Transformation[] reverse = new Transformation[transformations.length];
		for(int i = 0; i < transformations.length; i++) {
			Transformation t = transformations[i].getTransformationReverse();
			reverse[transformations.length - 1 - i] = t;
		}
		return new AssembleTransformation(reverse);
	}

	public Transformation[] getTransformations() {
		return transformations;
	}

	@Override
	public String toString() {
		String string = "";
		for(int i = 0; i < transformations.length; i++) {
			string += transformations[i].toString() + "\n";
		}
		return string;
	}
}
