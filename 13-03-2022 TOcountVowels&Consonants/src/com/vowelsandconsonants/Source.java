package com.vowelsandconsonants;

class Alphabet0 {
public Alphabet0() {
	
}
	public int uniqueVowel(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				count++;
			}
		}
		return count;
	}

	public int uniqueConsonant(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != 'a' && str.charAt(i) != 'e' && str.charAt(i) != 'i' && str.charAt(i) != 'o'
					&& str.charAt(i) != 'u') {
				count++;
			}
		}
		return count;
	}

}
public class Source {
	public static void main(String[] args)throws Exception {
		Alphabet0 obj=new Alphabet0();
	    obj.uniqueVowel("java program");
	    obj.uniqueConsonant("java program");
	  	}
}