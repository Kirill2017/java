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
public class Rectangle extends Shape {
     Point downleft;
     double height;
     double length;
    
    Rectangle(Point downleft, double height, double length)
    {
        if(length < 0 || height < 0)
        {
            System.out.print("ERROR: Rectangle invalid values");
        }
        this.downleft = downleft;
        this.height = height;
        this.length = length;
               
    }
    
    @Override
    public double area()
    {
        return length*height;
    }
}
