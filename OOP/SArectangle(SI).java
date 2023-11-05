public class Shape {
  private int width;
  private int height;

  public void setWidth(int width) {
    this.width = width;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  protected int getWidth() {
    return width;
  }

  protected int getHeight() {
    return height;
  }
}

public class Rectangle extends Shape {

  public int getArea() {
    return width * height;
  }
}

public class Main {
  public static void main(String[] args) {
    Rectangle rect = new Rectangle();
    int w, h;

    System.out.print("Enter the value of width and height: ");
    Scanner scanner = new Scanner(System.in);
    w = scanner.nextInt();
    h = scanner.nextInt();

    rect.setWidth(w);
    rect.setHeight(h);

    // Print the area of the object.
    System.out.println("Total area: " + rect.getArea());
  }
}
