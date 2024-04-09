public class swapping3 {
    public static void main(String[] args) {
        int m = 10;
        int n = 20;

        // swapping logics using Bitwise xor operator operators ( ^ )

        m = m ^ n;
        n = m ^ n;
        m = m ^ n;

        // logic explanation
        // xor table
        
        // 1 1 1
        // 1 0 0
        // 0 0 1
        // 0 1 0

        // both are same will return 1
        // both are different will return 0
        
        // take decimal to binary for 20 and 10
        // 10 => 1010
        // 20 => 10100
        //       ------
        // 30  =>11110
        //       ------
        
        // like this
        
        System.out.println("After swapping");
        System.out.println("M :" + m);
        System.out.println("N :" + n);

    }
}
