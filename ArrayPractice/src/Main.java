import java.util.Scanner;

public class Main {
    private static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the number of elements");
        int number=scanner.nextInt();
            int[] TestArray= getElements(number);
            printArrays(TestArray);
        System.out.println("Average of "+ number+" elements is = "+ printAverageofElements(TestArray));

        }
        public static int[] getElements(int elements){
            System.out.println("Enter " + elements + " numbers\r");
            int[] values=new int[elements];
            for (int i=0;i<elements;i++){
                     values[i]=scanner.nextInt();
            }
return values;
        }
        public static void printArrays(int[] array){
        for(int i=0; i<array.length;i++){
            System.out.println("Element at "+i+ " = " + array[i] );
        }
        }
        public static double printAverageofElements(int[] arrayAverage ){
        int sum=0;
        for (int i=0;i<arrayAverage.length;i++){
             sum+=arrayAverage[i];
         }
        return (double) sum/(double)arrayAverage.length;
        }




    }





