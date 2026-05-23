public class task1{
public static void main(String[] args) {
System.out.println("Days of week: ");
String arr[]={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
for(int i=0;i<7;i++){
System.out.print(arr[i]+" ");
};
for(int i=0;i<7;i++){
if(i==0){
System.out.println("\n\nMonday classes schedule is:\nEnglish,Maths,Programming lab");
}
else if(i==1){
System.out.println("\nTuesday classes schedule is:\nDiscreate Maths,Programming theory,oop");
}

else if(i==2){
System.out.println("\nWednesday classes schedule is:\nEnglish,Maths,oop");
}
else if(i==3){
System.out.println("\nThursday classes schedule is:\ncalculas,discreate Maths,Programming lab");
}
else{
System.out.println("\nFriday classes schedule is:\nEnglish,discreate Maths,Programming lab,oop");
}

}



}
}