import java.util.Scanner; //THIS IS JUST TESTING CODE
public class Main
{
   public static void main(String[] args) 
   {
//Declares Skills here (probably should be done somewhere else)------------------------------------------------------------  
   Skill archery = new Skill();
   Skill avianBond = new Skill();
   Skill consumption = new Skill();
   
   int userInput;
//Loop 1
//use a negative number to exit these loops
//Increase Archery----------------------------------------------------------------------------------------------------   
   do{ 
   System.out.println("Archery: Add exp");
   Scanner keyboard = new Scanner(System.in);
   userInput = keyboard.nextInt( );
   archery.increase(userInput);
   archery.print();
   System.out.println();
   }
   while(userInput >= 0);
//Loop 2   
//Increase Avian Bond-----------------------------------------------------------------------------------------------   
     do{
   System.out.println("Avian Bond: Add exp");
   Scanner keyboard = new Scanner(System.in);
   userInput = keyboard.nextInt( );
   avianBond.increase(userInput);
   avianBond.print();
   System.out.println();
   }
   while(userInput >= 0);
//Loop 3   
//Increase Consumption-----------------------------------------------------------------------------------------------   
   do{ 
   System.out.println("Consumption: Add exp");
   Scanner keyboard = new Scanner(System.in);
   userInput = keyboard.nextInt( );
   consumption.increase(userInput);
   consumption.print();
   System.out.println();
   }
   while(userInput >= 0);
//Prints all your leveling in one place--------------------------------------------------------------------
   System.out.println("Archery");
   archery.printLevel();
   System.out.println("Avian Bond");
   avianBond.printLevel();
   System.out.println("Consumption");
   consumption.printLevel();

   
   }
}