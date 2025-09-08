public class HollowRectangle {
    public static void main(String[] args) {
        int ROW = 10;
        int COL = 7;

        for (int row = 0; row < ROW; row++) {
            for (int col = 0; col < COL; col++) {
                if (row == 0 || row == ROW-1) {
                    System.out.print("* ");
                } else {
                    if (col == 0 || col == COL-1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
}
