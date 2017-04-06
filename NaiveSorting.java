public class NaiveSorting {
	public static void main(String[] args) {
		System.out.println("Type a number: ");
		int a = Integer.parseInt(System.console().readLine());
		System.out.println("Type another number; ");
		int b = Integer.parseInt(System.console().readLine());
		System.out.println("Type another number; ");
		int c = Integer.parseInt(System.console().readLine());
		if (a > b & b > c) {
			System.out.println(a+ " " + b + " "+c);
		} if (a > c & c > b) {
			System.out.println(a + " " +c + " "+ b);			
		} if (b > a & a > c) {
			System.out.println(b + " " + a + " " +c);
		} if (b > c & c > a) {
			System.out.println(b + " " + c + " " + a);
		} if (c > a & a > b) {
			System.out.println(c + " " + a + " " +b);
		} if (c > b & b > a) {
			System.out.println(c + " " + b + " " +a);
		}
	}
}	