public class task1 {
float radius;
String color;
void calculatearea(){
double area=3.14*radius*radius;
System.out.println("Color of circle: "+color+"\nRadius is: "+radius+"\nArea of circle: "+area);
}
    public static void main(String[] args) {
        task1 red_cicle=new task1();
 task1 green_cicle=new task1();
red_cicle.radius=3;
red_cicle.color="Red";
green_cicle.radius=2;
green_cicle.color="Green";
red_cicle.calculatearea();
green_cicle.calculatearea();

    }
}
