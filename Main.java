class Pattern {
    public static void main(String[] args) {
        int num = 5;

        for (int i = num; i >= 1; i--) {
            // Print spaces
            for (int j = 1; j <= (num - i); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*"+"");
            }
            System.out.println();
        }
    }
}
