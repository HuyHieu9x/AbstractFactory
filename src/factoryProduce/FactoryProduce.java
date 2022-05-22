package factoryProduce;

import abstractFactory.AbstractFactory;
import abstractFactory.RoundedShapeFactory;
import abstractFactory.ShapeFactory;

public class FactoryProduce {
    public static AbstractFactory getFactory(boolean rounded){
        if (rounded){
            return new RoundedShapeFactory();
        }else{
            return new ShapeFactory();
        }
    }
}
