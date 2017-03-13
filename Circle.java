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
public class Circle extends Shape {
    public static final double pi = Math.PI;
    private double rad = 1;
    private Point centr;
    
    Circle(Point centre)
    {
        this.centr = centr;
    }
    
    @Override
    public double area()
    {
        return pi*rad*rad;
    }
    
    public void scale(double mltp)
    {
        rad = rad*mltp;
    }
    
}
