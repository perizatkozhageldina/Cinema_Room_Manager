import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] array = new int[n][m];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        int[][] newArray = new int[m][n];
        int index2 = 0;
        for (int i = 0; i < newArray.length; i++) {
            int index1 = array.length - 1;
            for (int j = 0; j < newArray[i].length; j++) {
                newArray[i][j] = array[index1][index2];
                index1--;
            }
            index2++;
        }
        for (int[] ints : newArray) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}