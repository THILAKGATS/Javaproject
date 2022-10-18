package Practice;

public class OperatorsSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OperatorsSample ab = new OperatorsSample();
		ab.arthimetic();
		ab.assignment();
		ab.relational();
		ab.logical();
		ab.bitwise();
		ab.shift();

	}
	public void arthimetic()
	{
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(c);
		System.out.println(a/b);
		System.out.println(a-b);
		System.out.println(a%b);
	}
	public void assignment()
	{
		int a = 20;
		int b = 10;
		b+=5;
		a-=5;
		System.out.println(b);
	}
	public void relational()
	{
		int a = 10;
		int b = 20;
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a<=b);
		System.out.println(a>=b);
		System.out.println(a==b);
	}
	public void logical()
	{
		int a = 20;
		int b = 30;
		int c = 40;
		System.out.println(a>b && a<b);
		System.out.println(a>b || a<b);
		System.out.println(!(b<c));
	}
	public void bitwise()
	{
		int a = 20;
		int b = 40;
		System.out.println(a|b);
		System.out.println(a&b);
		System.out.println(a^b);
	}
	public void shift()
	{
		int a = 30;
		int b = 50;
		System.out.println(a>>b);
		System.out.println(a<<b);
	}

}

