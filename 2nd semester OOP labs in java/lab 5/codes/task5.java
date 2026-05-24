public class task5 {
int id;String name;double grade[];
task5(int id,String name,double grade[]){
this.name=name;
this.grade=grade;
this.id=id;

}
void display_average_grade(){
double sum=0;
for(int i=0;i<5;i++){
sum+=grade[i];
}
System.out.println(name+" Average Grade is: "+sum);
}
double[] calc_percentage(){
double percent[]=new double[5];
for(int j=0;j<5;j++){
percent[j]=(grade[j]/200)*100;
}
return percent;
}
String concat_id_name(){
return name+" "+id;
}

public static void main(String[] args){
double g1[]={123,102,300,400,200};
double g2[]={100,500,234,321,231};
task5 s1=new task5(5132, "Student 1", g1);
task5 s2=new task5(1234, "Student 2", g2);

s1.display_average_grade(); 
s2.display_average_grade();

double perc2[]=s1.calc_percentage();
System.out.println( "\nStudent 1 Percentage: ");
for(int i=0;i<5;i++){
System.out.print(perc2[i]+" ");
}

double perc3[]=s2.calc_percentage();
System.out.println( "\n\nStudent 2 Percentage: ");
for(int i=0;i<5;i++){
System.out.print(perc3[i]+" ");
}

System.out.println("\n\n"+"Name Id: "+s1.concat_id_name());
System.out.println("\n"+"Name Id: "+s2.concat_id_name());










}
}
