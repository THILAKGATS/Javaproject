import java.util.Scanner;

public class CollegeAdmission {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Hi,WELCOME TO THE COLLEGE ADMISSION ZONE");
		System.out.println("Please select the required College, LawCollege <EngineeringColllege<Medical College<Arts and Science College");
		String admission = scan.nextLine();
		switch(admission)
		{
		case "LawCollege":
			System.out.println("Please fill the required cutoff mark for the list of college vailable");
			System.out.println("Enter the cutoff mark here:");
			int cutoff = scan.nextInt();
			if(cutoff>60&&cutoff<=75)
			{
				System.out.println("The available college for this cut off is,CentralCollege<PrivateCollege");
				String types = scan.next();
				switch(types)
				{
				case "CentralCollege":
					System.out.println("WE HAVE 100% PLACEMENT WITH GOOD INFRASTRUCTURE");
					break;
				case "PrivateCollege":
					System.out.println("WE WILL PROVIDE VIRTUAL OPPORTUNITIES,WITH 100%PLACEMENT");
					break;
				
				}
				break;
				
			}
			else if(cutoff>76&&cutoff<=100)
			{
				System.out.println("The available college for this cut off is, Goverment Law college");
			}
			else 
			{
				System.out.println("law college not availbe for the 60 below cutoff");
			}
		
			
			
			
			
			
		
			
			
			
			
		}
	}

}
