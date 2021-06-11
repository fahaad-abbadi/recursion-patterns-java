public class HeadRecursion {

    // In 'Head Recursion' first the recursion call is made and till the recursive
    // function reaches the end, then it prints
    public static void fun(int n) {
        if (n > 0) {
            fun(n - 1);
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        fun(10);
    }
}
