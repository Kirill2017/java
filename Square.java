/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;


public class Square extends Rectangle {
    
    public Square(Point downleft, double height, double length) {
       super(downleft, height, length);
       if (length != height)
            System.out.println("ERROR: This is not a square!");
        
    }
    public double area()
    {
        return height*height;
    }
}
