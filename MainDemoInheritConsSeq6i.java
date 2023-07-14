class A{
	int i;
	int j;
	A(int a, int b){
		i = a;
		j = b;
	}

}
class B extends A{
	int k;
	B(int x, int y, int z){
		super(x,y);
		k = z;

	}
	void show(){
		System.out.println(i + " " + j + " "+ k);
	}
}
class MainDemoInheritConsSeq6i{
	public static void main(String[] arg){
		B objB = new B(1000,2000,3000);
		objB.show();
	}
	
}