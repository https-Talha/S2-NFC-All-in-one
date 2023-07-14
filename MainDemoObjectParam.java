class ObjectParam{
	int a;
	float b;
	ObjectParam(int x, float y){
		a = x;
		b = y;
		//x =80;
	}
	ObjectParam(ObjectParam obj){
		a = obj.a;
		b = obj.b;
	}
	void show(){
		System.out.println("a:"+ a + " b:"+ b);
	}
}
class MainDemoObjectParam{
	public static void main(String[] arg){
		ObjectParam o1 = new ObjectParam(10, 4.5f);
		ObjectParam o2 = new ObjectParam(o1.a, o1.b);
		ObjectParam o3 = new ObjectParam(o2);		
		o1.show();
		o2.show();
		o2.a=4000;
		o1.show();
		o2.show();

	}
}




