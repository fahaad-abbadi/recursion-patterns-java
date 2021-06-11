public class TailRecursion {

    // Here, the number is printed, and recursive call is made
    public static void fun(int n) {
        if (n > 0) {
            System.out.println(n);
            fun(n - 1);
        }
    }

    public static void main(String[] args) {
        fun(10);
    }
}
