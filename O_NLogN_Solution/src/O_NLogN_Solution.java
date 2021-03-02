
public class O_NLogN_Solution {

	static int maxSumRec(int [] a, int left, int right){
		
		if( left == right) // base case 
			if( a[ left ] > 0)
				return a[ left ];
			else
				return 0;
		
		int center = (left + right) / 2;
		
		int maxLeftSum = maxSumRec ( a, left, center);
		int maxRightSum = maxSumRec( a, center+1, right );
		return maxRightSum;
		 
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		
	}
}



