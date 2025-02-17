import java.util.ArrayList;
import java.awt.Rectangle;

public class BigRectLister {
    public static void main(String[] args){
        // here be a list of Rectangle
        ArrayList<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle(1, 1));
        rectangles.add(new Rectangle(2, 3));
        rectangles.add(new Rectangle(2, 4));
        rectangles.add(new Rectangle(3, 4));
        rectangles.add(new Rectangle(4, 5));
        rectangles.add(new Rectangle(5, 3));
        rectangles.add(new Rectangle(4, 5));
        rectangles.add(new Rectangle(6, 7));
        rectangles.add(new Rectangle(8, 9));
        rectangles.add(new Rectangle(10, 11));

        // Create a filter object
        BigRectangleFilter filter = new BigRectangleFilter();

        //print
        System.out.println("Big rectangles area greater than > 10:");
        for (Rectangle r : rectangles) {
            if (filter.accept(r)) {
                System.out.println("Rectangle: Width = " + r.width + ", Height = " + r.height);
            }
        }


    }
}