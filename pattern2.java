package demo;

public class pattern2 {
	
	public static void main(String[] args) throws Exception
	{
		int  N = 5;
		
		for (int i = 1 ; i <= N; i++)
		{
			for (int j = 1 ; j <= N-i+1; j++)
				 System.out.print(" ");

				
			    for(int k =1; k <= 2*i-1; k++)
				   System.out.print("1");
				
			    
				 System.out.println();

			}


			

		}
}



