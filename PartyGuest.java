import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

class PartyGuest 
{  
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int numberOfGuests = 4;
      Random rand = new Random();
      ArrayList<String> guestList = new ArrayList<String>();
      
      System.out.println("Please Enter 4 Guests:");
      
      int control = 1;
      while(control < 5)
      {
      System.out.printf("guest%d: ", control);
      guestList.add(input.nextLine());
      control++;
      }
       
      System.out.printf("Guest List: %s\n", guestList.toString());
      
      int kill = rand.nextInt(4);
      System.out.printf("%s can't come\n", guestList.get(kill));
      guestList.remove(kill);
      
      System.out.printf("Guest List: %s\n", guestList.toString());
  }
}