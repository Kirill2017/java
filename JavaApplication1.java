/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Кирилл
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Point c = new Point(0, 0);
        Circle circle = new Circle(c);
        System.out.println(circle.area());
        circle.scale(2);
        System.out.println(circle.area());
        Rectangle rec;
        rec = new Rectangle(c, 3, 4);
        Square square = new Square(c, 5, 5);
        compare_area(rec, circle);
        compare_area(square, circle);
    }
    
    public static void compare_area(Shape first, Shape second)
    {
        if (first.area() > second.area())
            System.out.println("First figure is bigger");
        else
            System.out.println("Second figure is bigger");
    }
    
}
