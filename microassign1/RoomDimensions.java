package microassign1;

public class RoomDimensions {
    
    double length;
    double width;

    RoomDimensions(double l, double w) {
        length = l;
        width = w;
    }

    public double getArea() {
        return length * width;
    }

    @Override
    public String toString() {
        return String.format("Dimensions of rectangle: %.2f ft x %.2f ft%n", length, width);
    }
}