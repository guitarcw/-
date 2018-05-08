package 工厂模式;

public class ShapeFactory {
    public Shape getShape(String shapeType){
        if(shapeType==null) return null;
        if(shapeType.equalsIgnoreCase("Circle"))
            return new Circle();
        else if (shapeType.equalsIgnoreCase("Square"))
            return new Square();
        return null;
    }
}
