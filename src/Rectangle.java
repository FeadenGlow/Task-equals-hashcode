public class Rectangle {
    String color;
    int width;
    int length;

    public Rectangle(String color, int width, int length) {
        this.color = color;
        this.width = width;
        this.length = length;
    }

    public String getColor() {
        return color;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Rectangle r = (Rectangle) obj;
        return width == r.width
                && length == r.length
                && color == r.color;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + length;
        result = prime * result + width;
        result = prime * result + color.hashCode();
        return result;
    }
}
