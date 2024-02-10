/*
 * https://leetcode.com/problems/merge-strings-alternately/description/?envType=study-plan-v2&envId=leetcode-75
 * 
 * You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.

Return the merged string.

 

Example 1:

Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r
 */

package leetcode_75;

public class MergeStringsAlternatively {

	public String mergeAlternately(String word1, String word2) {

		StringBuilder finalString = new StringBuilder();

		int word1Length = word1.length();
		int word2Length = word2.length();

		int i = 0;

		while (i < word1Length || i < word2Length) {

			if (i < word1Length) {
				finalString.append(word1.charAt(i));
			}

			if (i < word2Length) {
				finalString.append(word2.charAt(i));
			}

			i++;
			System.out.println("Value of i " + i + " || Updated finalString " + finalString);
		}

		return finalString.toString();
	}

	public static void main(String[] args) {

		MergeStringsAlternatively ob = new MergeStringsAlternatively();
		String output = ob.mergeAlternately("abc", "pq");

		System.out.println(output);
	}
}
