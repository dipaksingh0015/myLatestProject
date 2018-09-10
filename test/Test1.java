package test;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		System.out.println("Enter a Sentence : ");
		Scanner scan = new Scanner(System.in);
		String sentence = scan.nextLine();
		scan.close();
		int counter = 0;
		int spaceCounter = 0;
		String finalString = "";
		for (int i = 0; i < sentence.length(); i++) {
			if(sentence.charAt(i) == 'a' || sentence.charAt(i) == 'e' || sentence.charAt(i) == 'i' || sentence.charAt(i) == 'o' ||sentence.charAt(i) == 'u') {
				System.out.println(sentence.charAt(i)+" => "+(i+1));
				counter++;
				
			} else {
				finalString = finalString + sentence.charAt(i);
			}
			if(sentence.charAt(i) == ' ') {
				spaceCounter++;
			}
		}
		System.out.println("Sentence after removing ovels "+finalString);
		System.out.println("There are "+spaceCounter+" white spaces in the sentence");
		System.out.println("There are "+counter+" vowels in the sentence");
		System.out.println("There are "+(sentence.length() - (spaceCounter + counter))+" consonants in the sentence");
	}
}
