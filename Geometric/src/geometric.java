public class geometric {
    private String color = "Trắng";
    private boolean filled;

    public geometric(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public geometric(){}

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "geometric{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
