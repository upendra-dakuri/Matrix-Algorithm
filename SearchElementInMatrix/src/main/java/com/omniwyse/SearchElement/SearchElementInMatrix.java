package com.omniwyse.SearchElement;

public class SearchElementInMatrix {

	public static boolean search(int [][] array,int number)
	{
		int rowlength=array.length;
		int columnlength=array[0].length;
		if(number<array[0][0] || number>array[rowlength-1][columnlength-1])
		{
			return false;
		}
		else
		{
		int row=0,column=columnlength-1;
		while( row<rowlength &&  column>=0)
		{
			if(number==array[row][column])
			{
			return true;
			}
			else if(number<array[row][column])
			{
				column--;
			}
			else
			{
				row++;
			}
		}
		}
 		return false;
	} 
	public static void main(String[] args) {
		int a[][]= {{1,2,3},{4,5,6}};
		System.out.println(search(a,3));
	}

}
