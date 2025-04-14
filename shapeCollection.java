import java.util.*;

public class shapeCollection
{
  private ArrayList<Rectangle> shapes;

  public shapeCollection()
  {
    shapes = new ArrayList<Rectangle>;
  }

  public shapeCollection(ArrayList<Rectangle> shapes) {this.shapes = shapes;}

  public void addShape(Rectangle Shape) {shapes.add(Shape);}

  public void removeShape(int index) {shapes.remove(index);}

  public void clearShapes() {shapes.clear();}

  public int getSumOfShapes()
  {
    int sum = 0;
    for (Rectangle shape : shapes)
    {
      sum += shape.getArea();
    }
    return sum;
  }
  
}
