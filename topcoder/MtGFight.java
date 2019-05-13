import java.util.*;
import java.math.*;

public class MtGFight {

	public int[] findGoodFight(int[] power, int[] toughness) {
		int n = power.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i != j) {
					if (power[i] >= toughness[j] && toughness[i] > power[j]) {
						return new int[]{i, j};
					}
				}
			}
		}
		return new int[]{};
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// input power
		String line = sc.nextLine();
		String[] tokens = line.split("\\s+");
		int[] power = new int[tokens.length];
		for (int i = 0; i < power.length; i++) {
			power[i] = Integer.parseInt(tokens[i]);
		}

		// input toughness
		line = sc.nextLine();
		tokens = line.split("\\s+");
		int[] toughness = new int[tokens.length];
		for (int i = 0; i < toughness.length; i++) {
			toughness[i] = Integer.parseInt(tokens[i]);
		}

		MtGFight mtGFight = new MtGFight();
		int[] result = mtGFight.findGoodFight(power, toughness);
		System.out.println(Arrays.toString(result));
	}
}
