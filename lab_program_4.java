/*4. Develop a Java program to create an abstract class named Shape
that contains two integers and an empty method named printArea( ). Provide
three classes named Rectangle, Triangle and Circle such that each one of the
classes extends the class Shape. Each one of the classes contain only the
method printArea( ) that prints the area of the given shape.
*/
abstract class Shape 
{
    double length;
    double breadth;
    double radius;
    
    Shape(double l, double b)
    {
        length = l;
        breadth =b;
    }
    Shape(double rad)
    {
       radius = rad;
    }
    
    abstract double area();
}

class Rectangle extends Shape
{
    Rectangle (double l,double b)
    {
        super(l,b);
    }
    double area()
    {
       
        return length*breadth;
    }
}
class triangle extends Shape
{
    triangle (double l,double b)
    {
        super(l,b);
    }
    double area()
    {
        return (length*breadth)/2;
    }
}
class circle extends Shape
{
    circle (double rad)
    {
        super(rad);
    }
    double area()
    {
       
        return 3.14*radius*radius;
    }
}

class areas{
    public static void main(String args[]){
        Rectangle r = new Rectangle(2,2);
        triangle t = new triangle(3,3);
        circle c = new circle(2);
        
        System.out.println("area of rectangle :"+r.area());
        
        System.out.println("area of triangle :"+t.area());
        
        System.out.println("area of circle : "+c.area());
    }
}