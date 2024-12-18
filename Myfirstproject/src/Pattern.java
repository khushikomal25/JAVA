public class Pattern {
     public static void main(String[] args) {
        int i, j, k, l;
        for (i = 0; i <= 3; i++) {
            for (j = 0; j <= 3- i; j++) {
                System.out.print(" ");
             }
            for (k = i; k>=0; k--) {
                System.out.print(k);
            }
            for (l = 1; l<=i; l++ ) {
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
