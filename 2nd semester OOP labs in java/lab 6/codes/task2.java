class bankaccount{
private final int accountnumber;
private double balance;

bankaccount(){
this.accountnumber=-1;
this.balance=0;
}

bankaccount(int ac,double b){
this.accountnumber=ac;
this.balance=b;
}

void setbalance(double newbalance){
this.balance=newbalance;
}

double getbalance(){
return balance;
}
void display(){
System.out.println("Account number is: "+accountnumber+"\nBalance is: "+balance);
}
}
public class task2 {
public static void main(String[] args) {
bankaccount u1=new bankaccount(123456, 40000);
u1.setbalance(30000);
u1.getbalance();
u1.display();
bankaccount u2=new bankaccount();
u2.getbalance();
u2.display();
}
}
