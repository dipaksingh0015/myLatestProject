package com.test.test;

public class Prime {

	public static void main(String[] args) {
		int n = 8, counter = 0;
		for(int i = 2; i <= (n/2); i++) {
			if(n % i == 0) {
				counter++;
				break;
				
			}
			
			}
		if(counter == 0) {
			System.out.println("prime");
		}
			else {
				System.out.println("not prime");
			}
		}

	}


