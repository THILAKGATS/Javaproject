import java.util.Arrays;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {20,30,40,50,60};
		System.out.println("Original"+Arrays.toString(a));
		Practice b = new Practice();
		b.search(a);
		String [] name = {"Thilak" , "Praddep" , "Thivin" , "Vishnu" , "Ganesh"};
		b.update(name);

	}
	public void search(int[] c)
	{
		System.out.println(c.length);
		c[0]=90;
		System.out.println("changed one"+Arrays.toString(c));
		
	}
	public void update(String [] name1)
	{
		name1 [0] = "rock";
		System.out.println(Arrays.toString(name1));
	}

}
