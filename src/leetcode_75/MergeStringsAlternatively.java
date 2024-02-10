package leetcode_75;

public class MergeStringsAlternatively {

	public String mergeAlternately(String word1, String word2) {

		StringBuilder finalString = new StringBuilder();

		int word1Length = word1.length();
		int word2Length = word2.length();

		int i=0;
		
		while (i < word1Length || i < word2Length ) {

			if (i < word1Length) {
				finalString.append(word1.charAt(i));
			}

			if (i < word2Length) {
				finalString.append(word2.charAt(i));
			}
			
			i++;
			System.out.println("Value of i " + i + " || Updated finalString " +  finalString);
		}

		return finalString.toString();
	}

	public static void main(String[] args) {

		MergeStringsAlternatively ob = new MergeStringsAlternatively();
		String output = ob.mergeAlternately("abc", "pq");

		System.out.println(output);
	}
}
