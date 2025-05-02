public class Bead {
    private boolean active;

    public Bead() {
        this.active = false;
    }

    public void toggle() {
        active = !active;
    }

    public boolean isActive() {
        return active;
    }
}
