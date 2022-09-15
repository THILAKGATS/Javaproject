
public class StatVar {
	static String course = "JAVA FULL STACK";//STATIC VARIABLE

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Details");//GLOBAL VARIABLE
		StatVar a = new StatVar();
		a.Thilak();
		
		
		
	
	}
	//METHOD 
	public void Thilak() {
		String name = "Thilak";//LOCAL VARIABLE
		System.out.println(name+" "+"have selected"+" "+course);
		
		
	}

}
