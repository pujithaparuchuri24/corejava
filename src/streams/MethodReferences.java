package streams;


public class MethodReferences {
	public static int add(int a, int b)
	{
		return a+b;
	}
	public static int add1(int a, int b, int c) {
		return a+b+c;
	}
	

	public static void main(String[] args) {

	add b=MethodReferences::add;
   int c=	b.add(9, 99);
	System.out.print(c);
	
	}

}


interface add
{
	int add(int a, int b);
}