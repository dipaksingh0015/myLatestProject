package com.test.test;

public class pyrmdup {

	public static void main(String[] args) {
		int num = 5;
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= num -i; j++) {
				System.out.print(" ");
			}
			int k = 0;
			while(k != 2*i -1) {
				System.out.print("*");
				k++;
			}
			System.out.println();
		
	}
         /*for(int i = num; i > 0; i-- ) {
        	 for(int j = 1; j <= num -i; j++) {
        		 System.out.print(" ");
        	 }
        	 int k = 0;
        	 while(k != 2*i - 1) {
        		 System.out.print("*");
        		 k++;
        	 }
        	 System.out.println();
         }*/
  }
}
