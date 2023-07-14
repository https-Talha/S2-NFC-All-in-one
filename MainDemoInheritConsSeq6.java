class A{
	int i;
	int j;
	A(int x, int y){
		i = x;
		j = y;
	}

}
class B extends A{
	int k;
	B(int z){

		k = z;
		super(10,20);
	}
	void show(){
		System.out.println(i + " " + j + " "+ k);
	}
}
class MainDemoInheritConsSeq6{
	public static void main(String[] arg){
		B objB = new B(1000);
		objB.show();
	}
	
}