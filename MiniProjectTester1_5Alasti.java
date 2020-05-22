import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter; 
import java.util.Scanner;

public class MiniProjectTester1_5Alasti {
   
   public static void main(String[] args) throws FileNotFoundException {
   
      // Inputting Template and Database
      File template = new File("D:\\Coding\\Java\\CSAP\\MiniProject\\template.txt");
      File database = new File("D:\\Coding\\Java\\CSAP\\MiniProject\\database.txt");
      
      Scanner temp = new Scanner(template);
      Scanner data = new Scanner(database);
      
      while(temp.hasNextLine()){
         System.out.println(temp.nextLine());
      }
      
      // HTML OutPut File
      PrintWriter output = new PrintWriter("output.html", "UTF-8");
      output.println("<!DOCTYPE html>");
      output.println("<html>");
      
      output.println("<head>");
      output.println("</head>");
      
      output.println("<body>");
      while(temp.hasNextLine()) output.println(temp.nextLine());
      output.println("</body>");
      output.println("</html>");
      output.close();
   }
}