/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aufgabenblatt.pm2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author mauricehaghighi
 */
public class PM2Map<K, V> implements Map<K, V> {

    private MapPaar<K, V>[] pairs = new MapPaar[0];

    public PM2Map() {

    }

    public MapPaar<K, V>[] getArray() {
        return pairs;
    }

    //hilfsmethode
    public void expand() {

        if (pairs.length == size()) {
            MapPaar[] newPairs = new MapPaar[(pairs.length + 2) * 2];

            for (int i = 0; i < pairs.length; i++) {
                newPairs[i] = pairs[i];
            }
            pairs = newPairs;

        }

    }

    @Override
    public int size() {
        int sum = 0;

        for (int i = 0; i < pairs.length; i++) {
            if (pairs[i] != null) {
                sum++;
            }
        }

        return sum;

    }

    @Override
    public boolean isEmpty() {
        if (pairs.length == 0) {
            return true;
        } else {
            for (MapPaar element : pairs) {
                if (element != null) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public boolean containsKey(Object key) {

        for (MapPaar<K, V> element : pairs) {
            if (element != null) {
                if (element.getKey().equals(key)) {
                    return true;
                }
            }
        }
        return false;

    }

    @Override
    public boolean containsValue(Object value) {

        for (MapPaar<K, V> element : pairs) {

            if (element != null) {
                if (element.getValue().equals(value)) {
                    return true;
                }
            }
        }
        return false;

    }

    // gibt wert vom uebergebenen schluessel zurueck
    @Override
    public V get(Object key) {

        for (MapPaar<K, V> element : pairs) {
            if (element != null) {
                if (element.getKey().equals(key)) {
                    return element.getValue();
                }
            }
        }
        return null;
    }

    @Override
    public V put(K key, V value) {
        /*durchsucht das array nach unserem schluessel
        falls gefunden, wird der wert ersetzt und der alte wert wird zurueck gegeben
         */

        for (MapPaar<K, V> element : pairs) {
            if (element != null) {
                if (element.getKey().equals(key)) {
                    V oldVal = element.getValue();
                    element.setValue(value);
                    return oldVal; // an dieser Stelle wird die Methode verlassen
                }
            }
        }

        //falls nichts gefunden wird, gibts n neuen eintrag
        MapPaar<K, V> entry = new MapPaar(key, value);
        expand();  // array erweitern weil offensichtlich kein platz

        for (int i = 0; i < pairs.length; i++) {
            if (pairs[i] == null) {
                pairs[i] = entry;
                break;
            }
        }
        return null;

    }

    /**
     *
     * @param key
     * @return the previous value associated with key, or null if there was no
     * mapping for key.
     */
    @Override
    public V remove(Object key) {

        for (int i = 0; i < pairs.length; i++) {

            if (pairs[i] != null) {

                if (pairs[i].getKey().equals(key)) {         // es wird nach key gesucht

                    V oldVal = pairs[i].getValue(); // falls fuendig, wird value gespeichert zum returnen

                    pairs[i] = null;        // das aktuelle element wird auf null gesetzt, da wir es removen

                    sortArray(i);       // hilfsmethode sortArray wird aufgerufen

                    return oldVal;
                }
            }
        }

        return null;        // siehe return in kommentaren

    }

    public void sortArray(int startIndex) {     // wir muessen nicht das ganze array durchsuchen sondern wissen wo wir anfangen koennen

        for (int i = startIndex; i < pairs.length-1; i++) {
            
            if (pairs[i] == null && pairs[i + 1] != null) {     // schiebt alle eintraege nach vorne, so dass null eintraege nur am ende des array stehen

                pairs[i] = pairs[i + 1];

                pairs[i + 1] = null;

            }
        }
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {
        // loop geht durch alle eintraege der map durch und gibt sie uns einzeln unter der variable "entry"
        for (Map.Entry<? extends K, ? extends V> entry : m.entrySet()) {
            // wir nehmen einfach den key und value aus "entry" und rufen dann immer wieder die methode "put" auf
            // put() kuemmert sich um alles andere. :-)
            K key = entry.getKey();
            V value = entry.getValue();

            put(key, value);

        }

    }

    // no doc needed
    @Override
    public void clear() {

        for (int i = 0; i < pairs.length; i++) {
            pairs[i] = null;
        }

    }

    @Override
    public Set keySet() {

        Set<K> keys = new HashSet<>(); // leichtgemacht?? hoffe i.O - einfach hashSet erstellt. Quasi eine mathematische Menge ohne Duplikate
        // mal wieder durchs array durch.. alle pairs die nicht null sind werden dem set hinzugefuegt
        // duplikate werden ohnehin nicht hinzugefuegt

        for (MapPaar<K, V> pair : pairs) {
            if (pair != null) {
                keys.add(pair.getKey());
            }
        }
        return keys;

    }

    @Override
    public Collection values() {
        // das selbe wie oben..
        // hatten theoretisch nochmal ein set zurueck geben koennen
        // stattdessen einfach liste von den values genommen

        List<V> values = new ArrayList<>();
        for (MapPaar<K, V> pair : pairs) {
            if (pair != null) {
                values.add(pair.getValue());
            }
        }
        return values;
    }

    @Override
    public Set entrySet() {

        Set<Map.Entry<K, V>> entries = new HashSet<>();

        for (MapPaar<K, V> pair : pairs) {
            if (pair != null) {

                entries.add(pair); // muesste gehen.. da MapPaar Entry erweitert und "add" einen Entry erwartet.
            }

        }
        return entries;
    }

}
