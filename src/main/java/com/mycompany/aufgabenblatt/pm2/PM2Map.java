/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aufgabenblatt.pm2;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author mauricehaghighi
 */
public class PM2Map<K, V> implements Map {

    private MapPaar<K, V>[] pairs;

    public PM2Map() {

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
            if (element.getKey().equals(key)) {
                return true;
            }
        }
        return false;

    }

    @Override
    public boolean containsValue(Object value) {
        for (MapPaar<K, V> element : pairs) {
            if (element.getValue().equals(value)) {
                return true;
            }
        }
        return false;

    }

    // gibt wert vom uebergebenen schluessel zurueck
    @Override
    public V get(Object key) {

        for (MapPaar<K, V> element : pairs) {
            if (element.getKey().equals(key)) {
                return (V) element.getValue();
            }
        }
        return null;
    }

    @Override
    public V put(Object key, Object value) {
        /*durchsucht das array nach unserem schluessel
        falls gefunden, wird der wert ersetzt und der alte wert wird zurueck gegeben
         */

        for (MapPaar<K, V> element : pairs) {
            if (element.getKey().equals(key)) {
                V oldVal = (V) element.getValue();
                element.setValue(value);
                return oldVal; // an dieser Stelle wird die Methode verlassen
            }
        }

        //falls nichts gefunden wird, gibts n neuen eintrag
        MapPaar<K, V> entry = new MapPaar(key, value);
        expand();  // array erweitern weil offensichtlich kein platz

        for (int i = 0; i < pairs.length; i++) {
            if (pairs[i].equals(null)) {
                pairs[i] = entry;
            }
        }
        return null;

    }
    
    
    

    @Override
    public K remove(Object key) {

        throw new UnsupportedOperationException("??");

    }

    @Override
    public void putAll(Map m) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Set keySet() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Collection values() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Set entrySet() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
