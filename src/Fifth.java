import java.util.Scanner;
public class Fifth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount: ");
        int amount = scanner.nextInt();

        if (amount >= 1000) {
            int note1 = amount / 1000;
            amount = amount - (note1 * 1000);
            System.out.println("1000:"+" "+ note1);
        }
        if (amount >= 500) {
            int note2 = amount / 500;
            amount = amount - (note2 * 500);
            System.out.println("500:"+" "+ note2);
        }
        if (amount >= 100) {
            int note3 = amount / 100;
            amount = amount - (note3 * 100);
            System.out.println("100:"+" "+ note3);
        }
        if (amount >= 50) {
            int note4 = amount / 50;
            amount = amount - (note4 * 50);
            System.out.println("50:"+" "+ note4);
        }
        if (amount >= 20) {
            int note5 = amount / 20;
            amount = amount - (note5 * 20);
            System.out.println("20:"+" "+ note5);
        }
        if (amount >= 10) {
            int note6 = amount / 10;
            amount = amount - (note6 * 10);
            System.out.println("10:"+" "+ note6);
        }
        if (amount >= 5) {
            int note7 = amount / 5;
            amount = amount - (note7 * 5);
            System.out.println("5:"+" "+ note7);
        }
    }
}
