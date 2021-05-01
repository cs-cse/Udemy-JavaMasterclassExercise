import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int min=0,max=0;
        boolean flag=true;
        while(true){
            System.out.println("Enter Number ");

            boolean ifInt=scanner.hasNextInt();
            if(ifInt) {
                int n = scanner.nextInt();
                if(flag){

                    flag=false;
                    min=n;
                    max=n;
                }


                if(n>max)
                    max=n;
                if(n<min)
                    min=n;

            }
            else {

                break;

            }
            scanner.nextLine();


        }






        System.out.println("Minimum Value "+ min);
        System.out.println("Maximum value "+ max);
        scanner.close();
    }

}
