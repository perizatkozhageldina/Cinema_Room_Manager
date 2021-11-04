import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int seats = scanner.nextInt();

        int[][] array = new int[rows][seats];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        int k = scanner.nextInt();
        int counter = 0;
        int row = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 0) {
                    counter++;
                    if (counter == k) {
                        row = i + 1;
                        break;
                    }
                } else {
                    counter = 0;
                }
            }
            if (row != 0) {
                break;
            }
            counter = 0;
        }
        System.out.println(row);
    }
}