//This code is the superclass that stores the progression of all your skills

import java.util.Scanner;
public class Skill
{
//basic variables----------------------------------------------------------------------------------------------------
   int level = 1;
   int exp = 0; 
   int nxt = 50 + level * 50; 
   

//Increase experience----------------------------------------------   
   public void increase(int val){
      exp += val;
      nxt = nxt - val;
      while (nxt <= 0){
         if(level < 30){ //Not efficient, but necessary as a level cap
            level += 1;
         }
         nxt = 100 + level * 50 + nxt;
         
      }
   } 
//print statistics------------------------------------------------------
   public void print(){ // this only exists because I don't know how to reference an object from a class
      System.out.println("Level " + level);   
      System.out.println("you have " + exp + " exp");  
      System.out.println("You need " + nxt + " exp to reach the next level");  
   }
//printlevel---------------------------------------------------------------------------
   public void printLevel(){
   System.out.println("Level " + level); 
   
     
   }
     
 
}
      
     
      
      
