package test;

import abstractFactory.AbstractFactory;
import entity.IShape;
import factoryProduce.FactoryProduce;

public class Main {
    public static void main(String[] args) {
        //get shapeFactory
        AbstractFactory shapeFactory = FactoryProduce.getFactory(true);
        IShape shape = shapeFactory.getShape("RECTANGLE");

        shape.draw();
    }
}
