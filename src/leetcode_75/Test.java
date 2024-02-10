package leetcode_75;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Krishna Madhav ";
		int length = str.length();

		String str2 = str.trim();

		System.out.println("String " + str);
		System.out.println("Length " + length);
		System.out.println("Trimmed String " + str2);

		for (int i = 0; i < length; i++) {
			System.out.println(str.charAt(i));
		}
	}

}
