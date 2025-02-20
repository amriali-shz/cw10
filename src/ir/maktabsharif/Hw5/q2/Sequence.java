package ir.maktabsharif.Hw5.q2;

public class Sequence {
    private char[] value;

    public char[] getValue() {
        return value;
    }
    public void setValue(char[] value) {
        this.value = value;
    }
    public void concat(Sequence sequence) {
        char[] newValue = new char[this.value.length + sequence.getValue().length];
        for (int i = 0; i < this.value.length; i++) {
            newValue[i] = this.value[i];
        }
        for (int i = 0; i < sequence.getValue().length; i++) {
            newValue[this.value.length + i] = sequence.getValue()[i];
        }
        this.value = newValue;
    }
    public int indexOf(char character) {
        for (int i = 0; i < value.length; i++) {
            if (value[i] == character) {
                return i;
            }
        }
        return -1;
    }
    public void replace(Sequence oldChars, Sequence newChars) {
        String currentValue = new String(this.value);
        String oldValue = new String(oldChars.getValue());
        String newValue = new String(newChars.getValue());

        currentValue = currentValue.replace(oldValue, newValue);
        this.value = currentValue.toCharArray();
    }
    public boolean equals(Sequence otherSeq) {
        if (this.value.length != otherSeq.getValue().length) {
            return false;
        }
        for (int i = 0; i < this.value.length; i++) {
            if (this.value[i] != otherSeq.getValue()[i]) {
                return false;
            }
        }
        return true;
    }

}
