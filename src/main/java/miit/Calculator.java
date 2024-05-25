package miit;

import miit.Calculator;

public class Calculator {
	
	int a;
	int b;
	static int sum;
	static int mul;
	static int sub;
	static int div;
	
	
	
	public Calculator()
	{
		a=20;
		b=5;
		sum=a+b;
		mul=a*b;
		sub=a-b;
		div=a/b;
	}
	
	
	
	public static void main(String[] args) {
		
       Calculator obj=new Calculator();
       Calculator obj1=new Calculator();
       Calculator obj2=new Calculator();
       Calculator obj3=new Calculator();
       System.out.println("sum"+"="+ obj.sum);
       System.out.println("mul"+"="+ obj1.mul);
       System.out.println("sub"+"="+ obj2.sub);
       System.out.println("div"+"="+ obj3.div);
       
	}

}
