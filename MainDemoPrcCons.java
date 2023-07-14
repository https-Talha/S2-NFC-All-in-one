class PrcCons{
	int a;
	float b;
	PrcCons(int x, float y){
		a = x;
		b = y;	
	}
	void show(){
		System.out.println(" a:"+ a + " b:" + b);
	}
}


class MainDemoPrcCons{
	public static void main(String[] arg){
		PrcCons obj1 = new PrcCons(6000,0.75f);
		PrcCons obj2 = new PrcCons(9, 9.88f);
		obj1.show();
		obj2.show();
		/**obj2.a=5000;
		obj1.show();
		obj2.show();***/
	

	}
}