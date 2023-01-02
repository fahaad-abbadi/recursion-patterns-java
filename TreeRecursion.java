public class TreeRecursion {
    public static void inorder(int n) {
        if (n > 0) {
            inorder(n - 1);
            System.out.print(n + " ");
            inorder(n - 1);
        }
    }

    static void preorder(int n) {
        if (n > 0) {
            System.out.print(n + " ");
            preorder(n - 1);
            preorder(n - 1);
        }
    }

    static void postorder(int n) {
        if (n > 0) {
            postorder(n - 1);
            postorder(n - 1);
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        inorder(3);
        System.out.println();
        
        preorder(3);
        System.out.println();
        
        postorder(3);
    }
}
