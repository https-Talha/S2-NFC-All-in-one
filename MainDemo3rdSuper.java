class A{
	int i;
	int j;
	void show(){
		System.out.println("i:"+ i+" j:"+ j);
	}
	int sum(){
		return i+j;
	}
}
class B extends A
{
	int k;
	void show(){
		super.show();
		System.out.println(" k:"+ k);
	}	
	int sum(){
		
		return super.sum()+k;
	}
}
class MainDemo3rdSuper{
	public static void main(String[] arg){

		B objB = new B();

		objB.show();
		objB.i=10;
		objB.j=20;		
		objB.k=30;

		objB.show();

		int sumB=objB.sum();

		System.out.println("Sum of B i j & k:"+ sumB);
	}

}