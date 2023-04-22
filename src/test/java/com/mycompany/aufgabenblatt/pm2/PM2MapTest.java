/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.aufgabenblatt.pm2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author mauricehaghighi
 */
public class PM2MapTest {

    PM2Map test = new PM2Map();
    //MapPaar testEintrag = new MapPaar(123,"Hannes");

    public PM2MapTest() {
    }

    /**
     * Test of size method, of class PM2Map.
     */
    @Test
    public void testSize() {
        test.put(123, "hannes");
        test.put(000, "max");
        test.put(007, "James Bond");

        assertEquals(3, test.size());
    }

    /**
     * Test of isEmpty method, of class PM2Map.
     */
    @Test
    public void testIsEmpty() {
        assertTrue(test.isEmpty());
        test.put(123, "hannes");
        assertFalse(test.isEmpty());

    }

    /**
     * Test of containsKey method, of class PM2Map.
     */
    @Test
    public void testContainsKey() {
        test.put(007, "James Bond");
        test.containsKey(007);
    }

    /**
     * Test of containsValue method, of class PM2Map.
     */
    @Test
    public void testContainsValue() {

        test.put(007, "James Bond");
        assertTrue(test.containsValue("James Bond"));

    }

    /**
     * Test of get method, of class PM2Map.
     */
    @Test
    public void testGet() {
        test.put(007, "James Bond");
        assertEquals("James Bond", test.get(007));
    }

    /**
     * Test of remove method, of class PM2Map.
     */
    @Test
    public void testRemove() {
        test.put(007, "James Bond");

        test.remove(007);

        assertEquals(null, test.get(007));

    }

    @Test
    public void testRemoveNotNull() {

        test.put(007, "James bond");
        test.put("moin", "James bond");
        test.remove(007);
        test.remove("moin");
        
        MapPaar[] testArr = test.getArray();
        
        boolean zero = testArr[0].getKey()=="_FREE_";
        boolean one = testArr[1].getKey()=="_FREE_";
        
        assertEquals(true,zero&&one);
        

    }

    /**
     * Test of putAll method, of class PM2Map.
     */
    @Test
    public void testPutAll() {
        HashMap<Integer, String> testMap = new HashMap<>();
        testMap.put(1, "moin");
        testMap.put(2, "mahlzeit");

        test.putAll(testMap);

        assertEquals("moin", test.get(1));
        assertEquals("mahlzeit", test.get(2));

    }

    /**
     * Test of clear method, of class PM2Map.
     */
    @Test
    public void testClear() {
        test.put(1, "max");
        test.put(2, "moritz");
        test.put(3, "hans");
        test.clear();

        assertEquals(0, test.size());

    }

    /**
     * Test of keySet method, of class PM2Map.
     */
    @Test
    public void testKeySet() {

        Set<Integer> setTest = new HashSet();

        test.put(1, "max");
        test.put(2, "moritz");
        test.put(3, "hans");

        setTest = test.keySet();
        assertTrue(setTest.contains(1));
        assertTrue(setTest.contains(2));
        assertTrue(setTest.contains(3));

    }

    /**
     * Test of values method, of class PM2Map.
     */
    @Test
    public void testValues() {

        test.put(1, "max");
        test.put(2, "moritz");

        List<?> values = new ArrayList<>();
        values = (List<?>) test.values();
        values.contains("max");
        values.contains("moritz");
    }

    /**
     * Test of entrySet method, of class PM2Map.
     */
    @Test
    public void testEntrySet() {

        test.put(1, "max");
        test.put(2, "moritz");

        Set<Map.Entry<Integer, String>> entrySet = test.entrySet();

        assertFalse(entrySet.isEmpty());
        assertEquals(2, entrySet.size());

    }

}
