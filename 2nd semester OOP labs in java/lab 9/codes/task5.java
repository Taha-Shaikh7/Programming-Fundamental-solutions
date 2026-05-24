abstract class shape {

abstract void draw();
abstract void resize(double size);
}

class circle extends shape{
double radius;
circle(double radius){
this.radius=radius;
}

void draw(){
System.out.println("This is cirle");
}

void resize(double size){
radius*=size;
System.out.println("Resizied circle: "+radius);
}
}

class rectangle extends shape{
double length,width;

rectangle(double length,double width){
this.length=length;
this.width=width;
}

void draw(){
System.out.println("This is rectangle");
}

void resize(double size){
length*=size;
width*=size;
double total=length*width;
System.out.println("Resizied rectangle: "+total);
}
}



public class task5 {
public static void main(String[] args) {

circle c=new circle(4);
rectangle r=new rectangle(5,6);

c.draw();
c.resize(8);

r.draw();
r.resize(8);

}
}
