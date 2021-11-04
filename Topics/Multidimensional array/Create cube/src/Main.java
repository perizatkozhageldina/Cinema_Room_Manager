
class ArrayOperations {
    public static int[][][] createCube() {
        final int three = 3;
        int[][][] cube = new int[three][three][three];

        for (int i = 0; i < cube.length; i++) {
            int element = 0;
            for (int j = 0; j < cube[i].length; j++) {
                for (int k = 0; k < cube[i][j].length; k++) {
                    cube[i][j][k] = element;
                    element++;
                }
            }
        }

        return cube;
    }
}