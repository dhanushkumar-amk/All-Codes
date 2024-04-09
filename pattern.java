
public class pattern {

    public static void main(String[] args) {
        pattern1(5);
    }

    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row col runs
            for (int col = 1; col <= row; col++) {
                // print the statement
                System.out.print("* ");

                // if one line printed we need to go new line
            }
            System.out.println();
        }
    }

}
// output 1

// *
// * *
// * * *
// * * * *
// * * * * *
