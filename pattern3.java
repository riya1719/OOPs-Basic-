/* Pattern Program
 *  A
 *  A B 
 *  A B C
 *  A B C D
 *  A B C D E
 */

package
package demo;

public class pattern3 {
	
	public static void main(String[] args) throws Exception
	{
		int N = 5;
		for (int i = 1 ; i <= N; i++)
		{
			char ch = 65;

			for (int j = 1 ; j <=i; j++)
			 {
				System.out.print(ch++);
			 }
			
			 System.out.println();

		}


}
}
