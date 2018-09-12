public class rectangle {
public int length;
public int width;

public rectangle(int length, int width) {
this.length = length;
this.width = width;
}

public int getarea() {
return length * width;
}

 

  public int getPerimeter() {

    return 2 * (length + width);

  }

}

