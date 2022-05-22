package abstractFactory;

import entity.IShape;
import entity.Rectangle;

public class ShapeFactory extends AbstractFactory{
    @Override
   public IShape getShape(String type) {
       if (type.equals("RECTANGLE")){
           return new Rectangle();
       }
       return null;
    }
}
