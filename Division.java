public class Division{
	public static void main(String[] args){
		System.out.println("Type a number: ");
		int i = Integer.parseInt(System.console().readLine());
		System.out.println("Type another number; ");
		int j = Integer.parseInt(System.console().readLine());
		int n = 0;
		int result = 0;
		while (i > j) {
			i -= j;
			n++;
		}
		System.out.println("the result is" + " " + n);
		System.out.println("the remainder is" + " " + i);
	}
}