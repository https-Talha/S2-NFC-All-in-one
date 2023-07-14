class A{
	int i;
	int j;
	void showij(){
		System.out.println("i:"+ i+" j:"+ j);
	}
	int sumij(){
		return i+j;
	}
}
class B extends A
{
	int k;
	void showijk(){

		//System.out.println("i:"+ i+" j:"+ j +" k:"+ k);		
		showij();
		System.out.println(" k:"+ k);
	}	
	int sumijk(){
		//return i+j+k;
		return sumij()+k;
	}
}
class MainDemoInherit{
	public static void main(String[] arg){
		A objA = new A();
		B objB = new B();
		objA.showij();
		objB.showijk();
		objA.i= 1000;
		objA.j=2000;
		objB.i=10;
		objB.j=20;		
		objB.k=30;
		objA.showij();
		objB.showijk();
		int sumA=objA.sumij();
		int sumB=objB.sumijk();
		System.out.println("Sum of A i&j:"+ sumA);
		System.out.println("Sum of B i j & k:"+ sumB);
	}

}