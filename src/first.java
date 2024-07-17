public class first {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 6;
        int sum = num1 + num2;
        System.out.println("The sum of the numbers is"+ sum);

        double radius = 5;
        double pi = 3.14;
        double area = pi * radius * radius;
        System.out.println("The area of the circle is"+ area);

        double principle = 5463524;
        double time = 6;
        double rate = 9;
        double SimpleInterest = (principle * time * rate)/100;
        System.out.println("The Simple Interest is"+ SimpleInterest);

        int num = 4576;
        if(num % 2 == 0){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }
    }
}
