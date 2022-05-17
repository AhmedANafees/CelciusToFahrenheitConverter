import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nafea8846
 */
public class CelsiusToFahrenheit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    //Temerature in Fahrenheit
    int F = 0;
    //Temeperature in Celcius
    int C = 0;
    
    Scanner input = new Scanner(System.in);
    System.out.println("Enter Temperature in C");
    C = input.nextInt();
    F = (C*9)/5+32;
    System.out.println("The temperature is " + F + " fahrenheit");
    }
   
}
