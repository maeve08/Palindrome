package com.service;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class PalindromeTest {

	@Test
	public void testNonPalindromeWord(){
		//Given
		Palindrome palindrome = new Palindrome();
		
		//When
		boolean isPalindrome = palindrome.isPalindrome("words");
		
		//Then
		assertThat(isPalindrome, equalTo(false));
	}
	
	@Test
	public void testPalindromeWord(){
		//Given
		Palindrome palindrome = new Palindrome();
		
		//When
		boolean isPalindrome = palindrome.isPalindrome("rotator");
		
		//Then
		assertThat(isPalindrome, equalTo(true));
	}
	
	@Test
	public void testNonPalindromeSentence(){
		//Given
		Palindrome palindrome = new Palindrome();
		
		//When
		boolean isPalindrome = palindrome.isPalindromeSentence("sentence");
		
		//Then
		assertThat(isPalindrome, equalTo(false));
	}
	
	@Test
	public void testPalindromeSentence(){
		//Given
		Palindrome palindrome = new Palindrome();
		
		//When
		boolean isPalindrome = palindrome.isPalindromeSentence("Was it a car or a cat I saw?");
		
		//Then
		assertThat(isPalindrome, equalTo(true));
	}
	
	@Test
	public void testPalindromeSentenceWithMarks(){
		//Given
		Palindrome palindrome = new Palindrome();
		
		//When
		boolean isPalindrome = palindrome.isPalindromeSentence("As I pee, sir, I see Pisa!");
		
		//Then
		assertThat(isPalindrome, equalTo(true));
	}
}
