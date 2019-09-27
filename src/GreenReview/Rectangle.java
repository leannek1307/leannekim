package GreenReview;

public class Rectangle {
    private int width, length;
    
    public Rectangle (){
        width = 0;
        length = 0;
    }
    
    public Rectangle(int w, int l){
        width = w;
        length = l;
    }
    
    public int getWidth(){
        return width;
    }
    
    public int getLength(){
        return length;
    }
    
    public int getArea(){
        return width * length;
    }
    
    public int getPerimeter(){
        return (width + length) * 2;
    }
    
    public static void displayAreaFormula(){
        System.out.println("The formula for the area of a circle is a = l * w.");
    }
    
    public String toString(){
        String rect;
        
        rect = "Rectangle has width of " + width + " and a length of " + length;
        return (rect);
    }
    
    
    public boolean equals(Object r){
        Rectangle testObj = (Rectangle)r;
        
        if (testObj.getWidth() == width && testObj.getLength() == length){
            return (true);
        } else {
            return (false);
        }
    }
    
    
    
    public static void main(String[] args) {
        
        Rectangle rect = new Rectangle(5,6);
        Rectangle rect2 = new Rectangle(5,6);
        
        System.out.println("Area: " + rect.getArea());
        System.out.println("Perimeter: " + rect.getPerimeter());
        Rectangle.displayAreaFormula();

        if (rect.equals(rect2)){
            System.out.println("Objects are equal.");
        } else {
            System.out.println("Objects are not equal.");
        }
        
        System.out.println(rect);
        System.out.println(rect2);
        
        
    }
}
