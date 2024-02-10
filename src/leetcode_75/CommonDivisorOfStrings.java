//https://leetcode.com/problems/greatest-common-divisor-of-strings/description/?envType=study-plan-v2&envId=leetcode-75


/*
 * //let's imagine we have two strings S1,S2
    //and let's assume string S results from concatenating both of them
    //if S does not depend on which string comes first
    //meaning S1+S2 = S2+S1
    //then this means that both of S1,S2 consists of small repeated substrings t
    //so, S1 = t+t+.....+t, S2 = t+t+.....+t
    //and the difference between them is only in the number of repetition
    //to find this t, we find first its length using GCD
    // if the GCD is 2, then the t is the first two characters from S1 or S2
    // if the GCD is 3, then the t is the first three characters from S1 or S2
    //and so on.

    //If the string results from concatenating them depends on which comes first,
    //then there is no such string that divides both of them, so return "" 
 */
package leetcode_75;

public class CommonDivisorOfStrings {

	public String gcdOfStrings(String str1, String str2) {

		 if(!(str1+str2).equals(str2+str1))
		        return "";

		    int a = str1.length();
		    int b = str2.length();
		    int gcd;
		    if(a > b)
		        gcd = GCD(a,b);
		    else
		        gcd = GCD(b,a);   
		    return str1.substring(0,gcd);    
		}

		public int GCD(int a, int b){
		    if(b==0)
		       return a;
		    return GCD(b,a % b);   
		}
		
	

	public static void main(String[] args) {

		CommonDivisorOfStrings ob = new CommonDivisorOfStrings();
		String output = ob.gcdOfStrings("ABAB", "AB");

		System.out.println(" Output "+output);

	}
}
