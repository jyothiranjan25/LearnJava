package J3Classes;

public class Java6Encapsulation {
    // Encapsulation is the technique of making the fields in a class private and providing access to the fields via public methods.
    // If a field is declared private, it cannot be accessed by anyone outside the class, thereby hiding the fields within the class.
    // The only way to access the fields is through the public methods of the class.
    // This is a good practice to make the fields private and access them through public methods.
    // This way, the internal state of the fields can be controlled and manipulated.
    // Encapsulation is also known as data hiding.
    // Encapsulation is a protective barrier that keeps the data safe within the class and hides the data from the outside world.
    // Encapsulation is defined as the wrapping up of data under a single unit. It is the mechanism that binds together code and the data it manipulates.

    private byte byteField;
    private short shortField;
    private int intField;
    private long longField;
    private float floatField;
    private double doubleField;
    private char charField;
    private boolean booleanField;
    private String stringField;

    // Getter and Setter methods are used to access and update the values of the fields.
    // Getter methods are used to get the values of the fields.
    // Setter methods are used to set the values of the fields.
    // Getter and Setter methods are also known as Accessor and Mutator methods.
    // Getter and Setter methods are public methods.


    public byte getByteField() {
        return byteField;
    }

    public void setByteField(byte byteField) {
        this.byteField = byteField;
    }

    public short getShortField() {
        return shortField;
    }

    public void setShortField(short shortField) {
        this.shortField = shortField;
    }

    public int getIntField() {
        return intField;
    }

    public void setIntField(int intField) {
        this.intField = intField;
    }

    public long getLongField() {
        return longField;
    }

    public void setLongField(long longField) {
        this.longField = longField;
    }

    public float getFloatField() {
        return floatField;
    }

    public void setFloatField(float floatField) {
        this.floatField = floatField;
    }

    public double getDoubleField() {
        return doubleField;
    }

    public void setDoubleField(double doubleField) {
        this.doubleField = doubleField;
    }

    public char getCharField() {
        return charField;
    }

    public void setCharField(char charField) {
        this.charField = charField;
    }

    public boolean isBooleanField() {
        return booleanField;
    }

    public void setBooleanField(boolean booleanField) {
        this.booleanField = booleanField;
    }

    public String getStringField() {
        return stringField;
    }

    public void setStringField(String stringField) {
        this.stringField = stringField;
    }
}
