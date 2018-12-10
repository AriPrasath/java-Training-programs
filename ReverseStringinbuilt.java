package ari;

public class ReverseStringinbuilt {

	public static void main(String[] args) {
		
		
		String str = "Welcome";
		char ch = 'l';
		String newString = str.substring(str.indexOf(ch));
		
		String result = str.substring(0,str.indexOf(ch));
		
		int j=newString.length()-1;
		char arr[] = newString.toCharArray();
		
		for(int i=0;i<j;i++)
		{
			
				char temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				j--;
			
		}
		String s2=new String(arr);
		System.out.println(newString);
	}

}
