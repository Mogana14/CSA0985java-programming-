import java.io.*;
import java.util.Scanner;
class area{
int length=1,breadth=1;
void setDim(int length, int breadth){
}
double getArea(){
return length * breadth;
}
public static void main(String[] args){
area a = new area();
a.setDim(10, 5);
System.out.println("The area of the rectangle is " + a.getArea());
}
}