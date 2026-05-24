public class task3 {
double balance;
String name;
task3(String name,double balance){
this.balance=balance;
this.name=name;
}
void deposit(double amount){
balance+=amount;
System.out.println(name+" Deposited: "+amount);
}
void withdraw(int withdraw){
balance-=withdraw;
System.out.println(name+" Withdrawed: "+withdraw);
}
void checkbalance(){
System.out.println(name+" Current Balance: "+balance);
}
    public static void main(String[] args) {
        task3 acc1=new task3("Account 1",1000);
        task3 acc2=new task3("Account 2",500);
acc1.deposit(500);
acc2.deposit(1500);

acc1.checkbalance();
acc2.checkbalance();

acc1.withdraw(500);
acc1.checkbalance();

acc2.withdraw(3000);
acc2.checkbalance();
}
}
