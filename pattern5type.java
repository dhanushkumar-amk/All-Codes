public class pattern5type {
    public static void main(String[] args) {
        pattern5(10);
    }

    static void pattern5(int n) {
        // row less than 2n
        for (int row = 0; row < 2 * n; row++) {
            int totalColsInRow = row > n ? 2*n- row- 1: row;
            // for every row col runs
            for (int col = 1; col <= totalColsInRow; col++) {
                // print the statement now print the col number

                
                System.out.print(" * ");

                // if one line printed we need to go new line
            }
            System.out.println();
        }
    }  
}

// output :
// * 
// *  * 
// *  *  * 
// *  *  *  * 
// *  *  *  *  * 
// *  *  * 
// *  * 
// * 
