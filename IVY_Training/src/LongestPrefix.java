import java.util.Scanner;

public class LongestPrefix {
     static String  prefix(String[] sample) {
        StringBuilder longestCommonPrefix = new StringBuilder();
        if (sample == null || sample.length == 0) {
            return longestCommonPrefix.toString();
        }
        int minimumLength = sample[0].length();
        for (int i = 1; i < sample.length; i++) {
            if(sample[i].length()<minimumLength){
                minimumLength = sample[i].length();
            }
//            minimumLength = Math.min(minimumLength, sample[i].length());
        }
        for (int i = 0; i < minimumLength; i++) {
            char current = sample[0].charAt(i);
            for (String str : sample) {
                if (str.charAt(i) != current) {
                    return longestCommonPrefix.toString();
                }
            }
            longestCommonPrefix.append(current);
        }
        return longestCommonPrefix.toString();
    }

    public static void main(String[] args) {
        int n=0;
        Scanner s = new Scanner(System.in);
        System.out.println("enter the size of the string array: ");
        n = s.nextInt();
        String sample[] = new String[n];
        System.out.println("enter the string values:");
        for(int i=0; i<n; i++) {
            sample[i] = s.next();
        }
        String longestCommonPrefix = prefix(sample);
        System.out.println('"'+longestCommonPrefix+'"');
    }
}
