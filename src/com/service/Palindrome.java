package com.service;

public class Palindrome {

	public boolean isPalindrome(String word) {
		String wordLower = word.toLowerCase();
		char[] wordArray = wordLower.toCharArray();
    	StringBuilder wordBuilder = new StringBuilder();
    	for(int x=wordArray.length-1; x>=0; x--){
    		wordBuilder.append(wordArray[x]);
    	}
    	return wordBuilder.toString().equals(wordLower) ? true:false;
	}

	public boolean isPalindromeSentence(String sentence){
		return isPalindrome(sentence.replaceAll("[\\s\\!\\?\\-\\+\\.\\^:,]",""));
	}
	
}
