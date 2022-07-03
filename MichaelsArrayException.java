// CSD405 - Intermediate Programming with Java
// Name: Maria Q. Michaels
// Date: 06/19/2022
// Assignment: Module 5 Assignment
// Purpose: Program 1 - Array List and Exception

import java.util.ArrayList;
import java.util.Scanner;

public class MichaelsArrayException {
    public static void main(String[] args){
        ArrayList<String> playList=new ArrayList<String>();
        playList.add("1. Warrior");
        playList.add("2. Paladin");
        playList.add("3. Hunter");
        playList.add("4. Rogue");
        playList.add("6. Priest");
        playList.add("7. Shaman");
        playList.add("8. Mage");
        playList.add("9. Warlock");
        playList.add("10. Monk");
        playList.add("11. Druid");
        playList.add("12. Demon Hunter");
        playList.add("13. Death Knight");
        
        System.out.print("Available playable classes are:\n");
        for(int i = 0; i < playList.size();i++ ){
            System.out.println(playList.get(i));
      }
      
      Scanner sc  = new Scanner(System.in);
      System.out.print("\nWhich playable class would you like to see again? (Enter number): ");
      String input= sc.next();
      int  index = Integer.valueOf(input);
      try{
        if( index>=1 && index <= playList.size() )
        System.out.println("The playable class is: "+playList.get(index-1));  
        else
        throw new Exception("Out of Bounds");
    }
    catch(Exception e){
        System.out.println(e);
    }      
    }
}