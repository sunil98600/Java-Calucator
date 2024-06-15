import java.util.Scanner;
public class Calculator{
    public static void main(String[] args) {
        float x = 0;
        float y = 0;
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Choose the operation to perform");
        System.out.println("1.Addition");
        System.out.println("2.Substraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.Sqrt");
        System.out.println("6.Sqr");
        
        int operation = sc.nextInt();
        System.out.println("You Chose the " +operation);
        if(operation <=4){
            System.out.println("Enter First Number");
            x = sc.nextFloat();
            System.out.println("Enter Second Number");
            y = sc.nextFloat();
        }
        else{
            System.out.println("Enter A Number");
            x = sc.nextFloat();
        }
        System.out.println("The Result is");
        switch (operation) {
            case 1:
                System.out.println(x+y);
                break;
            case 2:
                System.out.println(x-y);
                break;
            case 3:
                System.out.println(x*y);
                break;
            case 4:
                if(x!=0){
                    
                    break;
                }
                else{
                    System.out.println("Error: Division by zero is not allowed.");
                }
            case 5:
                if(x>=0){
                    System.out.println(Math.sqrt(x));
                    break;
                }
                else{
                    System.out.println("Error: Square root of a negative number is not real.");
                }
                
            case 6:
                System.out.println(x * x);
                break;
            
            
            default:
                System.out.println("Invalid operation. Please try again.");
        }
        sc.close();

    }
}