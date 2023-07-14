class A{
	int i;
	int j;
	A(){
		i = 10;
		j = 20;
	}

}
class B extends A{
	int i;
	B(){
		i = 30;
	}
	void show(){
		System.out.println(super.i + " " + j + " "+ i);
	}
}
class MainDemo2ndSuper{
	public static void main(String[] arg){
		B objB = new B();
		objB.show();
	}
	
}