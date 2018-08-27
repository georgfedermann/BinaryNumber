package org.poormanscastle.products.numbers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinaryNumberTest {

    @Test
    public void square() {
    }

    @Test
    public void set() {
        BinaryNumber number = new BinaryNumber();
        assertEquals(0, number.get(0));
        assertEquals(0, number.get(10));
        assertEquals(0, number.get(63));
        number.set(0);
        number.set(10);
        assertEquals(1, number.get(0));
        assertEquals(1, number.get(10));
        assertEquals(0, number.get(63));
        number.set(63);
        assertEquals(1, number.get(0));
        assertEquals(1, number.get(10));
        assertEquals(1, number.get(63));
    }

    @Test
    public void unset() {
        BinaryNumber number = new BinaryNumber();
        number.set(0);
        number.set(10);
        number.set(63);
        number.unset(0);
        number.unset(10);
        number.unset(63);
        assertEquals(0, number.get(0));
        assertEquals(0, number.get(10));
        assertEquals(0, number.get(63));
    }

    @Test
    public void get() {
    }
}