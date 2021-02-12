
public class O_N2_Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// remove inner for-loop to improve running time from ON^3 down to ON^2
		// like below 
		
		
	}
	
	public static int maxSubSum2(int [] a){
		
		int maxSum = 0;
		for(int i = 0; i < a.length; i++ ) {
			
			int thisSum = 0;
			for( int j = i; j< a.length; j++)

			{
				thisSum += a[ j ];
				if(thisSum > maxSum )
					maxSum = thisSum;
			}
		}
		return maxSum;
		
		
		
	}

}
