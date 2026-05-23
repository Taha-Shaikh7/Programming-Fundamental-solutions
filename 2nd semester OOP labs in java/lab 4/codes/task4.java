public class task4 {
public static void main(String[] args){
    int i=0;
int[] arr = {1, 4, 9, 16, 25, 36, 49, 64, 81, 0};
do {
System.out.print(arr[i]+" ");
i++;
} while (i<10);

int j=0;
int sum=0;
while (j<10) {

if(arr[j]%2==0){
j++;
continue;
}
sum+=arr[j];

if(arr[j]==81){
break;
}
j++;
}
System.out.println("\nSum of odd numbers is: "+sum);




}
}
