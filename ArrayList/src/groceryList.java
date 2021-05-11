import java.util.ArrayList;

public class groceryList {
private ArrayList<String> groceryList = new ArrayList<String>();
public void addGroceryItem(String item){

    groceryList.add(item);
}

public void printGrocerylist(){
    System.out.println("You have "+groceryList.size() +" items in your list");
    for (int i=0;i<groceryList.size();i++){
        System.out.println((i+1)+"."+ groceryList.get(i));
    }
}
public void modifyGroceryItem(int position, String newitem){

    groceryList.set(position,newitem);
    System.out.println("Grocery list item "+ (position+1)+ "has been updated");
}
public void removeGroceryItem(int position){
    String theitem=groceryList.get(position);
    groceryList.remove(position);
    System.out.println(theitem +"removed ");

}
public String findItem(String searchitem){
boolean present=groceryList.contains(searchitem);
int position=groceryList.indexOf(searchitem);
if(position>=0)
    return groceryList.get(position);
return null;

}
}
