/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task_1;

import java.util.Scanner;

/**st 10446180
 * bokang seonya
 *
 * @author MY PC
 */
public class Task_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String name;
        String surname;
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Enter my name >> ");
        name = inputDevice.nextLine();
        System.out.print("Enter my surname >> ");
        surname = inputDevice.nextLine();
        System.out.println("My name is " + name + 
                " my surname is " + surname);
    }
    
}
