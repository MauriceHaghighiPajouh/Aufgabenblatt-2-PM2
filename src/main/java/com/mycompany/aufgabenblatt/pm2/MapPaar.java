package com.mycompany.aufgabenblatt.pm2;

import java.util.Map.Entry;

/**
 *
 * @author mauricehaghighi
 */
public class MapPaar<K, V> implements Entry<K,V> {

    private K key;
    private V value;

    public MapPaar(K key, V value) {
        this.key = key;
        this.value = value;

    }
    // return schluessel
    @Override
    public K getKey() {
        return key;
    }
    
    // return wert
    @Override
    public V getValue() {
        return value;
    }
    
    /**
     * 
     * 
     * @param newVal ( new value)
     * @return oldVal ( old value)
     */
    @Override
    public Object setValue(Object newVal) {
        V oldVal = this.value;
        this.value = (V) newVal;
        return oldVal;

    }

}
