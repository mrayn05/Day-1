public class IsPrime {
	public static void main(String[] args) {
		System.out.println("Enter a number");
		String str = System.console().readLine();
		int i = Integer.parseInt(str);
		int j = 1;
		while (j < i-1) {
			j++;
			if (i % j == 0)	{
				System.out.println("Not Prime");
				break;	
			} else {
				System.out.println("Prime");
				break;	
			}
		}
			
		
	}
}		
	
	
