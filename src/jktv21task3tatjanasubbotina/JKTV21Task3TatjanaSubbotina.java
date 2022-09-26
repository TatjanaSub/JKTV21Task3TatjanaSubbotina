/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv21task3tatjanasubbotina;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class JKTV21Task3TatjanaSubbotina {

    /**
     * @param args the command line arguments
     */
    enum Mon { jaanuar, veebruar, mart, aprill, mai, juuni, juuli, august, september, november, detsember}
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vvedite imja: ");
        String str1 = scanner.nextLine();
        System.out.println("Vvedite familiju: ");
        String str2 = scanner.nextLine();
        System.out.println("Vvedite lichnqi kod: ");
        String str3 = scanner.nextLine();
        if (str3.length() < 7){
            System.out.println("IK vveden neverno");
        } else {
            int index = str3.charAt(3) - '0';
            index = index * 10;
            index = index + str3.charAt(4) - '0';

            System.out.printf("%s %s", str1,str2);
            if (str3.charAt(0)== '4' || str3.charAt(0)== '6'){
                System.out.print(" rodilas ");
            }else {
                System.out.print(" rodilsja ");
            }
            System.out.printf("%s%s ", str3.charAt(5),str3.charAt(6));
            if(index >0 && index<12)
            {
                System.out.print(Mon.values()[index-1]);
            } else {
                System.out.print("neopredelen");
            }
            System.out.printf(" 20%s%s goda", str3.charAt(1),str3.charAt(2));
        }

        System.out.println("");
    }
    
}
