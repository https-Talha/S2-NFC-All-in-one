class Test
{
	long factorial(int n)	{
		long fact = 1;	
		for(int i= 1; i <= n; i++){
			fact = fact * i;
		}

		return fact;
	}
	char lowerCase(char ch)
	{
		if(ch>='A' && ch<='Z'){
			ch = (char)(ch + 32);
		}
		return ch;
	}
	char upperCase(char ch)
	{
		if(ch>='a' && ch<='z'){
			ch = (char)(ch - 32);
		}
		return ch;
	}
	long myPower(int n, int p){
		long pow = 1;
		for(int i=1; i <= p; i++){
			pow = pow * n;	
		}
		return pow;
	}
	void trianglePattern(){
		for(int r=1;r<=5;r++){
			for(int c=1;c<=r;c++){
				System.out.print("*");
			}
			System.out.print("\n");			
		}
	}	
}

class MainDemoTest{
	public static void main(String[] arg)
	{
		Test o = new Test();
		long factAns = o.factorial(5);

		System.out.println(5 +" factorial is "+ factAns);
		char lCase = o.lowerCase('A');
		System.out.println('A' +" lower Case "+ lCase);
		o.trianglePattern();		
		long numPow = o.myPower(2,4);
		System.out.println(numPow);
	}

}







