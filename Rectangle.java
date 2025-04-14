import java.util.*;

public class Rectangle
{
  private int length;
  private int width;

  public Rectangle(int length, int width) {this.length = length; this.width = width;}

  public void setLength(int length) {this.length = length;}
  public void setWidth(int width) {this.width = width;}

  public int getLength() {return length;}
  public int getWidth() {return width;}

  public int getArea() {return length * width;}

  public void printInfo()
  {
    System.out.println("Shape: Rectangle\nLength: " + length + "\nWidth: " + width + "\nArea: " + getArea() + "\n");
  }
}
