
public class ShiftSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long a = 10l ;
		long b = 5l;
		System.out.println(a>>b);
		System.out.println(a<<b);
		ShiftSample t = new ShiftSample();
		t.shift();

	}
	public void shift() {
		int a = 20;
		int b = 2;
		System.out.println(a>>b);
		System.out.println(a<<b);
	}

}
