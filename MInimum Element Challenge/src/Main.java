import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the elements");
        int count=scanner.nextInt();
       int[]checkmin= readInterger(count);
        System.out.println("Min value i is "+ findMin(checkmin));

    }
    public static int[] readInterger(int c){
        System.out.println("Enter "+ c + " elements");
        int[] temp=new int[c];
        for(int i=0;i<temp.length;i++){
            temp[i]=scanner.nextInt();
        }
        return temp;
    }
    public static int findMin(int[] array){
        int min=0;
        int []minArray= Arrays.copyOf(array,array.length);
        for(int i=0;i<minArray.length;i++){
            if(minArray[i]<minArray[0])
                min=minArray[i];
        }
        return min;
    }


}
