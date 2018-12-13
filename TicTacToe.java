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
		for(int i=0;i<4;i++)
		{
			if(a==0)
			{
				int f=0;
				char r='x';
				int m=0;
	
				while(f==0)
				{
					
					System.out.println("Enter the position of x :");
					System.out.println("Enter the pos (1-9) : ");
					m=sc.nextInt();
					char ch=(char)(m+'0');
					f=0;
					for(int t=0;t<3;t++)
					{
						for(int y=0;y<3;y++)
						{
							if(arrInt[t][y]==ch) {
								arrInt[t][y]='x';
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
				if(r=='x')
				{
					
					x[q]=m;
					q+=1;
					
					if(q>=3) {
						int l=-1;
						if((m>=1)&&(m<=3))
						{
							int temp1=m+3;
							int temp2=temp1+3;
							int increment=1;
							for(int u=l+1;u<q-1;u++){
								if((temp1==x[u])||(temp2==x[u]))
								{
									increment+=1;
								}
							}
							if(increment==3)
							{
								System.out.println("X wins1");
								a=1;
								break;
							}
						}
						if(( m>=4)&&(m<=6))
						{
							int temp1=m-3;
							int temp2=m+3;
							int increment=1;
							for(int u=l+1;u<q-1;u++){
								if((temp1==x[u])||(temp2==x[u]))
								{
									increment+=1;
								}
							}
							if(increment==3)
							{
								System.out.println("X wins2");
								a=1;
								break;
							}
						}
						if((m>=7)&&(m<=9))
						{
							int temp1=m-3;
							int temp2=temp1-3;
							int increment=1;
							for(int u=l+1;u<q-1;u++){
								if((temp1==x[u])||(temp2==x[u]))
								{
									increment+=1;
								}
							}
							if(increment==3)
							{
								System.out.println("X wins3");
								a=1;
								break;
							}
						} 
						if((m==1)||(m==7)||(m==4))
						{
							int temp1=m+1;
							int temp2=temp1+1;
							int increment=1;
							for(int u=l+1;u<q-1;u++){
								if((temp1==x[u])||(temp2==x[u]))
								{
									increment+=1;
								}
							}
							if(increment==3)
							{
								System.out.println("X wins4");
								a=1;
								break;
							}
						}
						
						if((m==3)||(m==9)||(m==6))
						{
							int temp1=m-1;
							int temp2=temp1-1;
							int increment=1;
							for(int u=l+1;u<q-1;u++){
								if((temp1==x[u])||(temp2==x[u]))
								{
									increment+=1;
								}
							}
							if(increment==3)
							{
								System.out.println("X wins5");
								a=1;
								break;
							}
						}												
						if((m==1)) 
						{
							int temp1=m+4;
							int temp2=temp1+4;
							int increment=1;
							for(int u=l+1;u<q-1;u++){
								if((temp1==x[u])||(temp2==x[u]))
								{
									increment+=1;
								}
							}
							if(increment==3)
							{
								System.out.println("x wins6");
								a=1;
								break;
							}
						}
						
						if(m==3)
						{	int temp1=m+2;
							int temp2=temp1+2;
							int increment=1;
							for(int u=l+1;u<q-1;u++){
								if((temp1==x[u])||(temp2==x[u]))
								{
									increment+=1;
								}
							}
							if(increment==3)
							{
								System.out.println("x wins7");
								a=1;
								break;
							}
							
						}
						
						if((m==7)) 
						{
							int temp1=m-2;
							int temp2=temp1-2;
							int increment=1;
							for(int u=l+1;u<q-1;u++){
								if((temp1==x[u])||(temp2==x[u]))
								{
									increment+=1;
								}
							}
							if(increment==3)
							{
								System.out.println("x wins8");
								a=1;
								break;
							}
						}

						if((m==9)) 
						{
							int temp1=m-4;
							int temp2=temp1-4;
							int increment=1;
							for(int u=l+1;u<q-1;u++){
								if((temp1==x[u])||(temp2==x[u]))
								{
									increment+=1;
								}
							}
							if(increment==3)
							{
								System.out.println("x wins9");
								a=1;
								break;
							}
						}
						
						if(m==5) {
							int temp1=m+4;
							int temp2=m-4;
							int increment=1;
							for(int u=l+1;u<q-1;u++){
								if((temp1==x[u])||(temp2==x[u]))
								{
									increment+=1;
								}
							}
							if(increment==3)
							{
								System.out.println("x wins10");
								a=1;
								break;
							}
						}
						if(m==5) {
							int temp1=m+2;
							int temp2=m-2;
							int increment=1;
							for(int u=l+1;u<q-1;u++){
								if((temp1==x[u])||(temp2==x[u]))
								{
									increment+=1;
								}
							}
							if(increment==3)
							{
								System.out.println("x wins11");
								a=1;
								break;
							}
						}
						if((m==2)||(m==5)||(m==8))
						{
							int temp1=m-1;
							int temp2=temp1+2;
							int increment=1;
							for(int u=l+1;u<q-1;u++){
								if((temp1==x[u])||(temp2==x[u]))
								{
									increment+=1;
								}
							}
							if(increment==3)
							{
								System.out.println("X wins12");
								a=1;
								break;
							}
						}
					}
				}
				
				
				
				if(i<4)
				{
					r='o';
					int g=Get(m,x,q,o);
					
					int h=0;
					int tempp = 0;
					if(w>=2)
					{
						for(int z=1;z<=9;z++)
						{
							 h=Get1(z,o,w);
							 
							 if(h!=0)
							 {
								 int to=1;
								 while((tempp==0)&&(to==1))
									{
										char ch=(char)(h+'0');
										for(int t=0;t<3;t++)
										{
											for(int y=0;y<3;y++)
											{
												if(arrInt[t][y]==ch) {
													tempp=1;
													break;
												}
											}
											if(tempp==1)
											 {
												 break;
											 }	
										}
										to+=1;
									}
							 }
							 if(tempp==1)
							 {
								 break;
							 }
						}
					}
					
					if(tempp==1){
						g=h;
					}
					tempp=0;
					while(tempp==0)
					{
						char ch=(char)(g+'0');
						for(int t=0;t<3;t++)
						{
							for(int y=0;y<3;y++)
							{
								if(arrInt[t][y]==ch) {
									arrInt[t][y]='o';
									tempp=1;
									break;
								}
							}
								
						}
						if(tempp==0)
						{
							g+=1;
						}
						if (g>9){
							g=1;
						}
					}
					System.out.println("System palayed at  " + g);
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
					m=g;
					System.out.println();
					if(r=='o')
					{
						
						o[w]=m;
						w+=1;
					
						if(w>=3) {
							int l=-1;
							if((m>=1)&&(m<=3))
							{
								int temp1=m+3;
								int temp2=temp1+3;
								int increment=1;
								for(int u=l+1;u<w-1;u++){
									if((temp1==o[u])||(temp2==o[u]))
									{
										increment+=1;
									}
								}
								if(increment==3)
								{
									System.out.println("o wins1");
									a=1;
									break;
								}
							}
							if(( m>=4)&&(m<=6))
							{
								int temp1=m-3;
								int temp2=m+3;
								int increment=1;
								for(int u=l+1;u<w-1;u++){
									if((temp1==o[u])||(temp2==o[u]))
									{
										increment+=1;
									}
								}
								if(increment==3)
								{
									System.out.println("o wins2");
									a=1;
									break;
								}
							}
							if((m>=7)&&(m<=9))
							{
								int temp1=m-3;
								int temp2=temp1-3;
								int increment=1;
								for(int u=l+1;u<w-1;u++){
									if((temp1==o[u])||(temp2==o[u]))
									{
										increment+=1;
									}
								}
								if(increment==3)
								{
									System.out.println("o wins3");
									a=1;
									break;
								}
							} 
							if((m==1)||(m==7)||(m==4))
							{
								int temp1=m+1;
								int temp2=temp1+1;
								int increment=1;
								for(int u=l+1;u<w-1;u++){
									if((temp1==o[u])||(temp2==o[u]))
									{
										increment+=1;
									}
								}
								if(increment==3)
								{
									System.out.println("o wins4");
									a=1;
									break;
								}
							}
							
							if((m==3)||(m==9)||(m==6))
							{
								int temp1=m-1;
								int temp2=temp1-1;
								int increment=1;
								for(int u=l+1;u<w-1;u++){
									if((temp1==o[u])||(temp2==o[u]))
									{
										increment+=1;
									}
								}
								if(increment==3)
								{
									System.out.println("o wins5");
									a=1;
									break;
								}
							}												
							if((m==1)) 
							{
								int temp1=m+4;
								int temp2=temp1+4;
								int increment=1;
								for(int u=l+1;u<w-1;u++){
									if((temp1==o[u])||(temp2==o[u]))
									{
										increment+=1;
									}
								}
								if(increment==3)
								{
									System.out.println("o wins6");
									a=1;
									break;
								}
							}
							
							if(m==3)
							{	int temp1=m+2;
								int temp2=temp1+2;
								int increment=1;
								for(int u=l+1;u<w-1;u++){
									if((temp1==o[u])||(temp2==o[u]))
									{
										increment+=1;
									}
								}
								if(increment==3)
								{
									System.out.println("o wins7");
									a=1;
									break;
								}
								
							}
							
							if((m==7)) 
							{
								int temp1=m-2;
								int temp2=temp1-2;
								int increment=1;
								for(int u=l+1;u<w-1;u++){
									if((temp1==o[u])||(temp2==o[u]))
									{
										increment+=1;
									}
								}
								if(increment==3)
								{
									System.out.println("o wins8");
									a=1;
									break;
								}
							}

							if((m==9)) 
							{
								int temp1=m-4;
								int temp2=temp1-4;
								int increment=1;
								for(int u=l+1;u<w-1;u++){
									if((temp1==o[u])||(temp2==o[u]))
									{
										increment+=1;
									}
								}
								if(increment==3)
								{
									System.out.println("o wins9");
									a=1;
									break;
								}
							}
							
							if(m==5) {
								int temp1=m+4;
								int temp2=m-4;
								int increment=1;
								for(int u=l+1;u<w-1;u++){
									if((temp1==o[u])||(temp2==o[u]))
									{
										increment+=1;
									}
								}
								if(increment==3)
								{
									System.out.println("o wins10");
									a=1;
									break;
								}
							}
							if(m==5) {
								int temp1=m+2;
								int temp2=m-2;
								int increment=1;
								for(int u=l+1;u<w-1;u++){
									if((temp1==o[u])||(temp2==o[u]))
									{
										increment+=1;
									}
								}
								if(increment==3)
								{
									System.out.println("0 wins11");
									a=1;
									break;
								}
							}
							if((m==2)||(m==5)||(m==8))
							{
								int temp1=m-1;
								int temp2=temp1+2;
								int increment=1;
								for(int u=l+1;u<w-1;u++){
									if((temp1==o[u])||(temp2==o[u]))
									{
										increment+=1;
									}
								}
								if(increment==3)
								{
									System.out.println("o wins12");
									a=1;
									break;
								}
							}
						}
					}
				}
			}
		}
		if(a==0)
		{
			System.out.println("Draw");
		}
		sc.close();
	}
	public static int Get(int m,int x[],int q,int o[])
	{
		int g=0;
		if(q==1)
		{
			if(m!=5)
			{
				g=5;
			}
			else {
				g= 9;
			}
			
		}//else if(q==2){
			
		//}
		
		else if(q>1)
		{
			int l=q-3;
				int f=1;
				if(q==2)
				{
					f=0;
					if((m==1)&&(o[0]!=5)){
						g=3;
						f=1;
					}
					else if((m==3)&&(o[0]!=5))
					{
						g=7;
						f=1;
					}
					else if((m==7)&&(o[0]!=5))
					{
						g=3;
						f=1;
					}
					else if(m==1) {
						int temp1=m+1;
						int temp2=temp1+1;
						int temp3=m+4;
						int temp4=temp3+4;
						int temp5=m+3;
						int temp6=temp5+3;
						int increment1=1;
						int increment2=1;
						int increment3=1;
						for(int u=0;u<q && (increment1<2 && increment2<2 && increment3<2);u++) {
							if((x[u]==temp1))
							{
								increment1+=1;
								g=temp2;
								f=1;
							}
							else if(x[u]==temp2){
								increment1+=1;
								g=temp1;
								f=1;
							}
							else if((x[u]==temp3))
							{
								increment2+=1;
								g=temp4;
								f=1;
							}
							else if((x[u]==temp4)){
								increment2+=1;
								g=temp3;
								f=1;
							}
							else if((x[u]==temp5))
							{
								increment3+=1;
								g=temp6;
								f=1;
							}
							else if(x[u]==temp6){
								increment3+=1;
								g=temp5;
								f=1;
							}	
						}	
						
					}
					if(m==2) {
						int temp1=m+1;
						int temp2=m-1;
						int temp5=m+3;
						int temp6=temp5+3;
						int increment1=1;
						int increment3=1;
						for(int u=0;u<q && (increment1<2 && increment3<2);u++) {
							if((x[u]==temp1))
							{
								increment1+=1;
								g=temp2;
								f=1;
							}
							else if(x[u]==temp2){
								increment1+=1;
								g=temp1;
								f=1;
							}

							else if((x[u]==temp5))
							{
								increment3+=1;
								g=temp6;
								f=1;
							}
							else if(x[u]==temp6){
								increment3+=1;
								g=temp5;
								f=1;
							}	
						}	
						
					}
					if(m==3) {
						int temp1=m-1;
						int temp2=temp1-1;
						int temp3=m+2;
						int temp4=temp3+2;
						int temp5=m+3;
						int temp6=temp5+3;
						int increment1=1;
						int increment2=1;
						int increment3=1;
						for(int u=0;u<q && (increment1<2 && increment2<2 && increment3<2);u++) {
							if((x[u]==temp1))
							{
								increment1+=1;
								g=temp2;
								f=1;
							}
							else if(x[u]==temp2){
								increment1+=1;
								g=temp1;
								f=1;
							}
							else if((x[u]==temp3))
							{
								increment2+=1;
								g=temp4;
								f=1;
							}
							else if((x[u]==temp4)){
								increment2+=1;
								g=temp3;
								f=1;
							}
							else if((x[u]==temp5))
							{
								increment3+=1;
								g=temp6;
								f=1;
							}
							else if(x[u]==temp6){
								increment3+=1;
								g=temp5;
								f=1;
							}	
						}	
					}
					
					if(m==4) {
						int temp1=m+1;
						int temp2=m+2;
						int temp5=m-3;
						int temp6=temp5+6;
						int increment1=1;
						int increment3=1;
						for(int u=0;u<q && (increment1<2 && increment3<2);u++) {
							if((x[u]==temp1))
							{
								increment1+=1;
								g=temp2;
								f=1;
							}
							else if(x[u]==temp2){
								increment1+=1;
								g=temp1;
								f=1;
							}

							else if((x[u]==temp5))
							{
								increment3+=1;
								g=temp6;
								f=1;
							}
							else if(x[u]==temp6){
								increment3+=1;
								g=temp5;
								f=1;
							}	
						}	
					}
					else if(m==5) {
						int temp1=m-1;
						int temp2=m+1;
						int temp3=m+2;
						int temp4=temp3-4;
						int temp5=m-3;
						int temp6=temp5+6;
						int temp7=m-4;
						int temp8=temp7+8;
						int increment1=1;
						int increment2=1;
						int increment3=1;
						int increment4=1;
						for(int u=0;u<q && (increment1<2 && increment2<2 && increment3<2 );u++) {
							if((x[u]==temp1))
							{
								increment1+=1;
								g=temp2;
								f=1;
							}
							else if(x[u]==temp2){
								increment1+=1;
								g=temp1;
								f=1;
							}
							else if((x[u]==temp3))
							{
								increment2+=1;
								g=temp4;
								f=1;
							}
							else if((x[u]==temp4)){
								increment2+=1;
								g=temp3;
								f=1;
							}
							else if((x[u]==temp5))
							{
								increment3+=1;
								g=temp6;
								f=1;
							}
							else if(x[u]==temp6){
								increment3+=1;
								g=temp5;
								f=1;
							}else if(x[u]==temp7){
								increment4+=1;
								g=temp1;
								f=1;
							}
							else if((x[u]==temp8))
							{
								increment4+=1;
								g=temp4;
								f=1;
							}	
						}	
					}
					else if(m==6) {
						int temp1=m-1;
						int temp2=m-2;
						int temp5=m-3;
						int temp6=temp5+6;
						int increment1=1;
						int increment3=1;
						for(int u=0;u<q && (increment1<2 && increment3<2);u++) {
							if((x[u]==temp1))
							{
								increment1+=1;
								g=temp2;
								f=1;
							}
							else if(x[u]==temp2){
								increment1+=1;
								g=temp1;
								f=1;
							}

							else if((x[u]==temp5))
							{
								increment3+=1;
								g=temp6;
								f=1;
							}
							else if(x[u]==temp6){
								increment3+=1;
								g=temp5;
								f=1;
							}	
						}
					}
					else if(m==7) {
						int temp1=m+1;
						int temp2=temp1+1;
						int temp3=m-2;
						int temp4=temp3-2;
						int temp5=m-3;
						int temp6=temp5-3;
						int increment1=1;
						int increment2=1;
						int increment3=1;
						for(int u=0;u<q && (increment1<2 && increment2<2 && increment3<2 );u++) {
							if((x[u]==temp1))
							{
								increment1+=1;
								g=temp2;
								f=1;
								break;
							}
							else if(x[u]==temp2){
								increment1+=1;
								g=temp1;
								f=1;
								break;
							}
							else if((x[u]==temp3))
							{
								increment2+=1;
								g=temp4;
								f=1;
								break;
							}
							else if((x[u]==temp4)){
								increment2+=1;
								g=temp3;
								f=1;
								break;
							}
							else if((x[u]==temp5))
							{
								increment3+=1;
								g=temp6;
								f=1;
								break;
							}
							else if(x[u]==temp6){
								increment3+=1;
								g=temp5;
								f=1;
								break;
							}	
						}	
					}
					else if(m==8) {
						int temp1=m-1;
						int temp2=m+1;
						int temp5=m-3;
						int temp6=temp5-3;
						int increment1=1;
						int increment3=1;
						for(int u=0;u<q && (increment1<2 && increment3<2);u++) {
							if((x[u]==temp1))
							{
								increment1+=1;
								g=temp2;
								f=1;
							}
							else if(x[u]==temp2){
								increment1+=1;
								g=temp1;
								f=1;
							}

							else if((x[u]==temp5))
							{
								increment3+=1;
								g=temp6;
								f=1;
							}
							else if(x[u]==temp6){
								increment3+=1;
								g=temp5;
								f=1;
							}	
						}
					}
					else if(m==9) {
						int temp1=m-1;
						int temp2=temp1-1;
						int temp3=m-4;
						int temp4=temp3-4;
						int temp5=m-3;
						int temp6=temp5-3;
						int increment1=1;
						int increment2=1;
						int increment3=1;
						for(int u=0;u<q && (increment1<2 && increment2<2 && increment3<2);u++) {
							if((x[u]==temp1))
							{
								increment1+=1;
								g=temp2;
								f=1;
							}
							else  if(x[u]==temp2){
								increment1+=1;
								g=temp1;
								f=1;
							}
							 if((x[u]==temp3))
							{
								increment2+=1;
								g=temp4;
								f=1;
							}
							 else if((x[u]==temp4)){
								increment2+=1;
								g=temp3;
								f=1;
							}
							 if((x[u]==temp5))
							{
								increment3+=1;
								g=temp6;
								f=1;
							}
							else if(x[u]==temp6){
								increment3+=1;
								g=temp5;
								f=1;
							}	
							 System.out.println(g);
						}
					}
				}else
				{
				if(m==1) {
					int temp1=m+1;
					int temp2=temp1+1;
					int temp3=m+4;
					int temp4=temp3+4;
					int temp5=m+3;
					int temp6=temp5+3;
					int increment1=1;
					int increment2=1;
					int increment3=1;
					for(int u=0;u<q && (increment1<2 && increment2<2 && increment3<2);u++) {
						if((x[u]==temp1))
						{
							increment1+=1;
							g=temp2;
							f=1;
						}
						else if(x[u]==temp2){
							increment1+=1;
							g=temp1;
							f=1;
						}
						else if((x[u]==temp3))
						{
							increment2+=1;
							g=temp4;
							f=1;
						}
						else if((x[u]==temp4)){
							increment2+=1;
							g=temp3;
							f=1;
						}
						else if((x[u]==temp5))
						{
							increment3+=1;
							g=temp6;
							f=1;
						}
						else if(x[u]==temp6){
							increment3+=1;
							g=temp5;
							f=1;
						}	
					}	
					
				}
				if(m==2) {
					int temp1=m+1;
					int temp2=m-1;
					int temp5=m+3;
					int temp6=temp5+3;
					int increment1=1;
					int increment3=1;
					for(int u=0;u<q && (increment1<2 && increment3<2);u++) {
						if((x[u]==temp1))
						{
							increment1+=1;
							g=temp2;
							f=1;
						}
						else if(x[u]==temp2){
							increment1+=1;
							g=temp1;
							f=1;
						}

						else if((x[u]==temp5))
						{
							increment3+=1;
							g=temp6;
							f=1;
						}
						else if(x[u]==temp6){
							increment3+=1;
							g=temp5;
							f=1;
						}	
					}	
					
				}
				if(m==3) {
					int temp1=m-1;
					int temp2=temp1-1;
					int temp3=m+2;
					int temp4=temp3+2;
					int temp5=m+3;
					int temp6=temp5+3;
					int increment1=1;
					int increment2=1;
					int increment3=1;
					for(int u=0;u<q && (increment1<2 && increment2<2 && increment3<2);u++) {
						if((x[u]==temp1))
						{
							increment1+=1;
							g=temp2;
							f=1;
						}
						else if(x[u]==temp2){
							increment1+=1;
							g=temp1;
							f=1;
						}
						else if((x[u]==temp3))
						{
							increment2+=1;
							g=temp4;
							f=1;
						}
						else if((x[u]==temp4)){
							increment2+=1;
							g=temp3;
							f=1;
						}
						else if((x[u]==temp5))
						{
							increment3+=1;
							g=temp6;
							f=1;
						}
						else if(x[u]==temp6){
							increment3+=1;
							g=temp5;
							f=1;
						}	
					}	
				}
				
				if(m==4) {
					int temp1=m+1;
					int temp2=m+2;
					int temp5=m-3;
					int temp6=temp5+6;
					int increment1=1;
					int increment3=1;
					for(int u=0;u<q && (increment1<2 && increment3<2);u++) {
						if((x[u]==temp1))
						{
							increment1+=1;
							g=temp2;
							f=1;
						}
						else if(x[u]==temp2){
							increment1+=1;
							g=temp1;
							f=1;
						}

						else if((x[u]==temp5))
						{
							increment3+=1;
							g=temp6;
							f=1;
						}
						else if(x[u]==temp6){
							increment3+=1;
							g=temp5;
							f=1;
						}	
					}	
				}
				else if(m==5) {
					int temp1=m-1;
					int temp2=m+1;
					int temp3=m+2;
					int temp4=temp3-4;
					int temp5=m-3;
					int temp6=temp5+6;
					int temp7=m-4;
					int temp8=temp7+8;
					int increment1=1;
					int increment2=1;
					int increment3=1;
					int increment4=1;
					for(int u=0;u<q && (increment1<2 && increment2<2 && increment3<2 );u++) {
						if((x[u]==temp1))
						{
							increment1+=1;
							g=temp2;
							f=1;
						}
						else if(x[u]==temp2){
							increment1+=1;
							g=temp1;
							f=1;
						}
						else if((x[u]==temp3))
						{
							increment2+=1;
							g=temp4;
							f=1;
						}
						else if((x[u]==temp4)){
							increment2+=1;
							g=temp3;
							f=1;
						}
						else if((x[u]==temp5))
						{
							increment3+=1;
							g=temp6;
							f=1;
						}
						else if(x[u]==temp6){
							increment3+=1;
							g=temp5;
							f=1;
						}else if(x[u]==temp7){
							increment4+=1;
							g=temp1;
							f=1;
						}
						else if((x[u]==temp8))
						{
							increment4+=1;
							g=temp4;
							f=1;
						}	
					}	
				}
				else if(m==6) {
					int temp1=m-1;
					int temp2=m-2;
					int temp5=m-3;
					int temp6=temp5+6;
					int increment1=1;
					int increment3=1;
					for(int u=0;u<q && (increment1<2 && increment3<2);u++) {
						if((x[u]==temp1))
						{
							increment1+=1;
							g=temp2;
							f=1;
						}
						else if(x[u]==temp2){
							increment1+=1;
							g=temp1;
							f=1;
						}

						else if((x[u]==temp5))
						{
							increment3+=1;
							g=temp6;
							f=1;
						}
						else if(x[u]==temp6){
							increment3+=1;
							g=temp5;
							f=1;
						}	
					}
				}
				else if(m==7) {
					int temp1=m+1;
					int temp2=temp1+1;
					int temp3=m-2;
					int temp4=temp3-2;
					int temp5=m-3;
					int temp6=temp5-3;
					int increment1=1;
					int increment2=1;
					int increment3=1;
					for(int u=0;u<q && (increment1<2 && increment2<2 && increment3<2 );u++) {
						if((x[u]==temp1))
						{
							increment1+=1;
							g=temp2;
							f=1;
							break;
						}
						else if(x[u]==temp2){
							increment1+=1;
							g=temp1;
							f=1;
							break;
						}
						else if((x[u]==temp3))
						{
							increment2+=1;
							g=temp4;
							f=1;
							break;
						}
						else if((x[u]==temp4)){
							increment2+=1;
							g=temp3;
							f=1;
							break;
						}
						else if((x[u]==temp5))
						{
							increment3+=1;
							g=temp6;
							f=1;
							break;
						}
						else if(x[u]==temp6){
							increment3+=1;
							g=temp5;
							f=1;
							break;
						}	
					}	
				}
				else if(m==8) {
					int temp1=m-1;
					int temp2=m+1;
					int temp5=m-3;
					int temp6=temp5-3;
					int increment1=1;
					int increment3=1;
					for(int u=0;u<q && (increment1<2 && increment3<2);u++) {
						if((x[u]==temp1))
						{
							increment1+=1;
							g=temp2;
							f=1;
						}
						else if(x[u]==temp2){
							increment1+=1;
							g=temp1;
							f=1;
						}

						else if((x[u]==temp5))
						{
							increment3+=1;
							g=temp6;
							f=1;
						}
						else if(x[u]==temp6){
							increment3+=1;
							g=temp5;
							f=1;
						}	
					}
				}
				else if(m==9) {
					int temp1=m-1;
					int temp2=temp1-1;
					int temp3=m-4;
					int temp4=temp3-4;
					int temp5=m-3;
					int temp6=temp5-3;
					int increment1=1;
					int increment2=1;
					int increment3=1;
					for(int u=0;u<q && (increment1<2 && increment2<2 && increment3<2);u++) {
						if((x[u]==temp1))
						{
							increment1+=1;
							g=temp2;
							f=1;
						}
						else  if(x[u]==temp2){
							increment1+=1;
							g=temp1;
							f=1;
						}
						 if((x[u]==temp3))
						{
							increment2+=1;
							g=temp4;
							f=1;
						}
						 else if((x[u]==temp4)){
							increment2+=1;
							g=temp3;
							f=1;
						}
						 if((x[u]==temp5))
						{
							increment3+=1;
							g=temp6;
							f=1;
						}
						else if(x[u]==temp6){
							increment3+=1;
							g=temp5;
							f=1;
						}	

					}
				}
				}
			}
		return g;
		
	}
	
	
	
	
	
	
	
	
	
	public static int Get1(int m,int x[],int q)
	{
		int g=0;
		if(q==1)
		{
			if(m!=5)
			{
				g=5;
			}
			else {
				g= 9;
			}
			
		}
		
		else if(q>1)
		{
				if(m==1) {
					int temp1=m+1;
					int temp2=temp1+1;
					int temp3=m+4;
					int temp4=temp3+4;
					int temp5=m+3;
					int temp6=temp5+3;
					int increment1=0;
					int increment2=0;
					int increment3=0;
					for(int u=0;u<q && (increment1<2 && increment2<2 && increment3<2);u++) {
						if((x[u]==temp1))
						{
							increment1+=1;
						}
						else if(x[u]==temp2){
							increment1+=1;
						}
						else if((x[u]==temp3))
						{
							increment2+=1;
						}
						else if((x[u]==temp4)){
							increment2+=1;
						}
						else if((x[u]==temp5))
						{
							increment3+=1;
						}
						else if(x[u]==temp6){
							increment3+=1;
						}
						
					}	
					if((increment1==2)||(increment3==2) ||(increment2==2)){
						g=1;
					}
				}
				else if(m==2) {
					int temp1=m+1;
					int temp2=m-1;
					int temp5=m+3;
					int temp6=temp5+3;
					int increment1=0;
					int increment3=0;
					for(int u=0;u<q && (increment1<2 && increment3<2);u++) {
						if((x[u]==temp1))
						{
							increment1+=1;
						}
						else if(x[u]==temp2){
							increment1+=1;
						}

						else if((x[u]==temp5))
						{
							increment3+=1;
						}
						else if(x[u]==temp6){
							increment3+=1;
						}
						if((increment1==2)||(increment3==2)){
							g=2;
						}
					}	
				}
				else if(m==3) {
					int temp1=m-1;
					int temp2=temp1-1;
					int temp3=m+2;
					int temp4=temp3+2;
					int temp5=m+3;
					int temp6=temp5+3;
					int increment1=0;
					int increment2=0;
					int increment3=0;
					for(int u=0;u<q && (increment1<2 && increment2<2 && increment3<2);u++) {
						if((x[u]==temp1))
						{
							increment1+=1;
						}
						else if(x[u]==temp2){
							increment1+=1;
						}
						else if((x[u]==temp3))
						{
							increment2+=1;
						}
						else if((x[u]==temp4)){
							increment2+=1;
						}
						else if((x[u]==temp5))
						{
							increment3+=1;
						}
						else if(x[u]==temp6){
							increment3+=1;
						}
						if((increment1==2)||(increment3==2) ||(increment2==2)){
							g=3;
						}
					}	
				}
				
				else if(m==4) {
					int temp1=m+1;
					int temp2=m+2;
					int temp5=m-3;
					int temp6=temp5+3;
					int increment1=0;
					int increment3=0;
					for(int u=0;u<q && (increment1<2 && increment3<2);u++) {
						if((x[u]==temp1))
						{
							increment1+=1;
						}
						else if(x[u]==temp2){
							increment1+=1;
						}

						else if((x[u]==temp5))
						{
							increment3+=1;
						}
						else if(x[u]==temp6){
							increment3+=1;
						}
						if((increment1==2)||(increment3==2)){
							g=4;
						}
					}	
				}
				else if(m==5) {
					int temp1=m-1;
					int temp2=m+1;
					int temp3=m+2;
					int temp4=temp3-4;
					int temp5=m-3;
					int temp6=temp5+6;
					int temp7=m-4;
					int temp8=temp7+8;
					int increment1=0;
					int increment2=0;
					int increment3=0;
					int increment4=0;
					for(int u=0;u<q && (increment1<2 && increment2<2 && increment3<2 );u++) {
						if((x[u]==temp1))
						{
							increment1+=1;
						}
						else if(x[u]==temp2){
							increment1+=1;
						}
						else if((x[u]==temp3))
						{
							increment2+=1;
						}
						else if((x[u]==temp4)){
							increment2+=1;
						}
						else if((x[u]==temp5))
						{
							increment3+=1;
						}
						else if(x[u]==temp6){
							increment3+=1;
						}else if(x[u]==temp7){
							increment4+=1;
						}
						else if((x[u]==temp8))
						{
							increment4+=1;
						}
						if((increment1==2)||(increment3==2) ||(increment2==2)){
							g=5;
						}
					}	
				}
				else if(m==6) {
					int temp1=m-1;
					int temp2=m-2;
					int temp5=m-3;
					int temp6=temp5+6;
					int increment1=0;
					int increment3=0;
					for(int u=0;u<q && (increment1<2 && increment3<2);u++) {
						if((x[u]==temp1))
						{
							increment1+=1;
						}
						else if(x[u]==temp2){
							increment1+=1;
						}

						else if((x[u]==temp5))
						{
							increment3+=1;
						}
						else if(x[u]==temp6){
							increment3+=1;
						}
						if((increment1==2)||(increment3==2)){
							g=6;
						}
					}
				}
				else if(m==7) {
					int temp1=m+1;
					int temp2=temp1+1;
					int temp3=m-2;
					int temp4=temp3-2;
					int temp5=m-3;
					int temp6=temp5-3;
					int increment1=0;
					int increment2=0;
					int increment3=0;
					for(int u=0;u<q && (increment1<2 && increment2<2 && increment3<2 );u++) {
						if((x[u]==temp1))
						{
							increment1+=1;
						}
						else if(x[u]==temp2){
							increment1+=1;
						}
						else if((x[u]==temp3))
						{
							increment2+=1;
						}
						else if((x[u]==temp4)){
							increment2+=1;
						}
						else if((x[u]==temp4))
						{
							increment3+=1;
						}
						else if(x[u]==temp5){
							increment3+=1;
						}	

						if((increment1==2)||(increment3==2) ||(increment2==2)){
							g=7;
						}
					}	
				}
				else if(m==8) {
					int temp1=m-1;
					int temp2=m+1;
					int temp5=m-3;
					int temp6=temp5-3;
					int increment1=0;
					int increment3=0;
					for(int u=0;u<q && (increment1<2 && increment3<2);u++) {
						if((x[u]==temp1))
						{
							increment1+=1;
						}
						else if(x[u]==temp2){
							increment1+=1;
						}

						else if((x[u]==temp5))
						{
							increment3+=1;
						}
						else if(x[u]==temp6){
							increment3+=1;
						}
						if((increment1==2)||(increment3==2)){
							g=8;
						}
					}
				}
				else if(m==9) {
					int temp1=m-1;
					int temp2=temp1-1;
					int temp3=m-4;
					int temp4=temp3-4;
					int temp5=m-3;
					int temp6=temp5-3;
					int increment1=0;
					int increment2=0;
					int increment3=0;
					for(int u=0;u<q && (increment1<2 && increment2<2 && increment3<2);u++) {
						if((x[u]==temp1))
						{
							increment1+=1;
						}
						else  if(x[u]==temp2){
							increment1+=1;
						}
						 if((x[u]==temp3))
						{
							increment2+=1;
						}
						 else if((x[u]==temp4)){
							increment2+=1;
						}
						 if((x[u]==temp5))
						{
							increment3+=1;
						}
						else if(x[u]==temp6){
							increment3+=1;
						}	

							if((increment1==2)||(increment3==2) ||(increment2==2)){
								g=9;
							}
					}	
					System.out.println(g);
				}
			}
		return g;
		
	}
}
