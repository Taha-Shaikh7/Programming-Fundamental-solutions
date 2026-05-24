abstract class animal {

abstract String makesound();
}

class dog extends animal{
String makesound(){
return "woof";
}
}

class cat extends animal{
String makesound(){
return "meoow";
}
}

class cow extends animal{
String makesound(){
return "moo";
}
}
public class task2 {
public static void main(String[] args) {
dog d=new dog();
cat c=new cat();
cow co=new cow();

System.out.println("dog sound: "+d.makesound());
System.out.println("cat sound: "+c.makesound());
System.out.println("cow sound: "+co.makesound());



}
}
