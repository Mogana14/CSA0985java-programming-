import java.io.*;
class rectangle;
double length;
double breadth;
rectangle(double l, double b){
length = l;
breadth = b;
}
double getArea(){
return length * breadth;
}
}
class RectConstructor{
public static void main(String[] args) {
rectangle r1 = new rectangle(4, 5);
rectangle r2 = new rectangle(5, 8);
double getArea1 = r1.getArea();
double getArea2 = r2.getArea();
System.out.println("The area of the first rectangle is: " + getArea1);
System.out.println("The area of the second rectangle is: " + getArea2);
}
}