package whileloop;

public class DivisiblebySixWhile {

	public static void main(String[] args) {
		int i = 150;
		while (i >= 50) {
			if (i % 6 == 0) {
				System.out.println(i);

			}

			i--;
		}
	}

}
