package ari;

public class ReverseStringinbuilt {

	public static void main(String[] args) {           		 //main method
		
		
		String str = "Welcome";                      		//String
		char ch = 'l';				     		//Char
		String newString = str.substring(str.indexOf(ch));	//Creating String Subsrtring From the char to the end
		
		String result = str.substring(0,str.indexOf(ch));	//Creating String from Starting to the character.
		
		int j=newString.length()-1;				//Finding length of String to be reversed
		char arr[] = newString.toCharArray();			//Converting String to be reversed to char array
		
		for(int i=0;i<j;i++)					//Loop to reverse a String By using index Starting from 0 to length of it.
		{
			
				char temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				j--;
			
		}
		String s2=new String(arr);				//Converting Chararray to String 
		System.out.println(result+s2);				//Printing String as a whole
	}

}
