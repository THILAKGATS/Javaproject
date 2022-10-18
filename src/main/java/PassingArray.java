import java.util.Arrays;

public class PassingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a = {20,30,40,50};
		System.out.println(Arrays.toString(a));
		PassingArray var = new PassingArray();
		var.passing(a);
	}
	public void passing(int []a1)
	{
		System.out.println(a1.length);
		a1[2] = 50;
		System.out.println(Arrays.toString(a1));
	}
	

}
