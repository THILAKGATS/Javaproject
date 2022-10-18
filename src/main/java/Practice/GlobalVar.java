package Practice;

public class GlobalVar {
	int a= 10;
	int b = 20;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GlobalVar a = new GlobalVar();
		a.cal();  
		

	}
	public void cal()
	{
		System.out.println(a);
		System.out.println(b);
		
	}

}
