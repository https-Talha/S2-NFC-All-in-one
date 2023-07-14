class ConsOverload{
	int a;
	float b;
	ConsOverload(){
		a = 10;
		b = 2.5f;
	}
	ConsOverload(int x, int y){
		a = x;
		b = y;
		
	}
	ConsOverload(float x){
		a = (int)x;
		b = x;
	}	
	void show(){
		System.out.println(" a:"+ a + " b:" + b);
	}
}


class MainDemoConsOverload{
	public static void main(String[] arg){
		ConsOverload obj1 = new ConsOverload(6000,220);
		ConsOverload obj2 = new ConsOverload(9.88f);
		ConsOverload obj3 = new ConsOverload();
		obj1.show();
		obj2.show();
		obj3.show();
		/**obj2.a=5000;
		obj1.show();
		obj2.show();***/
	

	}
}