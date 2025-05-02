public class Abacus {
    private Rod[] rods;

    public Abacus(int numDigits) {
        rods = new Rod[numDigits];
        for (int i = 0; i < numDigits; i++) rods[i] = new Rod();
    }

    public void setNumber(int num) {
        for (int i = 0; i < rods.length; i++) {
            int digit = num % 10;
            rods[i].setValue(digit);
            num /= 10;
        }
    }

    public int getNumber() {
        int value = 0;
        for (int i = rods.length - 1; i >= 0; i--) {
            value *= 10;
            value += rods[i].getValue();
        }
        return value;
    }
}
