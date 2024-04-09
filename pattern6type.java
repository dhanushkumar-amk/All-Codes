public class pattern6type {
    public static void main(String[] args) {
        pattern6(5);
    }

    static void pattern6(int n) {
        for (int row = 1; row < 2 * n; row++) {
            int totalColsInRow = row > n ? 2 * n - row - 1 : row;

            int spaces = n - totalColsInRow;
            for (int s = 0; s <= spaces; s++) {
                System.out.print(" ");
            }
            // for every row col runs
            for (int col = 0; col < totalColsInRow; col++) {
                // print the statement now print the col number

                System.out.print("* ");

                // if one line printed we need to go new line
            }
            System.out.println();
        }
    }
}


// output 6
//     * 
//    * * 
//   * * * 
//  * * * * 
// * * * * * 
//  * * * * 
//   * * *
//    * *
//     *