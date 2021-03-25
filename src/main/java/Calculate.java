public class Calculate {
    public static int[][] formingTheMatrix(int[][] array, int size) {

        for (int i = 0; i < array.length; i += 2) {
            for (int j = 0, k = 1; j < array[i].length && k < array.length + 1; j++, k++) {
                array[i][j] = k;
            }
        }

        for (int i = 1; i < array.length; i += 2) {
            for (int j = 0, k = size; j < array[i].length && k > 0; j++, k--) {
                array[i][j] = k;
            }
        }
        return array;
    }
}
