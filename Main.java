
public class Main {

	public static void main(String[] args) {
	    
	    try {
	    	Point p1 = Point.E_X;
			System.out.println(p1);
			Transformation tr = new Translation(5, 6);
			System.out.println(tr);
			Point p2 = tr.transform(p1);
			System.out.println(p2);
			Transformation trr = tr.getTransformationReverse();
			System.out.println(trr);
			Point p3 = trr.transform(p2);
			System.out.println(p3);
	    } 
	    catch (BrakTransformacjiOdwrotnejException ex) {
	    	ex.printStackTrace();
	    }
	    System.out.println();

	    try {
	    	Point p1 = new Point(2, 2);
	    	System.out.println(p1);
	    	Transformation tr2 = new Graduation(5, 4);
	    	System.out.println(tr2);
	    	Point p2 = tr2.transform(p1);
	    	System.out.println(p2);
	    	Transformation trr2 = tr2.getTransformationReverse();
	    	System.out.println(trr2);
	    	Point p3 = trr2.transform(p2);
	    	System.out.println(p3);
	    }
	    catch(BrakTransformacjiOdwrotnejException ex) {
	    	ex.printStackTrace();
	    }
	    System.out.println();
	    	 
	    try {
	    	Point p1 = new Point(2, 2);
	    	Transformation tr2 = new Graduation(5, 0);
	    	System.out.println(tr2);
	    	System.out.println(p1);
	    	Point p2 = tr2.transform(p1);
	    	System.out.println(p2);
	    	Transformation trr2 = tr2.getTransformationReverse();
	    	System.out.println(trr2);
	    	Point p3 = trr2.transform(p2);
	    	System.out.println(p3);
	    }
	    catch(BrakTransformacjiOdwrotnejException ex) {
	    	ex.printStackTrace();
	    }
	    System.out.println();
   	 
	    try {
	    	Point p1 = new Point(2, 2);
		   	Transformation tr2 = new Rotation(90);
		   	System.out.println(tr2);
		   	System.out.println(p1);
		   	Point p2 = tr2.transform(p1);
		   	System.out.println(p2);
		   	Transformation trr2 = tr2.getTransformationReverse();
		   	System.out.println(trr2);
		   	Point p3 = trr2.transform(p2);
		   	System.out.println(p3);
	    }
	    catch(BrakTransformacjiOdwrotnejException ex) {
	    	ex.printStackTrace();
	    }
	    System.out.println();
		
		try {
			Point p1 = new Point(2, 2);
		    Transformation[] transformations = {new Translation(1, 1), new Rotation(180), new Graduation(5, 5)};
		    
		    System.out.println(p1.toString());
		    Transformation t1 = new AssembleTransformation(transformations);
		    Point p2 = t1.transform(p1);
		    System.out.println(t1.toString());
		    System.out.println("New => " + p2.toString());
		    
		    Transformation t2 = t1.getTransformationReverse();
		    Point p3 = t2.transform(p2);
		    System.out.println(t2.toString());
		    System.out.println(p3.toString());
		}
	   	catch (BrakTransformacjiOdwrotnejException ex) {
	   		ex.printStackTrace();
	   	}
	}
}
