class A{
	int i;
	int j;
	A(){
		i = 10;
		j = 20;
	}
}
class B extends A{
	int k;
	B(){
		k = 30;
	}
	void show(){
		System.out.println(i + " " + j + " "+ k);
	}
}
class MainDemoInheritConsSeq3{
	public static void main(String[] arg){
		B objB = new B();
		objB.show();
	}
	
}