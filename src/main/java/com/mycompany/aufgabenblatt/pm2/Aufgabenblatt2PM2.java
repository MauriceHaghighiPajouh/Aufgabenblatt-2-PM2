/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.aufgabenblatt.pm2;

import java.time.LocalDate;

/**
 *
 * @author mauricehaghighi
 */
public class Aufgabenblatt2PM2 {

    public static void main(String[] args) {
        
        Person person1 = new Person("Max", "Mustermann", 2, LocalDate.of(1990, 5, 20));
        Person person2 = new Person("Max", "Mustermann", 1, LocalDate.of(1990, 5, 20));
        
        System.out.println(person1.toString());

    }
}
