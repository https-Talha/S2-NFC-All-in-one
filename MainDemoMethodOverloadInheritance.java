class MethodOverload{
	int square(int n){
		System.out.println("Integer Square Calling");
		return n*n;
	}
	void square(){
		System.out.println(2*2);
	}
	long square(long n){
		System.out.println("long Square Calling");
		return n*n;
	}
}
class B extends MethodOverload{
	float square(float n){
		System.out.println("float Square Calling");
		return n*n;
	}
	double square(double n){
		System.out.println("double Square Calling");
		return n*n;
	}

	
}
class MainDemoMethodOverloadInheritance{
	public static void main(String[] arg){
		B o = new B();
		int intSqr=o.square(5);
		o.square();
		long longSqr=o.square(500L);
		double dblSqr=o.square(2.5);
		float fltSqr=o.square(0.98f);
		System.out.println(5 + " integer square is:"+ intSqr);
		System.out.println(500 + " long square is:"+ longSqr);
		System.out.println(2.5 + " double square is:"+dblSqr);
		System.out.println(0.98 + " float square is:"+fltSqr);
	}
}


