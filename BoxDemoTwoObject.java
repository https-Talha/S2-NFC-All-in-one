class Box{
	double width;
	double height;
	double depth;
}



class BoxDemoTwoObject{
	public static void main(String[] arg)
	{
		Box o1 = new Box();
		Box o2 = new Box();
		System.out.println("o1:"+ o1);
		System.out.println("o2:"+ o2);
		System.out.println("o1:"+ o1.width);
		System.out.println("o2:"+ o2.width);

		o1 =o2;
		System.out.println("o1:"+ o1);
		System.out.println("o2:"+ o2);
		System.out.println("o1:"+ o1.width);
		System.out.println("o2:"+ o2.width);
		//New Reference in o2		
		o2 = new Box();
		System.out.println("o1:"+ o1);
		System.out.println("o2:"+ o2);
		System.out.println("o1:"+ o1.width);
		System.out.println("o2:"+ o2.width);

		o2 = null;
		System.out.println("o1:"+ o1);
		System.out.println("o2:"+ o2);
		System.out.println("o1:"+ o1.width);
		System.out.println("o2:"+ o2.width);



	}	
}