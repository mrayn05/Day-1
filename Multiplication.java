public class Multiplication {
	public static void main(String[] args){
		System.out.println("Type a number: ");
		int i = Integer.parseInt(System.console().readLine());
		System.out.println("Type another number; ");
		int j = Integer.parseInt(System.console().readLine());
		int n = 0;
		int result = 0;
		while (n < i) {
			n++;
			result += j;
		}
		System.out.println(result);
	}
}	