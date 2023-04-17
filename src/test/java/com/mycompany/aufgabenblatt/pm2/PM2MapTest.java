/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.aufgabenblatt.pm2;

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
    }

    /**
     * Test of put method, of class PM2Map.
     */
    @Test
    public void testPut() {
    }

    /**
     * Test of remove method, of class PM2Map.
     */
    @Test
    public void testRemove() {
    }

    /**
     * Test of sortArray method, of class PM2Map.
     */
    @Test
    public void testSortArray() {
    }

    /**
     * Test of putAll method, of class PM2Map.
     */
    @Test
    public void testPutAll() {
    }

    /**
     * Test of clear method, of class PM2Map.
     */
    @Test
    public void testClear() {
    }

    /**
     * Test of keySet method, of class PM2Map.
     */
    @Test
    public void testKeySet() {
    }

    /**
     * Test of values method, of class PM2Map.
     */
    @Test
    public void testValues() {
    }

    /**
     * Test of entrySet method, of class PM2Map.
     */
    @Test
    public void testEntrySet() {
    }

}
