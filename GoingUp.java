public class GoingUp {
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int counter = 0;
		boolean consecutive = true;
		while (a!= -1) {			
			System.out.println("Type a number: ");
			a = Integer.parseInt(System.console().readLine());
			if (a != b + 1 && counter > 0 && a != -1 && b != -1) {
				consecutive = false;
			}
			b = a;
			counter ++;
			
		}
		
		if (consecutive == true) {
			System.out.println("Yes");
		} else if (consecutive == false){
			System.out.println("No");
		}
	}
}	