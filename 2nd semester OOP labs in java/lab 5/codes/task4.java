public class task4 {
String name;
int salary;
String address;
task4(String n,int s,String a){
name=n;
salary=s;
address=a;
}
void display(){

System.out.println(name+"         "+salary+"                    "+address+"\n");
}
    public static void main(String[] args) {
task4 emp1=new task4("Robert", 1994, "WallsStreat");
task4 emp2=new task4("Sam", 2000, "WallsStreat");
task4 emp3=new task4("John", 1999, "WallsStreat");
System.out.println("Name        Year_of_Joining        Address");
emp1.display();
emp2.display();
emp3.display();
    }
}
