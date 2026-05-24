class animal{
String name;
int age;
animal(String n,int a){
name=n;
age=a;
}
}
class dog extends animal{
dog(String n,int a){
super(n,a);
name=n;
age=a;
}
}
class cat extends animal{
cat (String n,int a){
super(n, a);
name=n;
age=a;
}
}

public class task4 {
public static void main(String[] args) {

animal a=new animal("Animal", 13);
dog d=new dog("Dog", 12);
cat c=new cat("Cat", 16);

System.out.println("Parent class:   "+a.name+"     "+a.age);
System.out.println("1st child class:    "+d.name+"     "+d.age);
System.out.println("2nd child class:    "+c.name+"     "+c.age);


}
}
