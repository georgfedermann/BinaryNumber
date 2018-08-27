package org.poormanscastle.products.numbers;

import java.util.BitSet;

/**
 * A specific purpose binary number implementation.
 * This is a binary fix comma number.
 * 5 bits before the comma, the rest of the 64 bits are after comma digits.
 */
public class BinaryNumber {

    private BitSet bitSet = new BitSet();

    /**
     * @return a new instance of BinaryNumber holding the result of squaring this number.
     */
    public BitSet square() {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    /**
     * sets the bit at the given position.
     * position must be between 0 and 63.
     * 0 is the most significant bit, 63 is the lsb. (least significant bit)
     */
    public void set(int position) {
        bitSet.set(position);
    }

    /**
     * unsets the bit at the given position.
     * position must be between 0 and 63.
     * 0 is the most significant bit, 63 is the lsb. (least significant bit)
     *
     * @param position
     */
    public void unset(int position) {
        bitSet.set(position, false);
    }

    /**
     * @param position
     * @return 1 if the bit at position is set, 0 otherwise.
     */
    public int get(int position) {
        return bitSet.get(position) ? 1 : 0;
    }

}
