package Assingnments;

public class ArmStrong {

	public static void main(String[] args) {
 
		int i = 224;
		int calc = 0;
		int original;
		original = i;
		while (i > 0)
		{
			int rem = i % 10;
			int quo = i / 10;
			i = quo;
			calc = calc + (rem * rem * rem);
		}
		System.out.println("The No is: " + original);
		
		if (original == calc) {
			System.out.println("Armstrong NO");
			
		} else {
			System.out.println("Not an Armstrong NO");

	}
	}
}
