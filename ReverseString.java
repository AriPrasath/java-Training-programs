package ari;
import java.io.*;
import java.util.*;   //To use Scanner class

public class ReverseString {
		public static void main(String...args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the String");
			String s=sc.next();
			System.out.println("Enter the character");
			char find=sc.next().charAt(0);
			char[] arr=s.toCharArray();
			int n=s.length();
			int j=n-1;
			int m=0;
			for(int i=0;i<j;i++)
			{
				if((arr[i]==find))
				{
					m=1;
				}
				if(m==1)
				{
					char temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					j--;
				}
			}
			String s2=new String(arr);
			System.out.println(s2);
			
			
			
			
		}
}
