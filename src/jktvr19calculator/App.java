/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktvr19calculator;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class App {
    private String repeat = "y";
    public void  run(){
        System.out.println("---------------- Калькулятор --------------------");
        do {
            System.out.print("Введите первое число: ");
            Scanner scanner = new Scanner(System.in);
            double number1 = scanner.nextDouble();
            System.out.print("Введите второе число: ");
            double number2 = scanner.nextDouble();

            System.out.print("Введите операцию: (+,-,*,/)");
            scanner.nextLine();
            String znak = scanner.nextLine();


            System.out.print("Результат: ");
            if ("+".equals(znak)) {
                System.out.println(number1 + number2);    
            }
            if ("-".equals(znak)) {
                System.out.println(number1 - number2);    
            }
            if ("*".equals(znak)) {
                System.out.println(number1 * number2);    
            }
            if ("/".equals(znak)) {
                if (number2 == 0) {
                System.out.println("На ноль делить нельзя");
                return;
            } else {
                System.out.println(number1 / number2);}    
            }
            System.out.println("Для продолжения нажмите \"y\", для выхода нажмите любую другую клавишу");
            repeat = scanner.nextLine();
        }
        while(repeat.equals("y"));
        
        System.out.println("---------------- Конец программы ----------------");
    
    }
    
}
