// palindrome in java for coding round

/**
 * palindrome
 */

// palindrome = > malayalam  in reverse the same malayalam
// the given string is come the same word in reverse also

import java.util.Scanner;

public class palindrome {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the statement");
        String str = s.next();

        int i = 0;
        int j = str.length() - 1;

        while (i < j) {

            // for example i < j => i = 3 < j = 5 i is less than j
            // if ith variable not equal to jth variable then print is not palindrome
            if (str.charAt(i) != str.charAt(j)) {
                System.out.println("is not palindrome");
                System.exit(0);
            }
            i++;
            // if the two string are equal the i moves one step forward ---->
            j--;
            // if the two string are equal the j moves one step backwards <----
        }
        
        System.out.println("is a palindrome");

    }
}
