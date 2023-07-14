class A{
	int i;
	int j;
	A(){
		System.out.println("A class Constructor");
		i = 10;
		j = 20;
	}
}
class B extends A{
	int k;
	B(){
		System.out.println("B class Constructor");
		k = 30;
	}
	void show(){
		System.out.println(i + " " + j + " "+ k);
	}
}
class C extends B{
	int l;
	C(){
		System.out.println("C class Constructor");
		l = 40;
	}
}
class MainDemoInheritConsSeq{
	public static void main(String[] arg){
		C objC = new C();
		//objB.show();
	}
	
}