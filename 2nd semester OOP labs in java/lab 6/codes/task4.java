class stringutils{
String name1,name2,name3;

String add(String name1,String name2){
return name1+name2;
}

String add(String name1,String name2,String name3){
return name1+name2+name3;
}

String add(String name[]){
String result=" ";  
for(int i=0;i<5;i++){
result=result+name[i];
}
return result;
}
}

public class task4 {
public static void main(String[] args) {
stringutils c1=new stringutils();
System.out.println("Concatenated two string: "+c1.add("Taha","ali"));
System.out.println("Concatenated three string: "+c1.add("taha","ali","ahmed"));

String name[]={"taha"," ","ali"," ","ahmed"," "};
System.out.println("Concatenated array of string: "+c1.add(name));


}
}
