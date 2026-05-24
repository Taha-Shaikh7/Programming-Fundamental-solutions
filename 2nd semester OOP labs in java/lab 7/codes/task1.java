//part a
class message{
String text;
void settext(String t){
this.text=t;
}
public String toString(){
return text;
}
}

//part b
class sms extends message{
int recipientcontactno;

void setrecipientcontactno(int r){
this.recipientcontactno=r;
}

int getrecipientcontactno(){
return recipientcontactno;
}
public String toString(){
return "Contact no: "+recipientcontactno+"\nMessage: "+text;
}
}
//part c
class email extends message{
String sender,receiver,subject;

void setsender(String s){
sender=s;
}

void setreceiver(String r){
receiver=r;
}

void setsubject(String sub){
subject=sub;
}
public String toString(){
return "Subject: "+subject+"\nReceiver: "+receiver+"\nSender: "+sender+"\nText: "+text;
}

//part d

}

public class task1 {
public static void main(String[] args) {
//part a

message m=new message();
m.settext("hi iam taha");
    System.out.println(m.toString());
//part b
sms s=new sms();

s.setrecipientcontactno(122123);
s.settext("hello world");
System.out.println(s.toString());
//part c

email e=new email();
e.setsubject("Meeting");
e.setsender("ahmed");
e.setreceiver("adam");
e.settext("How are you");
System.out.println(e.toString());






} 
}
