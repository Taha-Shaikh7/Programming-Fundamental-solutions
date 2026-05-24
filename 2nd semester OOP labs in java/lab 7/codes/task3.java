class bankaccount{
double getinterestrate(){
return 0.05;
}
}

class savingaccount extends bankaccount{
double getinterestrate(){
return 0.1;
}
}

public class task3 {
public static void main(String[] args) {

bankaccount b=new bankaccount();
savingaccount s=new savingaccount();

System.out.println("Bankaccount method: "+b.getinterestrate());
System.out.println("Saving method: "+s.getinterestrate());


}
}
