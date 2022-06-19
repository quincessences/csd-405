// CSD405 - Intermediate Programming with Java
// Name: Maria Q. Michaels
// Date: 06/12/2022
// Assignment: Module 4 Assignment
// Purpose: Create an array list class.


import java.util.*;

public class MariaArrayListTest {
    public static Integer max(ArrayList<Integer> list) {
        if (list.size() == 0) {
            return 0;
        }
        
        Integer max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(input!=0) {
            list.add(input);
            input = sc.nextInt();
        }
        list.add(input);
        System.out.println("Max value is " + max(list)+".");
        sc.close();
    }
}
