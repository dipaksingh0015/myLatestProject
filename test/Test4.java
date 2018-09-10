package test;

public class Test4 {

	public static void main(String[] args) {
		int [] arr = {12, 13, 15, 17, 20, 23, 25, 27, 31, 33, 37};
		int num = 0;
		int counter = 0;
		for(int i = 0; i < arr.length; i++) {
			num = arr[i];
		    counter = 0;
			for(int j = 2; j <= num/2; j++) {
				if(num%j == 0) {
					counter++;
					break;
				}
				
			}
			if(counter == 0) {
				System.out.print(num+", " );
			}
		}
		System.out.print("are primes");
	}

}
