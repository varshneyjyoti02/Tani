
import java.util.Scanner;

public class RemoveDuplicate {

	public static void main(String[] args) {

		String input;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the String: ");
		input = s.nextLine();
		String[] words = input.split(" ");
		for (int i = 0; i < words.length; i++) {
			if (words[i] != null) {

				for (int j = i + 1; j < words.length; j++) {

					if (words[i].equals(words[j])) {
						words[j] = null;
					}
				}
			}
		}
		System.out.print("Output is: ");
		for (int k = 0; k < words.length; k++) {
			if (words[k] != null) {
				System.out.print(words[k] + " ");
			}

		}
	}
}