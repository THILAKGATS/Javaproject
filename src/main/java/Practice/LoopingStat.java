package Practice;

public class LoopingStat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoopingStat at = new LoopingStat();
		at.forsam();
		at.whilesam();
		
	
	}
	public void forsam()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("THILAK");
		}
	}
	public void whilesam()
	{
		int a = 10;
		while(a>=7)
		{
			System.out.println(a);
			a++;
		}
		
	}
	

}
