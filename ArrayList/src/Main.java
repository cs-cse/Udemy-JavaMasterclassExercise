import java.util.Scanner;

public class Main {
    private static Scanner scanner=new Scanner(System.in);
    private static groceryList glist=new groceryList();
    public static void main(String[] args) {
        boolean quit =false;
        int choice=0;
//        printInstructions();
        while (!quit) {

            System.out.println("Enter your choice ( press 0 for instructions )");
            choice=scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    glist.printGrocerylist();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    System.out.println("Thank you for using this application, do visit us again");
                    quit=true;
                    break;


            }





        }
        }

        public static void printInstructions(){
            System.out.println("Press");
            System.out.println("0- Print choices");
            System.out.println("1- Print items in the list");
            System.out.println("2- Add items");
            System.out.println("3- Modify item");
            System.out.println("4- Remove item");
            System.out.println("5- Search for an item");
            System.out.println("6- Exit application");
    }
    public static void addItem(){
        System.out.print("Enter the item ");
        glist.addGroceryItem(scanner.nextLine());
    }
    public static void modifyItem(){
        System.out.println("Enter item number ");
        int itemno=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter  new item to be updated in the list");
        String newitem=scanner.nextLine();

        glist.modifyGroceryItem(itemno-1,newitem);
    }
public static void removeItem(){
    System.out.println("Enter item number ");
    int itemno=scanner.nextInt();
    scanner.nextLine();
    glist.removeGroceryItem(itemno-1);
}
public static void searchForItem(){
    System.out.println("Item to search for");
    String seachitem=scanner.nextLine();
    if(glist.findItem(seachitem)!=null)
        System.out.println("Found " + seachitem + " in the list ");
    else
        System.out.println("item " + seachitem + " not in the list");
}
    }

