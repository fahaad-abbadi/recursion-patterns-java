public class TreeRecursion {
    public static void fun1(int n) {
        if (n > 0) {
            fun1(n - 1);
            System.out.print(n + " ");
            fun1(n - 1);
        }
    }

    static void fun2(int n) {
        if (n > 0) {
            System.out.print(n + " ");
            fun2(n - 1);
            fun2(n - 1);
        }
    }

    static void fun3(int n) {
        if (n > 0) {
            fun3(n - 1);
            fun3(n - 1);
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        fun1(3);
        System.out.println();
        fun2(3);
        System.out.println();
        fun3(3);
    }
}
