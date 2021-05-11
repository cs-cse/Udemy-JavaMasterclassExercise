import java.util.Arrays;
import java.util.Scanner;

public class Main {
//    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        int ele=readInteger();
        int []checkingmin=readElements(ele);
        System.out.println(findMin(checkingmin));

    }
    public static int readInteger(){
         Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the  number of elements ");
        int c=scanner.nextInt();
        return c;
    }
    public static int[] readElements(int count){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter "+ count + " elements");
        int[] temp=new int[count];
        for(int i=0;i<temp.length;i++){
            temp[i]=scanner.nextInt();
        }
        return temp;
    }
    public static int findMin(int[] array){
        int min=0;

        int []minArray= Arrays.copyOf(array,array.length);
        for(int  i=0;i<minArray.length;i++){
            if(minArray[i]<minArray[0])
                min=minArray[i];
        }

        return min;
    }
}
