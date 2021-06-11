public class Combination {

    static int ncr(int n, int r) {
        if (r == 0 || n == r)
            return 1;

        return ncr(n - 1, r - 1) + ncr(n - 1, r);

    }

    public static void main(String[] args) {
        System.out.println(ncr(5, 2));
    }
}
