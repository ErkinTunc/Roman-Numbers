package org.example;

public class RomanNumber extends Number implements Comparable<RomanNumber> {

    private String roman;

    private int value;

    public RomanNumber() {
        // Ignored
    }

    public RomanNumber(String roman) {
        if (value < 1 || value > 3999) {
            throw new IllegalArgumentException("Roman numbers must be between 1 and 3999");
        }
        this.roman = roman;
        this.value = RomanConverter.getNumberFromRoman(this.roman);
    }

    public RomanNumber(int value) {
        this.value = value;
        this.roman = RomanConverter.getRomanFromNumber(this.value);
    }

    public RomanNumber(int value, String roman) {
        this.value = value;
        this.roman = roman;
    }

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
        return 0;
    }

    /**
     * @{inheritDoc}
     */
    @Override
    public float floatValue() {
        // TODO
        return 0;
    }

    /**
     * @{inheritDoc}
     */
    @Override
    public int intValue() {
        // TODO
        return 0;
    }

    /**
     * @{inheritDoc}
     */
    @Override
    public long longValue() {
        // TODO
        return 0;
    }

    @Override
    public String toString() {
        // TODO
        return "";
    }

    @Override
    public int compareTo(RomanNumber other) {
        return Integer.compare(this.value, other.value);
    }
}