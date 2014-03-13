/*   http://leetcode.com/2011/01/sliding-window-maximum.html
 * 
 * 
 * A long array A[] is given to you. There is a sliding window 
 * of size w which is moving from the very left of the array to 
 * the very right. You can only see the w numbers in the window. 
 * Each time the sliding window moves rightwards by one position.
 * 
 * Example:
 * [1  3  -1] -3  5  3  6  7
 *  1 [3  -1  -3] 5  3  6  7
 *  1  3 [-1  -3  5] 3  6  7
 *  1  3  -1 [-3  5  3] 6  7
 *  1  3  -1  -3 [5  3  6] 7 
 *  1  3  -1  -3  5 [3  6  7]  
 *  
 *   Input: A long array A[], and a window width w
 *   Output: An array B[], B[i] is the maximum value of from A[i+w-1]
 *   Requirement: find a good optimal way to get B[i]
 */

public class SlidingWindowMaximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int w = 3;
		int[] A = {1, 3, -1, -3, 5, 3, 6, 7};
		int max = A[0];
		int[] B = new int[A.length - w + 1];
		
		for(int i = 0; i < A.length - w + 1; i++) {
			int[] c = {A[i], A[i +1], A[i + 2]};
			max = c[0];
			if (c[0] < c[1]){
				if (c[1] < c[2]){
					max = c[2];
				} else {
					max = c[1];
				}
			} else if (c[0] < c[2]) {
				max = c[2];
			} else {
				max = c[0];
			}
			
			B[i] = max;
		}
		
		for (int k = 0; k < B.length; k++) {
			System.out.print(B[k]+" ");
		}
	}

}
