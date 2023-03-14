public class main {
    public static void main(String[] args) {
        int[] a = {25, 11, 7, 75, 56};
        System.out.println("odd numbers:");
        for (int k : a) {
            if (k % 2 != 0) {
                System.out.println(k);
            }
        }
        System.out.println("even numbers:");
        for (int j : a) {
            if (j % 2 == 0) {
                System.out.println(j);
            }
        }
    }
}
