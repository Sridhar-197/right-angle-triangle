import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    int n =sc.nextInt();
	    int n1 =sc.nextInt();
	    int i,j;
	    int a[][]=new int[n][n1];
	    for(i=0;i<n;i++)
	    {
	        for(j=0;j<n1;j++)
	        {
    if((i==0 && j==0)||(i+j==1))
     {
         System.out.print(a[i][j]+ " ");
     }
    
}
}
	for(i=n-1;i>=0;i--)
	{
	    for(j=n1-1;j>=0;j--)
	    {
	        if(i+j==n-1)
	        {
	            System.out.print(a[i][j]+ " ");
	        }
	        
	    }
	}
	
 for(i=0;i<n;i++)
	    {
	        for(j=0;j<n1;j++)
	        
{
    if((i==n-1 &&j==n-1)||(i+j==n))
     {
         System.out.print(a[i][j]+ " ");
     }
	}
}}
}