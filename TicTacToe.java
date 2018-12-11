package ari;

import java.util.*;

public class TicTacToe {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println();
		int x[]=new int[9];
		int o[]=new int[9];
		char[][] arrInt = { {'1', '2','3' }, { '4', '5', '6' },{'7','8','9' } };
		int q=0,w=0;
		int a=0;
		for(int t=0;t<3;t++)
		{
			for(int y=0;y<3;y++)
			{
				System.out.print(arrInt[t][y] +"\t");
			}
			System.out.println("");
		}
		char c='o';
		for(int i=0;i<9;i++)
		{
			if(a==0)
			{
				int f=0;
				char r='0';
				int m=0;
				if(c=='o')
				{
					c='x';
				}
				else
				{
					c='o';
				}
				while(f==0)
				{
					
					System.out.println("Enter the position of " +c +" :");
					System.out.println("Enter the pos (1-9) : ");
					r=sc.next().charAt(0);
					m=Character.getNumericValue(r);
					f=0;
					for(int t=0;t<3;t++)
					{
						for(int y=0;y<3;y++)
						{
							if(arrInt[t][y]==r) {
								arrInt[t][y]=c;
								f=1;
								break;
							}
						}
						
					}
					if(f==0)
					{
							System.out.println("Invalid input,Please try again.");
						
					}
				}
				for(int t=0;t<3;t++)
				{
					System.out.print(" [ ");
					for(int y=0;y<3;y++)
					{
						
						System.out.print(" | "+ arrInt[t][y]+" | ");
						
					}
					System.out.print(" ] ");
					System.out.println("");
				}
				if(c=='x')
				{
					
					x[q]=m;
					q+=1;
					if(q>=3) {
						int l=0;
						if((x[l]>=1)&&(x[l]<=3))
						{
							int temp1=x[l]+3;
							int temp2=temp1+3;
							int increment=1;
							for(int u=l+1;u<q;u++){
								if((temp1==x[u])||(temp2==x[u]))
								{
									increment+=1;
								}
							}
							if(increment==3)
							{
								System.out.println("X wins");
								a=1;
								break;
							}
						}
						if((x[l]>=4)&&(x[l]<=6))
						{
							int temp1=x[l]-3;
							int temp2=x[l]+3;
							int increment=1;
							for(int u=l+1;u<q;u++){
								if((temp1==x[u])||(temp2==x[u]))
								{
									increment+=1;
								}
							}
							if(increment==3)
							{
								System.out.println("X wins");
								a=1;
								break;
							}
						}
						if((x[l]>=7)&&(x[l]<=9))
						{
							int temp1=x[l]-3;
							int temp2=temp1-3;
							int increment=1;
							for(int u=l+1;u<q;u++){
								if((temp1==x[u])||(temp2==x[u]))
								{
									increment+=1;
								}
							}
							if(increment==3)
							{
								System.out.println("X wins");
								a=1;
								break;
							}
						} 
						if((x[l]>=1)&&(x[l]<=7))
						{
							int temp1=x[l]+1;
							int temp2=temp1+1;
							int increment=1;
							for(int u=l+1;u<q;u++){
								if((temp1==x[u])||(temp2==x[u]))
								{
									increment+=1;
								}
							}
							if(increment==3)
							{
								System.out.println("X wins");
								a=1;
								break;
							}
						}
						
						if((x[l]>=3)&&(x[l]<=9))
						{
							int temp1=x[l]-1;
							int temp2=temp1-1;
							int increment=1;
							for(int u=l+1;u<q;u++){
								if((temp1==x[u])||(temp2==x[u]))
								{
									increment+=1;
								}
							}
							if(increment==3)
							{
								System.out.println("X wins");
								a=1;
								break;
							}
						}
						
						if((x[l]==1)) 
						{
							int temp1=x[l]+4;
							int temp2=temp1+4;
							int increment=1;
							for(int u=l+1;u<q;u++){
								if((temp1==x[u])||(temp2==x[u]))
								{
									increment+=1;
								}
							}
							if(increment==3)
							{
								System.out.println("x wins");
								a=1;
								break;
							}
						}
						
						if(x[l]==3)
						{	int temp1=x[l]+2;
							int temp2=temp1+2;
							int increment=1;
							for(int u=l+1;u<q;u++){
								if((temp1==x[u])||(temp2==x[u]))
								{
									increment+=1;
								}
							}
							if(increment==3)
							{
								System.out.println("x wins");
								a=1;
								break;
							}
							
						}
						
						if((x[l]==7)) 
						{
							int temp1=x[l]-2;
							int temp2=temp1-2;
							int increment=1;
							for(int u=l+1;u<q;u++){
								if((temp1==x[u])||(temp2==x[u]))
								{
									increment+=1;
								}
							}
							if(increment==3)
							{
								System.out.println("x wins");
								a=1;
								break;
							}
						}

						if((x[l]==9)) 
						{
							int temp1=x[l]-4;
							int temp2=temp1-4;
							int increment=1;
							for(int u=l+1;u<q;u++){
								if((temp1==x[u])||(temp2==x[u]))
								{
									increment+=1;
								}
							}
							if(increment==3)
							{
								System.out.println("x wins");
								a=1;
								break;
							}
						}
						
						if(x[l]==5) {
							int temp1=x[l]+4;
							int temp2=x[l]-4;
							int increment=1;
							for(int u=l+1;u<q;u++){
								if((temp1==x[u])||(temp2==x[u]))
								{
									increment+=1;
								}
							}
							if(increment==3)
							{
								System.out.println("x wins");
								a=1;
								break;
							}
						}
						if(x[l]==5) {
							int temp1=x[l]+2;
							int temp2=x[l]-2;
							int increment=1;
							for(int u=l+1;u<q;u++){
								if((temp1==x[u])||(temp2==x[u]))
								{
									increment+=1;
								}
							}
							if(increment==3)
							{
								System.out.println("x wins");
								a=1;
								break;
							}
						}
					}
				}
				if(c=='o')
				{
					o[w]=m;
					w+=1;
					int l=0;
					if((o[l]>=1)&&(o[l]<=3))
					{
						int temp1=o[l]+3;
						int temp2=temp1+3;
						int increment=1;
						for(int u=l+1;u<w;u++){
							if((temp1==o[u])||(temp2==o[u]))
							{
								increment+=1;
							}
						}
						if(increment==3)
						{
							System.out.println("o wins");
							a=1;
							break;
						}
					}
					if((o[l]>=7)&&(o[l]<=9))
					{
						int temp1=o[l]-3;
						int temp2=temp1-3;
						int increment=1;
						for(int u=l+1;u<w;u++){
							if((temp1==o[u])||(temp2==o[u]))
							{
								increment+=1;
							}
						}
						if(increment==3)
						{
							System.out.println("o wins");
							a=1;
							break;
						}
					} 
					if((o[l]>=4)&&(o[l]<=6))
					{
						int temp1=o[l]-3;
						int temp2=o[l]+3;
						int increment=1;
						for(int u=l+1;u<w;u++){
							if((temp1==o[u])||(temp2==o[u]))
							{
								increment+=1;
							}
						}
						if(increment==3)
						{
							System.out.println("o wins");
							a=1;
							break;
						}
					} 
					if((o[l]>=1)&&(o[l]<=7))
					{
						int temp1=o[l]+1;
						int temp2=temp1+1;
						int increment=1;
						for(int u=l+1;u<w;u++){
							if((temp1==o[u])||(temp2==o[u]))
							{
								increment+=1;
							}
						}
						if(increment==3)
						{
							System.out.println("o wins");
							a=1;
							break;
						}
					}
					
					if((o[l]>=3)&&(o[l]<=9))
					{
						int temp1=o[l]-1;
						int temp2=temp1-1;
						int increment=1;
						for(int u=l+1;u<w;u++){
							if((temp1==o[u])|| (temp2==o[u]))
							{
								increment+=1;
								System.out.println(increment);
							}
						}
						if(increment==3)
						{
							System.out.println("hurray");
							System.out.println("o wins");
							a=1;
							break;
						}
					}
					
					if((o[l]==1)) 
					{
						int temp1=o[l]+4;
						int temp2=temp1+4;
						int increment=1;
						for(int u=l+1;u<w;u++){
							if((temp1==o[u])||(temp2==o[u]))
							{
								increment+=1;
							}
						}
						if(increment==3)
						{
							System.out.println("o wins");
							a=1;
							break;
						}
					}
					
					if(o[l]==3)
					{	int temp1=o[l]+2;
						int temp2=temp1+2;
						int increment=1;
						for(int u=l+1;u<w;u++){
							if((temp1==o[u])||(temp2==o[u]))
							{
								increment+=1;
							}
						}
						if(increment==3)
						{
							System.out.println("o wins");
							a=1;
							break;
						}
						
					}
					
					if((o[l]==7)) 
					{
						int temp1=o[l]-2;
						int temp2=temp1-2;
						int increment=1;
						for(int u=l+1;u<w;u++){
							if((temp1==o[u])||(temp2==o[u]))
							{
								increment+=1;
							}
						}
						if(increment==3)
						{
							System.out.println("o wins");
							a=1;
							break;
						}
					}

					if((o[l]==9)) 
					{
						int temp1=o[l]-4;
						int temp2=temp1-4;
						int increment=1;
						for(int u=l+1;u<w;u++){
							if((temp1==o[u])||(temp2==o[u]))
							{
								increment+=1;
							}
						}
						if(increment==3)
						{
							System.out.println("o wins");
							a=1;
							break;
						}
					}
					
					if(o[l]==5) {
						int temp1=o[l]+4;
						int temp2=o[l]-4;
						int increment=1;
						for(int u=l+1;u<w;u++){
							if((temp1==o[u])||(temp2==o[u]))
							{
								increment+=1;
							}
						}
						if(increment==3)
						{
							System.out.println("0 wins");
							a=1;
							break;
						}
					}
					if(o[l]==5) {
						int temp1=o[l]+2;
						int temp2=o[l]-2;
						int increment=1;
						for(int u=l+1;u<w;u++){
							if((temp1==o[u])||(temp2==o[u]))
							{
								increment+=1;
							}
						}
						if(increment==3)
						{
							System.out.println("o wins");
							a=1;
							break;
						}
					}
				}
				
			}
		}
		if(a==0)
		{
			System.out.println("Draw");
		}
	}
}
