class A{
	int i;
	int j;
	A(){
		i = 10;
		j = 20;
	}
	A(int a, int b){
		i = a;
		j = b;
	}
	A(int a){
		i = a;
		j = a;
	}
	A(A o){
		i = o.i;
		j = o.j;
	}


}
class B extends A{
	int k;
	B(int x, int y, int z){
		super(x,y);
		k = z;

	}
	B(int x, int y){
		super(x);
		k = y;
	}
	B(){
		super();
		k =30;
	}
	B(int x){
		super(x);
		k =x;
	}

	void show(){
		System.out.println(i + " " + j + " "+ k);
	}
}
class MainDemoInheritConsOverloading{
	public static void main(String[] arg){
		B obj1 = new B();
		B obj2 = new B(1000);
		B obj3 = new B(1000,2000);
		B obj4 = new B(1000,2000,3000);
		obj1.show();
		obj2.show();
		obj3.show();
		obj4.show();
	}
	
}