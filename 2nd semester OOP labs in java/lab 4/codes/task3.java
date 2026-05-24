public class task3 {
public static void main(String[] args) {
int arr[][]={
         {14,9,20,7},
         {11,16,25,18},
         {22,13,30,19}
         };  
System.out.println("Use a for loop to calculate and display the sum of the updated even numbers from the matrix: ");
for(int i=0;i<3;i++){
for(int j=0;j<4;j++){
if(arr[i][j]%2==0){
arr[i][j]=arr[i][j]/2;
}
System.out.print(arr[i][j]+" ");}
System.out.print("\n");
}
System.out.println("Now use a for-each loop to iterate over the matrix and display only the odd numbers from the updated matrix: ");
for(int[] row : arr){
for(int num : row){
if(num%2!=0){
System.out.print(num+" ");
}

}
System.out.println();
}
System.out.println("Use a for loop to calculate and display the sum of the updated even numbers from the matrix: ");
int sum=0;
for(int k=0;k<3;k++){
for(int l=0;l<4;l++){
if(arr[k][l]%2==0){
sum+=arr[k][l];

}

}

}
System.out.print(sum);





}
    
}
