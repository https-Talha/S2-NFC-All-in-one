class A{
	int i;
	int j;
}
class B extends A{
	int k;
	B(){
		System.out.println("B class Constructor");
		//i = 10;
		//j = 20;
		k = 30;
	}
	void show(){
		System.out.println(i + " " + j + " "+ k);
	}
}
class MainDemoInheritConsSeq2{
	public static void main(String[] arg){
		B objB = new B();
		objB.show();
	}
	
}