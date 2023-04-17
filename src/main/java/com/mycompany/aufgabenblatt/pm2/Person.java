package com.mycompany.aufgabenblatt.pm2;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author mauricehaghighi
 */
public class Person<T> implements Comparable<T> {

    private String firstName;
    private String lastName;
    private int numberOfKids;
    private LocalDate birthdate;

    public Person(String fn, String ln, int kids, LocalDate bd) {
        this.firstName = fn;
        this.lastName = ln;
        this.numberOfKids = kids;
        this.birthdate = bd;
    }

    public void setLastName(String newName) {
        this.lastName = newName;

    }

    public void setNumberOfKids(int kids) {
        this.numberOfKids = kids;
    }

    /**
     *
     * @param @return 0 if objects are equal, -1 if not
     *
     */
    @Override
    public int compareTo(Object o) {

        if (equals(o)) {
            return 0;
        }
        return -1;

    }

    @Override
    public boolean equals(Object obj) {
        // wenn es sich um das selbe Objekt handelt koennen wir direkt true returnen ( außer es ist schroedingers katze?)
        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        }

        Person<?> other = (Person<?>) obj;

        boolean birthday = birthdate.equals(other.birthdate);
        boolean fnBool = firstName.equals(other.firstName);
        boolean lnBool = lastName.equals(other.lastName);
        // Hatte definitiv mit weniger code geloest werden koennen. dient nur der uebersicht
        return birthday && fnBool && lnBool;

    }

    /*
    generiert einen neuen hashcode um das Objekt bzw die Instanz zuzuordnen ( wie eine ID)
    Ich hab keine Ahnung wie das gemacht wird also hab ich einfach an den 3 Attributen die hashcode methode aufgerufen und 
    somit einen neuen hashcode erzeugt
      
     
    
    @Override
    public int hashCode() {
        int hashCode;

        hashCode = firstName.hashCode() + lastName.hashCode() + birthdate.hashCode();
        return hashCode;

    }
    
     */
    // >> Loesung von StackOverflow
    /* scheint geschickter geloest zu sein. Objects bietet einen "hashcode-generator" dem man endlos viele werte uebergeben kann
     */
    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, numberOfKids, birthdate);
    }

    // kurz recherchiert. soll tatsaechlich einfach nur infos ueber die instanz liefern, nichts wildes.
    @Override
    public String toString() {

        return "Vorname: " + firstName + " Nachname: " + lastName
                + "\n Geburtsdatum : " + birthdate
                + "\n Anzahl Kinder " + numberOfKids;

    }

}
