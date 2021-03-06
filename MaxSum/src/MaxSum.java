 

public class MaxSum {
	
	public static void main(String [] args) {
	}
	
	
		public static int maxSubSum1( int [] a ) {
		
		int maxSum = 0;
		
		for( int i =0; i < a.length; i++)
			for(int j = i; j < a.length; j++)
			{
				int thisSum = 0;
				
				for( int k = i; k <= j; k++)
					thisSum += a[k];
				
				if( thisSum > maxSum )
					maxSum = thisSum;
			}
		
		return maxSum;
		
	}

}
/*
 * 
K = accumulates the total sum of the subsequence

Zero (0) is often first term; last term is often Length -1

THIS is O(N^3)
 * */
