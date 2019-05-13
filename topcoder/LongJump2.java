import java.util.*;
import java.math.*;

public class LongJump2 {

	public int countNewLeaders(int N, int[] jumpLengths) {
		int res = 0;
		int max = -1;
		int current = -1;
		for (int i = 0; i < jumpLengths.length; i++) {
			if (jumpLengths[i] > max) {
				max = jumpLengths[i];
				if (i % N != current) {
					current = i % N;
					res++;
				}
			}
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] jumpLengths = new int[3  * N];
		for (int i = 0; i < jumpLengths.length; i++) {
			jumpLengths[i] = scan.nextInt();
		}
		LongJump2 longJump2 = new LongJump2();
		int result = longJump2.countNewLeaders(N, jumpLengths);
		System.out.println(result);
	}
}



