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

    @Override
    public int size() {
        return pairs.length;

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

    @Override
    public V get(Object key) {

        for (MapPaar<K, V> element : pairs ) {
            if (element.getKey().equals(key)) {
                return (V) element.getValue();
            }
        }
        return null;
    }

    @Override
    public V put(Object key, Object value) {
        throw new UnsupportedOperationException("??");

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
