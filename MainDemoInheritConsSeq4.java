class A{
	int i;
	int j;
}
class B extends A{
	int k;
	B(int x){
		k = x;
	}
	void show(){
		System.out.println(i + " " + j + " "+ k);
	}
}
class MainDemoInheritConsSeq4{
	public static void main(String[] arg){
		B objB = new B(1000);
		objB.show();
	}
	
}