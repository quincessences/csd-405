// CSD320 - Programming with Java
// Name: Maria Q. Michaels
// Date: 06/26/2022
// Assignment: Module 6 Assignment
// Purpose: Create an international division class

class InternationalDivision extends Division
{
   String country;
   String language;
  
   InternationalDivision(String name, int accountNum, String country, String language) {
       super(name, accountNum);
       this.country = country;
       this.language = language;
   }

   @Override
   void display() {
       System.out.println("Name: " + this.name);
       System.out.println("Account number: " + this.accountNum);
       System.out.println("Country: " + this.country);
       System.out.println("Language: " + this.language);
       System.out.println();
   }
}