package microassign1;

public class RoomCarpet {

    double size;
    double costPerSqFt;

    RoomCarpet(RoomDimensions dim, double cost) {
        size = dim.getArea();
        costPerSqFt = cost;
    }

    private double getTotalCost() {
        return size * costPerSqFt;
    }

    public String toString() {
        return String.format("Cost Per sq ft: $%.2f. Size of carpet: %.2f sq ft. %nTotal Cost: $%.2f %n", costPerSqFt, size, getTotalCost());
    }

}