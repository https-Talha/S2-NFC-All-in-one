//Polymorphism--> having too many forms
//Dynamic Method Dispatch -->
abstract class Shape{
	double dim1;
	double dim2;
	Shape(double d1, double d2){
		dim1 = d1;
		dim2 = d2;
	}
	abstract double area();
}
class Reactangle extends Shape{ //inheritance
	Reactangle(double d1, double d2){
		super(d1,d2);
	}
	double area(){//Method Overriding
		return dim1 * dim2;
	}
}
class Triangle extends Shape{//inheritance
	Triangle(double d1, double d2){
		super(d1,d2);
	}
	double area(){//Method Overriding
		return 1.0/2.0 * dim1 * dim2;
	}
}
class MainDemoPolyAbstract{
	public static void main(String[] arg){
		//Shape s = new Shape(2,4);
		Reactangle r = new Reactangle(20,40);
		Triangle t = new Triangle(1.2,1.4);
		Shape p;//Parent class type variable
		//p = s;// p = new Shape(1,2);
		//double shapeArea = p.area();

		p = r;// p = new Reactangle(1,2);
		double reactArea = p.area();
		
		p = t;// p = new Triangle(1,2);
		double triangleArea = p.area();		
		//System.out.println("Shape Area:"+ shapeArea);
		System.out.println("Reactangle Area:"+ reactArea);
		System.out.println("Triangle Area:"+ triangleArea);

	}
}