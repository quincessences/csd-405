// CSD320 - Programming with Java
// Name: Maria Q. Michaels
// Date: 06/26/2022
// Assignment: Module 6 Assignment
// Purpose: Create an abstract division class

abstract class Division
{
   String name;
   int accountNum;

   abstract void display();
  
   Division(String name, int accountNum)
   {
       this.name = name;
       this.accountNum = accountNum;
   }
}