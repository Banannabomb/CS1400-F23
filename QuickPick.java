import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class QuickPick {
	public static int[] quickPick() {
		ArrayList<Integer> quickPickList = new ArrayList<>();
		int[] quickPickArray = new int[6];
		Random generator = new Random();

		for (int i = 0; i < 5; i++) {
			int num;
			do {
				num = generator.nextInt(47) + 1;
			} while (quickPickList.contains(num));
			quickPickList.add(num);
		}

		quickPickList.add(generator.nextInt(27) + 1);

		for (int i = 0; i < quickPickArray.length; i++) {
			quickPickArray[i] = quickPickList.get(i);
		}
		return quickPickArray;
	}

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int pickCount;
		System.out.println("CA QuickPick\n");
		System.out.print("How many quick picks? ");
		pickCount = keyboard.nextInt();
		System.out.println("\n                    MEGA");
		for (int i = 0; i < pickCount; i++) {
			int[] picks = quickPick();
			System.out.printf("%C", 'A' + i);
			for (int x : picks) {
				System.out.printf(" %2d", x);
			}
			System.out.println();
		}
	}
}
