public class swapping2 {
    public static void main(String[] args) {
        int m = 10;
        int n = 20;

        // swapping logics using arithmetic operators ( * / )

    
        m = m * n;
        n = m / n;
        m = m / n;
    

        // logic explanation

        // initially m = 10 and n =20
        // step 1 =>
        // m = m * n
        // m = 10 * 20
        // m = 200
        // m = 200 and n = 20

        // step 2 =>
        // n = m / n
        // n = 200 / 20
         // n = 10
        // m = 200 , n = 10

        // step 3
        // m = m - n
        // m = 200 / 10
        // m = 20

        // output :
        // m = 20;
        // n = 10;



        System.out.println("After swapping");
        System.out.println("M :" + m);
        System.out.println("N :" + n);

    } 
}
