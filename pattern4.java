/* Pattern Program
 *  2
 *  2 4
 *  2 4 6
 *  2 4 6 8
 *  2 4 6 8 10
 */

package demo;

public class pattern4 {
	
	public static void main(String[] args) throws Exception
	{
		int N = 5;
		for (int i = 1 ; i <= N; i++)
		{
			int num = 2;

			for (int j = 1 ; j <=i; j++)
			 {
				System.out.print(2*j + " ");
			 }
			
			 System.out.println();

		}


}

}
