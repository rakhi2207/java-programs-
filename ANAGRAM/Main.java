// code for anagrams in java //
package strings;

public class Anagrams {

	public static void main(String[] args) {
		boolean isAnagram = true;
		String a = "aab";
		String b = "abc";
		
			int al [] = new int [256];
			int bl [] = new int [256];
		for(char c : a.toCharArray()) {
			int index = (int) c;
			al[index]++;
			
		}
		
		for(char c : b.toCharArray()) {
			int index = (int) c;
			bl[index]++;
			
		}
		for(int i=0 ; i<256 ; i++) {
			if(al[i] == bl[i]) {
				isAnagram = true;
				break;
			}
		}
		if(isAnagram) {
			System.out.println("Anagram");
		}else{
			System.out.println("Not Anagram");
		}
			

	}

}
