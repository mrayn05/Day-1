public class NumberPyramids {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		int base = Integer.parseInt(System.console().readLine());
		for (int i = 1; i <= base; i++) {
			for (int k = (base-1); k >= i; k--) {
				System.out.print(" ");
			}
			for (int j=1; j <= i; j++) {
				System.out.print(+ i);
			}
			System.out.println("");
		}
	}
}	 