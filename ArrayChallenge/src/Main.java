import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myArray = getIntegers(5);
        int[]sorted=sortIntegers(myArray);
        printArray(sorted);
    }


    public static int[] getIntegers(int number) {

        int[] random = new int[number];
        System.out.println("Enter " + number + " elements");
        for (int i = 0; i < random.length; i++) {
            random[i] = scanner.nextInt();
        }
        return random;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[]  sortIntegers(int[] sortarray) {
        int[] testing = new int[sortarray.length];
        for (int i = 0; i < sortarray.length; i++) {
            testing[i]=sortarray[i];
        }
      boolean flag=true;
        int  temp;
        while (flag){
            flag=false;
            for(int i=0;i<testing.length-1;i++){
            if(testing[i]<testing[i+1]){
                temp=testing[i];
                testing[i]=testing[i+1];
                testing[i+1]=temp;
            }
            }


        }
        return testing;
    }
}