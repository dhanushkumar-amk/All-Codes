public class pattern3type {
    public static void main(String[] args) {
        pattern3(5);
    }

    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row col runs
            for (int col = 1; col <= n - row + 1; col++) {
                // print the statement
                System.out.print("* ");

                // if one line printed we need to go new line
            }
            System.out.println();
        }
    }

}

// output 3 
// * * * * * 
// * * * * 
// * * * 
// * * 
// * 


// n - row + 1
// 5 - 5 + 1
// 1 column

// 5 - 1 + 1
// 5 columns 