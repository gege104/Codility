package FrogJmp;

class Solution {
	public int solution(int X, int Y, int D) {
		int dist = Y - X;
		int result = 0;
		
		if(dist <= 0) result = 0;
		if(dist%D == 0) result = dist/D;
		else result = dist/D + 1;
		
		return result;
	}
}