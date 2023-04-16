package com.mycompany.aufgabenblatt.pm2;

import java.util.Map.Entry;

/**
 *
 * @author mauricehaghighi
 */
public class MapPaar<K, V> implements Entry {

    private K key;
    private V value;

    public MapPaar(K key, V value) {
        this.key = key;
        this.value = value;

    }

    @Override
    public Object getKey() {
        return key;
    }

    @Override
    public Object getValue() {
        return value;
    }

    @Override
    public Object setValue(Object newVal) {
        V oldVal = this.value;
        this.value = (V) newVal;
        return oldVal;

    }

}
