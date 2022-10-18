package Practice;

public class TypesofVar {
	static int ab = 40;                            //static variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ab);
		float b = 30.40f;
		float g = 40.50f;                          //Instant variable
		System.out.println(b+g);
		TypesofVar var = new TypesofVar();
		var.display();
	}
	public void display()
	{
		int b = 10;
		System.out.println(b);                     //local variables
		System.out.println(ab);
	}

}
 