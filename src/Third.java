import java.util.Scanner;
public class Third {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Enter your nationality: ");
        String nationality = scanner.next();

        if(age >= 18 && nationality.equals("Nepal")) {
            System.out.println("You can vote");
        }
        else{
            System.out.println("You cannot vote");
        }
    }
}
