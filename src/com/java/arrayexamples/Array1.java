package com.java.arrayexamples;

public class Array1 {
              public static void main(String [] args)
              {
            	  int[] list= {4,5,6,5,9,3,7,1};
            	  showList(list);
              }

			private static void showList(int[] list) {
				// TODO Auto-generated method stub
				for( int i = 0;i<list.length;i++ )
					System.out.println(list[i]+" ");
				System.out.println("for");
				bubblesort(list);
			}
			private static void bubblesort(int[] list)
			{
				//int j=0;
				for (int j=0;j<list.length;j++)
				{
					if (j<j++)
					System.out.println(j);
					   else
						   j=j++;
						   System.out.println(j);
				}
			}
			
}
