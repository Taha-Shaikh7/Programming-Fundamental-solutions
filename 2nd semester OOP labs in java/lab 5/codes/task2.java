public class task2 {
double radius;
String color;
task2(double r,String c){
radius=r;
color=c;
}
double calculatearea(){
return 3.14*radius*radius;
}


double getradius(){
return radius;
}
String getcolor() {
    return color;
}


    public static void main(String[] args) {
task2 red_circle=new task2(2, "red");
task2 green_circle=new task2(3, "green");

System.out.println("Radius: "+red_circle.getradius());
System.out.println("Color: "+red_circle.getcolor());
System.out.println("Area: "+red_circle.calculatearea());
System.out.println("Radius: "+green_circle.getradius());
System.out.println("Color: "+green_circle.getcolor());
System.out.println("Area: "+green_circle.calculatearea());


}}