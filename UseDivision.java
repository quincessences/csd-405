// CSD320 - Programming with Java
// Name: Maria Q. Michaels
// Date: 06/26/2022
// Assignment: Module 6 Assignment
// Purpose: Create a UseDivision application

public class UseDivision
{
   public static void main(String []args)
   {
       InternationalDivision idiv1 = new InternationalDivision("Edinburgh Division",1234, "Scotland", "English");
       InternationalDivision idiv2 = new InternationalDivision("Paris Division",5678, "France", "French");
       DomesticDivision ddiv1 = new DomesticDivision("New York City Division", 1122, "New York");
       DomesticDivision ddiv2 = new DomesticDivision("Denver Division", 3344, "Colorado");
       idiv1.display();
       idiv2.display();
       ddiv1.display();
       ddiv2.display();
   }
}