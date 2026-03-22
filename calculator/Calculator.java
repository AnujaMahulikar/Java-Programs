
public class Calculator {

    public static void main(String[] args) {

        while(true) {

            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = ConsoleInput.getInt();

            if(choice == 5) {
                break;
            }

            System.out.print("Enter first number: ");
            double a = ConsoleInput.getDouble();

            System.out.print("Enter second number: ");
            double b = ConsoleInput.getDouble();

            switch(choice) {

                case 1:
                    System.out.println("Addition = " + (a + b));
                    break;

                case 2:
                    System.out.println("Subtraction = " + (a - b));
                    break;

                case 3:
                    System.out.println("Multiplication = " + (a * b));
                    break;

                case 4:
                    if(b != 0)
                        System.out.println("Division = " + (a / b));
                    else
                        System.out.println("Cannot divide by zero");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
