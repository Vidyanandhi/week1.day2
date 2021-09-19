package Assingnments;

public class Palindrome {

	public static void main(String[] args) {

		int i = 454;
		int temp = i;
		int reverse = 0;
		while(i>0) {
			int rem = i % 10;
			int quo = i/ 10;
			reverse = (reverse * 10) + rem;
			i = quo;
			
		}
		
          System.out.println("the reversed No is:" + reverse);
          if(reverse==temp) {
        	  System.out.println("palindrome");
          }
          else {
        	  System.out.println("Not Palindrome");
          }
	}

}
