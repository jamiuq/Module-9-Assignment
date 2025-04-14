import java.util.*;

public class Main
{
  public static void main(String[] args)
  {
    Rectangle shape1 = new Rectangle(6, 7); // creates object of rectangle class
    Square shape2 = new Square(8); // creates object of square class, which inherits from rectangle class
    Rectangle shape3 = new Rectangle(1, 4);

    shape1.printInfo();
    shape2.printInfo(); // square class's printInfo overrides the rectangle class's

    shapeCollection group = new shapeCollection(); // creates shapeCollection class, which composes of objects of the Rectangle class
    group.addShape(shape1); group.addShape(shape2); group.addShape(shape3);

    System.out.println(group.getSumOfShapeAreas());
  }
}
