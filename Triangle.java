/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aryan Kakkar
 */
public class Triangle {
private double base ;
private double height; 
private double area; 
private String color;

public void SetBase(double b){
    base = b;
}
public void setHeight(double h){
        height = h;
}
public void setColor(String col){
    color = col ;
}
public double getBase() { 
return base;
}
public double getHeight() {
return height;
}
public String getColor() { 
return color;
}
public double getArea(){
 return area;
}
public void compute_area(){ 
area = base * height / 2.0;
}
public static void main(String[] args) {

Triangle t1= new Triangle();
Triangle t2= new Triangle();

t1.SetBase(20.0); 
t1.setHeight(30.0);
t1.setColor("Red");

t2.SetBase(20.0);
t2.setHeight(30.0);
t2.setColor("Blue");

if(t1.getArea() == t2.getArea() && t1.getColor() == t2.getColor ())
{ System.out.println("Matching Triangles");
}
else{
System.out.println("Non Matching Triangles");
}
}
    }

