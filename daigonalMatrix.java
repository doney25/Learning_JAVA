package w3resource;

import java.util.Scanner;

public class daigonalMatrix {
 public static void main(String [] args) {
	 Scanner sc = new Scanner(System.in);
	 int ROW_SIZE,COLUMN_SIZE;
	 System.out.println("Enter the Rows and Columns:");
	 ROW_SIZE=sc.nextInt();
	 COLUMN_SIZE=sc.nextInt();
	 int[][] matrix = new int [ROW_SIZE][COLUMN_SIZE];
	 int i,j;
	 System.out.println("Enter the values:");
	 for(i=0;i<ROW_SIZE;i++)
	 {
		 for(j=0;j<COLUMN_SIZE;j++)
		 {
			 matrix[i][j]=sc.nextInt();
		 }
	 }
   //making 0
 
	 for(i=0;i<ROW_SIZE;i++)
	 {
		 for(j=0;j<COLUMN_SIZE;j++)
		 {
			 if(i==j)
			 {
				matrix[i][j]=0; 
			 }
		if(j==COLUMN_SIZE-i-1)
		{
			matrix[i][j]=0;
		}
		 
		 }
	 
	  }
System.out.println("The Given Matrix:");
for(i=0;i<ROW_SIZE;i++)
{
	 for(j=0;j<COLUMN_SIZE;j++)
	 {
		 System.out.print(matrix[i][j]+" ");
		 
	 }
	 System.out.println();
}
 }
}
