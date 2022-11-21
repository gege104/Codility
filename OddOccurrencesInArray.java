
class Solution {
	public int solution(int[] A) {
		int result = 0;
		
		for(int i=0; i<A.length; i++) {
			result = result ^ A[i]; // xor all elements
		}
		
		return result;
	}
}