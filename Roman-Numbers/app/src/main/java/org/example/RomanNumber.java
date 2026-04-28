package org.example;

public class RomanNumber extends Number implements Comparable<RomanNumber> {

    // Current Roman Value
    private String roman;

    // Current Normal Value
    private int value;

    // ------------------ Constructors ------------

    /**
     * Default constructor
     */
    public RomanNumber() {
        // Ignored
    }

    // -------------------- Methods -----------------------

    /**
     * Converts a Roman number into a normal number.
     * 
     * @param roman the Roman number to convert
     * @return a normal number like 1, 2, 3, ...
     * @throws IllegalArgumentException if input is not valid
     * @param roman
     */
    public RomanNumber(String roman) {
        this.roman = roman;
        this.value = RomanConverter.getNumberFromRoman(this.roman);
    }

    /**
     * Converts a normal number into a Roman number.
     * 
     * @param value it is a normal number like 1, 2, 3, ...
     */
    public RomanNumber(int value) {
        this.value = value;
        this.roman = RomanConverter.getRomanFromNumber(this.value);
    }

    /**
     * Puts values into this class
     * 
     * @param value it is a normal number like 1, 2, 3, ...
     * @param roman a Roman number like I, II, III, IV, ...
     */
    public RomanNumber(int value, String roman) {
        this.value = value;
        this.roman = roman;
    }

    // ----------------- Getters and Setters -------------
    public String getRoman() {
        return this.roman;
    }

    public int getValue() {
        return this.value;
    }

    public void setRoman(String roman) {
        this.roman = roman;
        this.value = RomanConverter.getNumberFromRoman(this.roman);
    }

    public void setValue(int value) {
        this.value = value;
        this.roman = RomanConverter.getRomanFromNumber(this.value);
    }

    /**
     * @{inheritDoc}
     */
    @Override
    public double doubleValue() {
        // TODO
        return (double) this.value;
    }

    /**
     * @{inheritDoc}
     */
    @Override
    public float floatValue() {
        // TODO
        return (float) this.value;
    }

    /**
     * @{inheritDoc}
     */
    @Override
    public int intValue() {
        // TODO
        return (int) this.value;
    }

    /**
     * @{inheritDoc}
     */
    @Override
    public long longValue() {
        // TODO
        return (long) this.value;
    }

    @Override
    public String toString() {
        // TODO
        return this.roman;
    }

    @Override
    public int compareTo(RomanNumber other) {
        return Integer.compare(this.value, other.value);
    }
}