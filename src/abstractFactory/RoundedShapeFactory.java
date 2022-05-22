package abstractFactory;

import entity.IShape;
import entity.RoundedRectangle;
import entity.RoundedSquare;

public class RoundedShapeFactory extends AbstractFactory{
    @Override
    public IShape getShape(String type) {
        if (type.equals("RECTANGLE")){
            return new RoundedRectangle();
        } else if (type.equals("SQUARE")) {
            return new RoundedSquare();
        }
        return null;
    }
}
