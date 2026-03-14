public class Pattern {

    public static void main(String[] args) {

        int n = 4;
        int size = 2 * n - 1;

        for (int i = 0; i < size; i++) {

            for (int j = 0; j < size; j++) {

                int top = i;
                int bottom = size - 1 - i;
                int left = j;
                int right = size - 1 - j;

                int min = top;

                if (bottom < min) {
                    min = bottom;
                }

                if (left < min) {
                    min = left;
                }

                if (right < min) {
                    min = right;
                }

                int value = n - min;

                System.out.print(value + " ");
            }

            System.out.println();
        }
    }
}