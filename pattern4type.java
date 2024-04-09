public class pattern4type {
    
    public static void main(String[] args) {
        pattern4(5);
    }

    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row col runs
            for (int col = 1; col <= row; col++) {
                // print the statement now print the col number

                
                System.out.print( "  " + col);

                // if one line printed we need to go new line
            }
            System.out.println();
        }
    }
}


// output 
// 1
// 1  2
// 1  2  3
// 1  2  3  4
// 1  2  3  4  5