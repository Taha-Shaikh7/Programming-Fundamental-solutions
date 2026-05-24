class circle{
private int radius;
public void setradius(int r){
if(r>0){
radius=r;
}
else{
System.out.println("Radius is not valid");
}
}
public void getradius(){
System.out.println("Radius is: "+radius);
}
}


public class task1 {
public static void main(String[] args) {
circle c1=new circle();
c1.setradius(2);
c1.getradius();
circle c2=new circle();
c2.setradius(-2);
c2.getradius();



}
    
}
