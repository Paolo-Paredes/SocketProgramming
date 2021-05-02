import java.net.*;
import java.io.*;
import java.util.Scanner;

public class Client
{
 public static void main(String[] args) throws IOException
 {
   Socket s = new Socket("localhost", 4999);
   Scanner in = new Scanner(System.in);
   boolean done = false;
   int choice;

     PrintWriter pw = new PrintWriter(s.getOutputStream());
     InputStreamReader isr = new InputStreamReader(s.getInputStream());
     BufferedReader br = new BufferedReader(isr);

     Menu(pw,isr,br);
     System.out.print("Enter Choice.. ");
     choice = in.nextInt();

     if(choice==1)
     {
       SetOrder(pw,isr,br,in);
     }

     pw.println(choice);
     pw.flush();

   pw.close();
 }

 public static void Menu(PrintWriter pw, InputStreamReader isr, BufferedReader br)
 {
   System.out.println();
   System.out.println("1.) Enter Order");
   System.out.println("2.) Quit");
   System.out.println();
 }


public static void SetOrderMenu()
{
   System.out.println("Add Items");//Paolo
   System.out.println("Delete Items");//Raph
   System.out.println("Check Order");//TBA
   System.out.println("Submit");
}


 public static void SetOrder(PrintWriter pw, InputStreamReader isr, BufferedReader br, Scanner in)
 {
   //Add Multiple Orders
   //Add Price
   int choice;

   System.out.println("Food Choices:");
   System.out.println();
   System.out.println("1.) Chicken");
   System.out.println("2.) Beef");
   System.out.println();
   System.out.print("Enter Choice.. ");

   choice = in.nextInt();
   System.out.println();

   switch(choice)
   {
     case 1:
     pw.println("Food Choice: Chicken");

     case 2:
     pw.println("Food Choice: Beef");
   }
 }


 public static void DeleteItem()
 {
   
 }



}
