package TapeEquilibrium;

class Solution {
 public int solution(int[] A) {
     // write your code in Java SE 8
	 int result = Integer.MAX_VALUE;
	 int total = 0;
	 int left = 0;
	 int right = 0;
	 
	 for(int i=0; i<A.length; i++) {
		 total += A[i];
	 }
	 
	 for(int j=1; j<A.length; j++) {
		 left += A[j-1];
		 right = total - left;
		 result = Math.min(Math.abs(left - right), result);
	 }
	 
	 return result;
 }
}