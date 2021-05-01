import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner= new Scanner(System.in);
        int sum=0, count=0;long avg=0;
        while(true){

            boolean isInt= scanner.hasNextInt();
            if(isInt){
                int n= scanner.nextInt();
                count++;
                sum+=n;
                avg=Math.round( (double)sum/count);


            }
            else
            {

                break;
            }
            scanner.nextLine();




        }





        System.out.print("SUM = " + sum +" ");
        System.out.println("AVG = "+ avg );

        scanner.close();





    }
}

//import java.util.Scanner;
//
//public class InputCalculator {
//    public static void inputThenPrintSumAndAverage(){
//        Scanner scanner = new Scanner(System.in);
//        int sum = 0;
//        int count = 0;
//
//        while(scanner.hasNextInt()){
//            sum += scanner.nextInt();
//            count++;
//            scanner.nextLine();
//        }
//        System.out.println("SUM = " + sum + " AVG = " + Math.round((double) sum/count));
//        scanner.close();
//    }
//}