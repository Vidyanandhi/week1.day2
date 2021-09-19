package Assingnments;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 7, 6, 8 };
		
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++)
			
			System.out.print("," + arr[i]);
		
		int i = 1;
		
		while (i < arr.length) {
			if (arr[i] - arr[i - 1] != 1) {
				System.out.println("Missing element is " + (arr[i - 1] + 1));
			}
			
          i++;
	}

}
}