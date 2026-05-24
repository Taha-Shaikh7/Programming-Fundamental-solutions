abstract class bankaccount{
protected double balance;
bankaccount(double balance){
this.balance=balance;
}

abstract double deposit(double amount);
abstract double withdraw(double amount);
}

class savingaccount extends bankaccount{


savingaccount(double balance){
super(balance);
}

double deposit(double amount){
balance+=amount;
return balance;
}

double withdraw(double amount){
if(balance<amount){
System.out.println("sorry balance is insufficent");
}
else{
balance-=amount;
}
return balance;
}

double calculateinterest(int rate){
balance+=balance*rate/100;
return balance;
}


}

class checkingaccount extends bankaccount{

checkingaccount(double balance){
super(balance);
}

double deposit(double amount){
balance+=amount;
return balance;
}

double withdraw(double amount){
if(balance<amount){
System.out.println("sorry balance is insufficent");
}
else{
balance-=amount;;
}
return balance;
}
void overdraft(){
if(balance<0){
System.out.println("your account is overdraft");
}
else{
System.out.println("your account is not overdraft");
}

}
}

public class task3 {
    public static void main(String[] args) {

savingaccount sa=new savingaccount(1000);
checkingaccount ca=new checkingaccount(500);

System.out.println("balance is: "+sa.deposit(1000));
System.out.println("withdraw is: "+sa.withdraw(200));
System.out.println("Interest on balance is: "+sa.calculateinterest(5));

System.out.println("balance is: "+ca.deposit(2000));
System.out.println("withdraw is: "+ca.withdraw(300));
ca.overdraft();    
}
}
