import java.util.Scanner;

public class Numerology {

	
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String str;
			char name;
			int sum = 0, len;
			Scanner s = new Scanner(System.in);
			System.out.println("Enter a String: ");
			str = s.nextLine();
			char[] str1 = str.toCharArray();
			for (int i = 0; i < str.length(); i++) {
				name = str1[i];
				if (name >= 'A' && name <= 'Z') {
					if (name == 'A' || name == 'I' || name == 'J' || name == 'Q' || name == 'Y') {
						sum += 1;
					}
					if (name == 'B' || name == 'K' || name == 'R') {
						sum += 2;
					}
					if (name == 'C' || name == 'G' || name == 'L' || name == 'S') {
						sum += 3;
					}
					if (name == 'D' || name == 'M' || name == 'T') {
						sum += 4;
					}
					if (name == 'E' || name == 'H' || name == 'N' || name == 'X') {
						sum += 5;
					}
					if (name == 'U' || name == 'V' || name == 'W') {
						sum += 6;
					}
					if (name == 'O' || name == 'Z') {
						sum += 7;
					}
					if (name == 'F' || name == 'P') {
						sum += 8;
					}

				}

			}
			int s1 = 0, n;
			len = String.valueOf(sum).length();
			if (len > 1) {
				while (len != 1) {
					while (sum > 0) {
						n = sum % 10;
						sum = sum / 10;
						s1 += n;
					}
					len = String.valueOf(s1).length();
					if (len > 1) {
						sum = s1;
					}
				}

			}
			System.out.println("The output is: "+s1);

		}
	}

