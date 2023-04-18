/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.aufgabenblatt.pm2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author mauricehaghighi
 */
public class Aufgabenblatt2PM2 {

    public static void main(String[] args) {

        PM2Map m = new PM2Map();

        //extra keinen loop benutzt um genau aufzuzeigen was passiert
        // zuerst erstellen wir 10 neue Instanzen von Person, alle unterschiedlich
        Person person1 = new Person("Max", "Mustermann", 2, LocalDate.of(1990, 5, 20));
        Person person2 = new Person("Moritz", "Johannes", 1, LocalDate.of(1994, 6, 21));
        Person person3 = new Person("Anna", "Maria", 2, LocalDate.of(1985, 2, 14));
        Person person4 = new Person("Peter", "Tortellini", 3, LocalDate.of(2000, 11, 1));
        Person person5 = new Person("Julia", "Müller", 4, LocalDate.of(1998, 7, 3));
        Person person6 = new Person("Markus", "Schmidt", 5, LocalDate.of(1975, 10, 31));
        Person person7 = new Person("Lisa", "Klein", 0, LocalDate.of(1992, 4, 22));
        Person person8 = new Person("Simon", "Wagner", 7, LocalDate.of(1988, 8, 7));
        Person person9 = new Person("Laura", "Koch", 8, LocalDate.of(1995, 12, 15));
        Person person10 = new Person("Felix", "Bauer", 9, LocalDate.of(1983, 9, 29));

        m.put(person1.getLastName(), person1);
        m.put(person2.getLastName(), person2);
        m.put(person3.getLastName(), person3);
        m.put(person4.getLastName(), person4);
        m.put(person5.getLastName(), person5);
        m.put(person6.getLastName(), person6);
        m.put(person7.getLastName(), person7);
        m.put(person8.getLastName(), person8);
        m.put(person9.getLastName(), person9);
        m.put(person10.getLastName(), person10);

        //m.values().stream().sorted().forEach(n -> System.out.println(n));
        
        m.values().stream().sorted(Comparator.comparingInt(Person::getNumberOfKids)).forEach(System.out::println);
         
        
      
    }
}
