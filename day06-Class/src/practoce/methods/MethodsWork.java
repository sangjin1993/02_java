package practoce.methods;

public class MethodsWork {
	
	public int absolute(int x) {
		return (x > 0) ? x : -x;
	}
	
	public void findMultiple(int x) {
		int count = 0;
		while (count < 100 / x) {
			count++;
			System.out.println(x * count);
		}
	}
	
	public String decideSign(int x) {
		String result;
		
		if(x < 0) {
			result = "음의 정수";
		} else if(x == 0) {
			result = "정수 0";
		} else {
			result = "양의 정수";
		}
		
		return result;
	}
	
	public void repeateMessage(String message, int repeat) {
		String[] messages = new String[repeat];
		
		for(int idx = 0; idx < messages.length; idx++) {
			messages[idx] = message;
		}
		
		for (String msg: messages) {
			System.out.println(msg);
		}
	}
	
	public int[] makeMultipleNums(int x) {
		int[] multiples = new int[100 / x];
		
		for(int idx = 0; idx < multiples.length; idx++) {
			multiples[idx] = x * (idx +1);
		}
		
		return multiples;
	}
	
	
	
}
