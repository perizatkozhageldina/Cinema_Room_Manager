package cinema;

import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seats = scanner.nextInt();
        int totalSeats = rows * seats;
        int purchasedTickets = 0;
        int currentIncome = 0;

        int[][] array = new int[rows][seats];
        for (int[] ints : array) {
            for(int anInt : ints) {
                anInt = 0;
            }
        }

        while (true) {
            System.out.println("\n1. Show the seats\n" +
                    "2. Buy a ticket\n" +
                    "3. Statistics\n" +
                    "0. Exit");

            int command = scanner.nextInt();

            if (command == 1) {
                System.out.println("\nCinema:");
                System.out.print("  ");
                for (int i = 1; i <= seats; i++) {
                    System.out.print(i + " ");
                }
                for (int i = 0; i < rows; i++) {
                    System.out.println();
                    System.out.print(i + 1);
                    for (int j = 0; j < seats; j++) {
                        if (array[i][j] == 0) {
                            System.out.print(" S");
                        } else if (array[i][j] == 1) {
                            System.out.print(" B");
                        }
                    }
                }
                System.out.println();
            } else if (command == 2) {
                while (true) {
                    System.out.println("\nEnter a row number:");
                    int selectedRow = scanner.nextInt();
                    System.out.println("Enter a seat number in that row:");
                    int selectedSeat = scanner.nextInt();
                    if (selectedRow < 1 || selectedRow > rows || selectedSeat < 1 || selectedSeat > seats) {
                        System.out.println("Wrong input!");
                    } else if (array[selectedRow - 1][selectedSeat - 1] == 1) {
                        System.out.println("That ticket has already been purchased!");
                    } else {
                        array[selectedRow - 1][selectedSeat - 1] = 1;
                        purchasedTickets++;
                        int ticketPrice = totalSeats < 60 ? 10 : (selectedRow <= rows / 2 ? 10 : 8);
                        System.out.println("Ticket price: $" + ticketPrice);
                        currentIncome += ticketPrice;
                        break;
                    }
                }
            } else if (command == 3) {
                int totalIncome = totalSeats > 60 ? ((rows / 2) * seats * 10 + (rows - (rows / 2)) * seats * 8) : totalSeats * 10;
                float purchasedTicketsInPercentage = (float) purchasedTickets * 100 / totalSeats;
                System.out.println("Number of purchased tickets: " + purchasedTickets);
                System.out.println("Percentage: " + String.format("%.2f",purchasedTicketsInPercentage) + "%");
                System.out.println("Current income: $" + currentIncome);
                System.out.println("Total income: $" + totalIncome);
            } else if (command == 0) {
                break;
            }
        }
    }
}