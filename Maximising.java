public class Maximising {
	public static void main(String[] args) {	
	int highest = 0;
	int a = 0;	
	while (a != -1) {
		System.out.println("Enter a number: ");
		a = Integer.parseInt(System.console().readLine());
		if (a > highest) {
			highest = a;
		}
		System.out.println(highest);
	}
	
	}
}	