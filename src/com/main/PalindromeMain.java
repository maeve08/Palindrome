package com.main;

import com.service.Palindrome;

public class PalindromeMain {

	public static void main(String[] args) {
		String word = "racecar";
		String sentence = "As I pee, sir, I see Pisa!";
		String nonPalindrome = "This is not palindrome.";
		Palindrome palindrome = new Palindrome();
		System.out.println(word + " - is Palindrome? : " +palindrome.isPalindrome(word));
		System.out.println(sentence + " - is Palindrome? : " +palindrome.isPalindromeSentence(sentence));
		System.out.println(sentence + " - is Palindrome? : " +palindrome.isPalindromeSentence(nonPalindrome));
	}

}
