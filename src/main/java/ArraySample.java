import java.util.Arrays;

public class ArraySample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []b = {10,20,30,40};
		System.out.println(b);
		System.out.println(Arrays.toString(b));//to string
		for(int a=0;a<b.length;a++)//for loop
		{
			System.out.println(b[a]);
		}
		for(int c:b)//for each
		{
		System.out.println(c);	
		}

	}

}
