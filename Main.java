import java.util.ArrayList;
import java.util.Scanner;


class Inventory {
String item;
String Number;
int price;

public Inventory(String item, String Number, int price){
  this.item = item;
  this.Number = Number;
  this.price = price;
}
}
class Main {
	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
    
    int input;
    ArrayList<Inventory> ArList = new ArrayList<>();;
    Inventory x;
    do{
      System.out.println("Press 1 to add an item.");
      System.out.println("Press 2 to delete an item.");
      System.out.println("Press 3 to update an item.");
      System.out.println("Press 4 to show all the items.");
      System.out.println("Press 5 to quit the program.");
      input = scan.nextInt();
      scan.nextLine();
      if(input == 1){
        System.out.println("Enter the name:");
        String item = scan.nextLine();
        System.out.println("Enter the serial number:");
        String Number = scan.nextLine();
        System.out.println("Enter the value in dollars (whole number):");
        int price = scan.nextInt();
        x = new Inventory(item, Number, price);
        ArList.add(x);
      }
      if(input == 4){
        for (int i = 0; i < ArList.size(); i++){
        System.out.println(ArList.get(i).item + "," + ArList.get(i).Number + "," + ArList.get(i).price);
        }
      }
      if (input == 2){
        System.out.println("Enter the serial number of the item to delete:");
        String remove = scan.nextLine();
        for (int r = 0; r < ArList.size(); r++){
          if (remove.equals(ArList.get(r).Number)){
            ArList.remove(r);
          }
        }
      }
      if (input == 3){
        System.out.println("Enter the serial number of the item to change:");
        String edit = scan.nextLine();
        for (int e = 0; e < ArList.size(); e++){
          if (edit.equals(ArList.get(e).Number)){
            System.out.println("Enter the new name:");
            String editItem = scan.nextLine();
            System.out.println("Enter the new value in dollars (whole number):");
            int editPrice = scan.nextInt();
            ArList.set(e, new Inventory(editItem, edit, editPrice));
            
          }
        }
      }
    }while(input !=5);
	}
}