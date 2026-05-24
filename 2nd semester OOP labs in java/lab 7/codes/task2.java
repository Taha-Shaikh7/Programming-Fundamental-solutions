class employee{

double calculatesalary(){
return 20000;
}
}


class manager extends employee{

double calculatesalary(){
return 20000+1000;
}
}

class worker extends employee{
double calculatesalary(){
return 50000+1000;
}
}

public class task2 {
public static void main(String[] args) {

employee e=new employee();
manager m=new manager();
worker w=new worker();

System.out.println("Employee salary: "+e.calculatesalary());
System.out.println("Manager salary: "+m.calculatesalary());
System.out.println("Worker salary: "+w.calculatesalary());



}
}
