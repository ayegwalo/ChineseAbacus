public class Rod {
    private Bead[] upperBeads;
    private Bead[] lowerBeads;

    public Rod() {
        upperBeads = new Bead[2];
        lowerBeads = new Bead[5];
        for (int i = 0; i < 2; i++) upperBeads[i] = new Bead();
        for (int i = 0; i < 5; i++) lowerBeads[i] = new Bead();
    }

    public int getValue() {
        int value = 0;
        for (Bead b : upperBeads) if (b.isActive()) value += 5;
        for (Bead b : lowerBeads) if (b.isActive()) value += 1;
        return value;
    }

   public void setValue(int value) {
        // Reset all
        for (Bead b : upperBeads) b.toggle();
        for (Bead b : lowerBeads) b.toggle();

        int upper = value / 5;
        int lower = value % 5;

        for (int i = 0; i < upper; i++) upperBeads[i].toggle();
        for (int i = 0; i < lower; i++) lowerBeads[i].toggle();
    }
  
}
