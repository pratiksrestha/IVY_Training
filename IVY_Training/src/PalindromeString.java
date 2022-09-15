import java.util.*;

public class PalindromeString {
         static void SubString(String sample_string, int low, int high){
                for (int i = low; i <= high; ++i)
                    System.out.print(sample_string.charAt(i));
         }
         static int LongestPalindrome(String sample_string){
             int n = sample_string.length();

             int maxLength = 1, start = 0;

             for (int i = 0; i < sample_string.length(); i++){
                 for (int j = i; j < sample_string.length(); j++){
                     int flag = 1;

                     for (int k = 0; k < (j - i + 1) / 2; k++)
                            if (sample_string.charAt(i + k) != sample_string.charAt(j - k))
                                flag = 0;

                     if (flag!=0 && (j - i + 1) > maxLength) {
                            start = i;
                            maxLength = j - i + 1;
                     }
                 }
             }

                System.out.print("Longest palindrome subString is: ");
                SubString(sample_string, start, start + maxLength - 1);

                return maxLength;
         }

            public static void main(String[] args){
                String sample_string = new String();
                Scanner s = new Scanner(System.in);
                System.out.println("Enter the string to extract the longest palindrome substring:");
                sample_string = s.next();
                System.out.print("\nLength is: " + LongestPalindrome(sample_string));
            }
}
