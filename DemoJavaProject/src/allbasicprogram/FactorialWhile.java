package allbasicprogram;

public class FactorialWhile {
	public static void main(String[] args) {
		int fact = 1;
		int num = Integer.parseInt(args[0]);
		int i = 1;
		while (i <= num) {
			fact = fact * i;
			i++;
		}
		System.out.println(fact);
	}
}
