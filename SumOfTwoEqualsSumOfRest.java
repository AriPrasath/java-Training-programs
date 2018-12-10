package ari;


import java.util.*;   //To use Scanner class

public class SumOfTwoEqualsSumOfRest {
	public static void main(String[] args) {
		int arr[]=new int[50];    //new array to get input from users
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of elements :");   //to get size of array
		int n=sc.nextInt();
		System.out.println("Enter the elements :");    //To get elements to store it in array
		for(int i=0;i<n;i++)
		{
				arr[i]=sc.nextInt() ;
		}

		int m=0,k,sum=0;       //initializing k for Store the remainder,m for presence of sum of two numbers in array is equal to be searched
		for(int i=0;i<n-1;i++)    //traverse array of elements from first
		{
				for(int p=i+1;p<n;p++)
				{
					sum=0;
					k=arr[i]+arr[p];	
					
					for(int j=0;j<n;j++)
					{
						
						if((i!=j)&&(p!=j))
						{
							sum+=arr[j];
						}
					}
					if(sum==k)
					{
						System.out.println("True");
						m=1;
						break;
					}
				}
				if(m==1)
				{
					break;
				}
		}
		if(m==0)
		{
			System.out.println("False");
		}
	}
}




