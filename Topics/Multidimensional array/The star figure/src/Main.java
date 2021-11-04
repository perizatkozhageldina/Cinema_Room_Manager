import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String[][] array = new String[number][number];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j || i == number / 2 || j == number / 2 || i + j == number - 1) {
                    array[i][j] = "*";
                } else {
                    array[i][j] = ".";
                }
            }
        }

        for (String[] strings : array) {
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println();
        }
    }
}