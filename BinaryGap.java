package BinaryGap;

public class Solution {
	public int Solution(int N) {
		String NBit = "";
		int topZeroBit = 0;
		int zeroBit = 0;
		int oneBit = 0;
		int result = 0;
		
		NBit = Integer.toBinaryString(N);
		
		for(int i=0; i<NBit.length(); i++) {
			if(NBit.charAt(i) == '0') zeroBit++;
			else if(NBit.charAt(i) == 1) {
				oneBit++;
				if(zeroBit > topZeroBit) topZeroBit = zeroBit;
				zeroBit = 0;
			}
		}
		
		if(oneBit < 2) result = 0;
		else result = topZeroBit;		
		
		return result;
	}
}
