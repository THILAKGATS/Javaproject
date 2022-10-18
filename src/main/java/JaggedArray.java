
public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] jarr = new int[3][];
		jarr[0] = new int [3];
		jarr[1] = new int [4];
		jarr[2] = new int [5];
		int count = 0;
		for(int column =0;column<3;column++)
		{
			for(int row=0;row<jarr[column].length;row++)
			{
				jarr[column][row]=count+=10;
			}
		}
		for(int column =0;column<3;column++)
		{
			for(int row=0;row<jarr[column].length;row++)
			{
				System.out.print(jarr[column][row]);
			}
			System.out.println();
		}
		

	}

}
