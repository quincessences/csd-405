// CSD405 - Intermediate Programming with Java
// Name: Maria Q. Michaels
// Date: 06/19/2022
// Assignment: Module 5 Assignment
// Purpose: Program 2 - Create new file, write to new file, append to previous.
// References: https://stackoverflow.com/questions/60615216/append-to-file-read-from-file-but-nothing-happens; https://docs.oracle.com/javase/tutorial/essential/io/file.html

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class MichaelsAppendRead {
    public static void main( String[] args ) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the file name: ");
        String fileName = sc.next();
        
        appendTxtFile(fileName);
        readTxtFile(fileName);
    }
    
    private static void appendTxtFile(String fileName) {
        try {
            File file = new File(fileName);
            if(!file.exists()) {
                file.createNewFile();
            }
            FileWriter fileWrite = new FileWriter(file.getName(),true);
            BufferedWriter buffWrite = new BufferedWriter(fileWrite);
            Random randomint = new Random();
            for(int i =0;i<10;i++){                 
                int num = randomint.nextInt(500);
                buffWrite.write(num+" ");
            }
            buffWrite.write("\n");
            buffWrite.close();
            fileWrite.close();
        }
        
        catch(IOException e){
            System.out.println("Error: "+ e);
        }
    }
    
    private static void readTxtFile(String fileName){
        try{
            File file = new File(fileName);
            FileReader fileRead = new FileReader(file);
            BufferedReader buffRead = new BufferedReader(fileRead);
            String line;
            System.out.println("Data of File are :");
            while ((line = buffRead.readLine()) != null){
                System.out.println(line);
            }
            buffRead.close();
            fileRead.close();
        }
        catch(FileNotFoundException e){
            System.out.println("Error: "+ e);
        }
        catch(IOException e){
            System.out.println("Error: "+ e);
        }
    }
}
   