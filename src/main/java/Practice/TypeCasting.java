package Practice;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//widening
		byte b = 10;
		short s = b;
		System.out.println(s);
		short sh = 30;
		int i = sh;
		System.out.println(i);
		int a = 10;
		long lo = a;
		System.out.println(lo);
		long  ll = 30l;
		float f = ll;
		System.out.println(f);
		float fl = 40f;
		double d = fl;
		System.out.println(fl);
		//narrowing
		double dd = 30;
		float  ff = (float) dd;
		System.out.println(dd);
		int ab =130;
		byte ba =(byte)ab;
		System.out.println(ab);
		

	}

}
