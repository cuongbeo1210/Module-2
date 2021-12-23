package triangle;

public class RightTriangle {
    public RightTriangle(int side1, int side2, int side3) throws IllegalRightTriangleException {
        if (side1 + side2 < side3 || side1 + side3 < side2 || side2 + side3 < side1)
            throw new IllegalRightTriangleException("Not a triangle");
        else {
            throw new IllegalRightTriangleException("Is a right triangle ");
        }
    }
}
