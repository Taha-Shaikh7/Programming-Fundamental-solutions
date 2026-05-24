abstract class shape{


abstract double calculatearea();
abstract double calculateperimeter();
}

class circle extends shape{
double radius,perimeter;
circle(double r){
this.radius=r;
}

double calculatearea(){
return 3.14*radius*radius;
}

double calculateperimeter(){
return 2*3.14*radius;
}

}

class rectangle extends shape{
double lenght,width;
rectangle(double l,double w){
this.lenght=l;
this.width=w;
}

double calculatearea(){
return lenght*width;
}

double calculateperimeter(){
return 2*(lenght+width);
}
}

public class task1{
public static void main(String[] args) {

circle c1=new circle(6);
rectangle r1=new rectangle(12,10);

System.out.println("Circle radius: "+c1.calculatearea());
System.out.println("Circle perimeter: "+c1.calculateperimeter());

System.out.println("Rectangle radius: "+r1.calculatearea());
System.out.println("Rectangle perimeter: "+r1.calculateperimeter());

}
}