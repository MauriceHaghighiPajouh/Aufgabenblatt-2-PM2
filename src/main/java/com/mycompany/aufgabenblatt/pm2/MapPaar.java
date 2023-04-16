package com.mycompany.aufgabenblatt.pm2;

import java.util.Map.Entry;

/**
 *
 * @author mauricehaghighi
 */
public class MapPaar<K, V> implements Entry {
    
  

    private MapPaar<K, V>[] pairs;

    public MapPaar() {
       
        pairs = new MapPaar[0];
    
    }
    

    public int getArraySize() {
        return pairs.length;
        
    }
    
    
    
    public MapPaar<K, V>[] getArray() {
        return pairs;
    }
    
    
    

    @Override
    public Object getKey() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object getValue() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object setValue(Object value) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
