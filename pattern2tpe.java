public class pattern2tpe {
    public static void main(String[] args) {
        pattern2(5);
    }
    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row col runs
            for (int col = 1; col <= n; col++) {
                // print the statement
                System.out.print("* ");

                // if one line printed we need to go new line
            }
            System.out.println();
        }
    }
}


// output :
// * * * * * 
// * * * * * 
// * * * * * 
// * * * * * 
// * * * * * 
