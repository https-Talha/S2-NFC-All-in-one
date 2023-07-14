class MyConstructor{
	int a; 	float b;
	MyConstructor(int x, float y) {
		
		a=x;
		b=y;
	}



	void show()
	{
		System.out.println("Constructor Called");
		System.out.println("a:"+ a + " b:" + b);
	}
}//End of MyTest
class MainDemoMyConstructor{
	public static void main(String[] arg){
		MyConstructor o1= new MyConstructor(20, 4.5f);
		MyConstructor o2= new MyConstructor(60,7.8f);
		o1.show();
		o2.show();
	}
}


