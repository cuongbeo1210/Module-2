package factory_menthod;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.Draw();
        Shape shape2 = shapeFactory.getShape("SQUARE");
        shape2.Draw();
        Shape shape3 = shapeFactory.getShape("RECTANGLE");
        shape3.Draw();
    }
}
