
public class SortingSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {55,41,7,8,9,15};
		SortingSearch at = new SortingSearch();
		at.search(arr);
		for(int ar:arr)
		{
			System.out.println(ar);
		}

	}
	public void search(int []arr1)
	{
		for(int i=0;i<arr1.length;i++)
		{
			for (int j=0;j<arr1.length;j++)
			{
				if(arr1[i]<arr1[j])
				{
					arr1[i]^=arr1[j];
					arr1[j]^=arr1[i];
					arr1[i]^=arr1[j];
					
				}
			}
		}
	}

}
