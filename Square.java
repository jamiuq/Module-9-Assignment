import java.util.*;

public class Square extends Rectangle
{
  public Square(int length) {super(length, length);}

  @Override
  public void printInfo()
  {
    System.out.println("Shape: Square\nLength: " + super.getLength + "\nArea: " + super.getArea() + "\n");
  }
}
