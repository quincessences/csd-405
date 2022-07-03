// CSD320 - Programming with Java
// Name: Maria Q. Michaels
// Date: 06/26/2022
// Assignment: Module 6 Assignment
// Purpose: Create a domestic division

class DomesticDivision extends Division
{
   String state;
  
   DomesticDivision(String name, int accountNum, String state) {
       super(name, accountNum);
       this.state = state;
   }

   @Override
   void display() {
       System.out.println("Name: " + this.name);
       System.out.println("Account number: " + this.accountNum);
       System.out.println("State: " + this.state);
       System.out.println();
   }
  
}