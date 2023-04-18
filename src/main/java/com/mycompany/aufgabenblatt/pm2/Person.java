package com.mycompany.aufgabenblatt.pm2;

import com.google.common.base.Preconditions;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Optional;

/**
 *
 * @author mauricehaghighi
 */
public class Person implements Comparable<Person> {

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

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getNumberOfKids() {
        return numberOfKids;
    }

    //guava API 
    public void setLastName(String newName) {

        Preconditions.checkNotNull(newName);

        this.lastName = newName;

    }

    //klassische java doc precondition
    /**
     * precondition: kids not negative
     *
     * @param kids
     */

    public void setNumberOfKids(int kids) {
        assert (kids <= 0);

        this.numberOfKids = kids;
    }

    /**
     *
     * @param @return 0 if objects are equal, -1 if not
     *
     */
    @Override
    public int compareTo(Person o) {

        if (equals(o)) {
            return 0;
        }
        return -1;

    }

    /**
     *
     * @param obj
     * @return true if objects have same birthday, last name and first name
     * @return false if one of the 3 stated above is not the same
     */
    
    @Override
    public boolean equals(Object obj) {

        //Optional<Person> opt = Optional.empty();
        // wenn es sich um das selbe Objekt handelt koennen wir direkt true returnen ( außer es ist schroedingers katze?)
        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        }

        Person other = (Person) obj;

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
        //prueft einfach ob name oder geburtsdatum nicht null sind. falls doch, scheint irgendwas nicht iO zu sein

        Preconditions.checkArgument(firstName != null && lastName != null && birthdate != null, "one of the attributes is null");

        return "Vorname: " + firstName + 
                "\nNachname: " + lastName
                + "\n Geburtsdatum : " + birthdate
                + "\n Anzahl Kinder " + numberOfKids
                +"\n                               ";

    }

}
