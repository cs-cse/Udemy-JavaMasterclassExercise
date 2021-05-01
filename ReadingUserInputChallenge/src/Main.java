import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      nextInt();




    }
    public static void nextInt(){
        Scanner scanner=new Scanner(System.in);

        int sum=0,counter=1,i=0;
        while(true) {
            System.out.println("Enter number " + "#" + counter+":");

            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int n = scanner.nextInt();
                counter++;
                sum = sum + n;
                if(counter==11)
                    break;

            } else {
                System.out.println("Invalid Number");
            }
                            scanner.nextLine();

        }

        System.out.println("Sum = "+ sum);
        scanner.close();
    }
}
