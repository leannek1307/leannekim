package GreenReview;


public class Circle {

    private static final double PI = 3.14;
    private double radius;
    
    public Circle(){
        radius = 1;
    }    
    public Circle(double r) {
        radius = r;
    }

    public void setRadius (double r){
        radius = r;
    }
    
    public double getRadius (){
        return radius;
    }
    
    public double circumference (){
        return 2 * radius * PI;
    }
    
    public double area(){
        return radius * radius * PI; 
    }
    
    public static void displayAreaFormula (){
        System.out.println("The formula for the area of a circle is a = Pi * r * r.");
    }
    
    public String toString(){
        String circleString;
        
        circleString = "Circle has radius " + radius;
        return (circleString);
    }
    
    public boolean equals(Object c){
        Circle testObj = (Circle)c;
        
        if (testObj.getRadius() == radius){
            return (true);
        } else {
            return (false);
        }
    }
    
    public static void main(String[] args) {
        Circle spot1 = new Circle(5);
        Circle spot2 = new Circle(5);
        
        System.out.println("Circle radius: " + spot1.getRadius());
        System.out.println("Circle circumference: " + spot1.circumference());
        System.out.println("Circle area: " + spot1.area());
        Circle.displayAreaFormula();
        
        if (spot1.equals(spot2)){
            System.out.println("Objects are equal.");
        } else {
            System.out.println("Objects are not equal.");
        }
        
        System.out.println(spot1);
        System.out.println(spot2);
        
    }
    
}
