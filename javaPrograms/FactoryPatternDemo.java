public class FactoryPatternDemo {
    public static void main(String[] args) {
        Shapefactory shapefactory = new Shapefactory();
        Shape shape1 = shapefactory.getShape("CIRCLE");
        shape1.draw();
        Shape shape2 = shapefactory.getShape("RECTANGLE");
        shape2.draw();
        Shape shape3 = shapefactory.getShape("SQUARE");
        shape3.draw();
    }
}
