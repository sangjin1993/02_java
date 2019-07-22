package conver;

public class MethodDeclare {
	
	
	public void convertStringToCharArray(String input) {
		char[] letters;
		letters = new char[input.length()];
		
		for (int idx = 0; idx < letters.length; idx++) {
			letters[idx] = input.charAt(idx);
		}
		
		for(char letter : letters) {
			System.out.printf("%c", letter);
		}
	}
	
	
	public void sortLetters(String input) {
		char[] letters;
		letters = new char[input.length()];
		
		for (int idx = 0; idx < letters.length; idx++) {
			letters[idx] = input.charAt(idx);
		}
		
		
	}
}
