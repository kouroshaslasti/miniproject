import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MiniProject2_5Alasti {
   public static void main(String[] args) {
   
     ArrayList<Item> list = new ArrayList<>();
     int x = Integer.parseInt(JOptionPane.showInputDialog("How many Items are present?"));
     for(int i = 0; i < x; i++){
      boolean pet; 
      double price = Double.parseDouble(JOptionPane.showInputDialog("How much does Item " + (i+1) + " cost"));
      int a = JOptionPane.showConfirmDialog(null, "Is this Item a Pet?", "Please Select", JOptionPane.YES_NO_OPTION);
      int q = Integer.parseInt(JOptionPane.showInputDialog("How many of these do you have?"));
      
      if(a == 1) pet = true;
      else pet = false;
    
      list.add(new Item(price, pet, q));
     }
     
     Invoice receipt = new Invoice(list); 
     receipt.getDiscount();
   }
}
// 7.11
class Item {
   private double price; 
   private boolean isPet; 
   private int quantity; 
   
   public Item(double p, boolean b, int q){
      price = p;
      isPet = b; 
      quantity = q; 
   }
   
   public double getPrice() {
      return price; 
   }
   
   public boolean getPet() {
      return isPet;
   }
   
   public int getQuantity() {
      return quantity;
   }
  
   public String toString() {
      return "The price of Item: " + price + "\nThe number of said Item: " + quantity + "\nIs Item a Pet: " + isPet; 
   } 
}

class Invoice {
   private ArrayList<Item> cart; 
   
   public Invoice(ArrayList<Item> list) {
      cart = list;
   }
   
//   public void add(Item anItem) {
//       cart.add(anItem);
//    }
   
   public double getDiscount() {
      int count = 0;
      double totalPrice = 0.0; // Price without pet. 
      double discountPrice = 0.0; 
      if(cart.size() >= 6) {
         for(int i = 0; i < cart.size() - 1; i++){
            if(cart.get(i).getPet() == true) count++;
            else totalPrice += cart.get(i).getPrice(); 
         }
      } else return 0.0;
      discountPrice = totalPrice *.2; 
      return discountPrice;
   }
}
