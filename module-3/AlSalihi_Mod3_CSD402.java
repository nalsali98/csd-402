public static void main(String[] args) {

    int rows = 7;

    for (int row = 0; row < rows; row++) {

        // Leading spaces
        for (int space = rows - row - 1; space > 0; space--) {
            System.out.print("  ");
        }

        // Increasing powers of 2
        int value = 1;
        for (int col = 0; col <= row; col++) {
            System.out.print(value + " ");
            value *= 2;
        }

        // Decreasing powers of 2
        value /= 4;
        for (int col = 0; col < row; col++) {
            System.out.print(value + " ");
            value /= 2;
        }


        // @ at end of line
        System.out.println("@");
    }
}

