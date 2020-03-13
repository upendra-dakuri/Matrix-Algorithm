package com.omniwyse.SearchElement;

import org.junit.Assert;
import org.junit.Test;

public class SearchElementTest 
{
	
	//3x4 matrix test cases
	int matrix[][]= { {1,5,7,8},
					  {10,11,12,13},
					  {15,16,17,18} };
	@Test
	public void searchTest1()    
	{
		Assert.assertEquals(true,SearchElementInMatrix.search(matrix, 1));
	}
	
	@Test
	public void searchTest2() 
	{
		Assert.assertEquals(true,SearchElementInMatrix.search(matrix, 8));
	}
	
	@Test
	public void searchTest3() 
	{
		Assert.assertEquals(true,SearchElementInMatrix.search(matrix, 15));
	}
	
	@Test
	public void searchTest4() 
	{
		Assert.assertEquals(true,SearchElementInMatrix.search(matrix, 18));
	}
	
	@Test
	public void searchTest5() 
	{
		Assert.assertEquals(true,SearchElementInMatrix.search(matrix, 5));
	}
	
	@Test
	public void searchTest6() 
	{
		Assert.assertEquals(true,SearchElementInMatrix.search(matrix, 10));
	}
	
	@Test
	public void searchTest7() 
	{
		Assert.assertEquals(true,SearchElementInMatrix.search(matrix, 13));
	}
	
	@Test
	public void searchTest8() 
	{
		Assert.assertEquals(true,SearchElementInMatrix.search(matrix, 16));
	}
	
	@Test
	public void searchTest9() 
	{
		Assert.assertEquals(true,SearchElementInMatrix.search(matrix, 12));
	}
	
	@Test
	public void searchTest10() 
	{
		Assert.assertEquals(false,SearchElementInMatrix.search(matrix, -1));
	}
	
	@Test
	public void searchTest11() 
	{
		Assert.assertEquals(false,SearchElementInMatrix.search(matrix, 19));
	}
	
	@Test
	public void searchTest12() 
	{
		Assert.assertEquals(false,SearchElementInMatrix.search(matrix,9));
	}
	
	
	//4x3 matrix test cases
		int matrix1[][]= { {5,7,8},
						   {12,14,18},
						   {26,29,30},
						   {40,45,50} };
		@Test
		public void searchTest_01()    
		{
			Assert.assertEquals(true,SearchElementInMatrix.search(matrix1, 5));
		}
		
		@Test
		public void searchTest_02() 
		{
			Assert.assertEquals(true,SearchElementInMatrix.search(matrix1, 8));
		}
		
		@Test
		public void searchTest_03() 
		{
			Assert.assertEquals(true,SearchElementInMatrix.search(matrix1, 40));
		}
		
		@Test
		public void searchTest_04() 
		{
			Assert.assertEquals(true,SearchElementInMatrix.search(matrix1, 50));
		}
		
		@Test
		public void searchTest_05() 
		{
			Assert.assertEquals(true,SearchElementInMatrix.search(matrix1, 7));
		}
		
		@Test
		public void searchTest_06() 
		{
			Assert.assertEquals(true,SearchElementInMatrix.search(matrix1, 30));
		}
		
		@Test
		public void searchTest_07() 
		{
			Assert.assertEquals(true,SearchElementInMatrix.search(matrix1, 45));
		}
		
		@Test
		public void searchTest_08() 
		{
			Assert.assertEquals(true,SearchElementInMatrix.search(matrix1, 12));
		}
		
		@Test
		public void searchTest_09() 
		{
			Assert.assertEquals(true,SearchElementInMatrix.search(matrix1, 14));
		}
		
		@Test
		public void searchTest_010() 
		{
			Assert.assertEquals(false,SearchElementInMatrix.search(matrix1, 1));
		}
		
		@Test
		public void searchTest_011() 
		{
			Assert.assertEquals(false,SearchElementInMatrix.search(matrix1, 55));
		}
		
		@Test
		public void searchTest_012() 
		{
			Assert.assertEquals(false,SearchElementInMatrix.search(matrix1,25));
		}
		
		
		//4x4 matrix test cases
				int matrix_1[][]= { {2,7,8,9},
								   {12,15,17,20},
								   {22,25,27,30},
								   {35,40,42,45} };
				@Test
				public void searchTest_1()    
				{
					Assert.assertEquals(true,SearchElementInMatrix.search(matrix_1, 2));
				}
				
				@Test
				public void searchTest_2() 
				{
					Assert.assertEquals(true,SearchElementInMatrix.search(matrix_1, 9));
				}
				
				@Test
				public void searchTest_3() 
				{
					Assert.assertEquals(true,SearchElementInMatrix.search(matrix_1, 35));
				}
				
				@Test
				public void searchTest_4() 
				{
					Assert.assertEquals(true,SearchElementInMatrix.search(matrix_1, 45));
				}
				
				@Test
				public void searchTest_5() 
				{
					Assert.assertEquals(true,SearchElementInMatrix.search(matrix_1, 7));
				}
				
				@Test
				public void searchTest_6() 
				{
					Assert.assertEquals(true,SearchElementInMatrix.search(matrix_1, 20));
				}
				
				@Test
				public void searchTest_7() 
				{
					Assert.assertEquals(true,SearchElementInMatrix.search(matrix_1, 22));
				}
				
				@Test
				public void searchTest_8() 
				{
					Assert.assertEquals(true,SearchElementInMatrix.search(matrix_1, 40));
				}
				
				@Test
				public void searchTest_9() 
				{
					Assert.assertEquals(true,SearchElementInMatrix.search(matrix_1, 15));
				}
				
				@Test
				public void searchTest_10() 
				{
					Assert.assertEquals(false,SearchElementInMatrix.search(matrix_1, 1));
				}
				
				@Test
				public void searchTest_11() 
				{
					Assert.assertEquals(false,SearchElementInMatrix.search(matrix_1, 50));
				}
				
				@Test
				public void searchTest_12() 
				{
					Assert.assertEquals(false,SearchElementInMatrix.search(matrix_1,32));
				}
		
}



