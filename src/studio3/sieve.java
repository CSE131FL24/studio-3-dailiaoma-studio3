package studio3;

public class sieve {

	public static void main(String[] args) {
		int[] numbers = new int[40];
		for (int i = 0; i<numbers.length; i++) {
			numbers[i] = i+1;
			numbers[0] = 0;
		}
		for (int i : numbers) {
			if (i!=0) {
				for (int j=2*i-1; j<numbers.length; j=j+i) {
					numbers[j] = 0;
				}
			}
		}
		for (int i = 0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
			
	}

}
