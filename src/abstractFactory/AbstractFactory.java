package abstractFactory;

import entity.IShape;

public abstract class AbstractFactory {
    public abstract IShape getShape(String type);
}
