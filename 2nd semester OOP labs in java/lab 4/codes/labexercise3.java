public class labexercise3 {
public static void main(String[] args) {
System.out.println("Original Matrix: ");
int arr[][]={
              {12, 13, 15, 16},
              {11, 110, 121, 17},
              {17, 18, 100, 21}
};
for(int i=0;i<3;i++){
for(int j=0;j<4;j++){
System.out.print(arr[i][j]+"\t");
}
System.out.println("\n");
};
System.out.println("Divide each even number from the matrix by 2 and store the updated value in the matrix: ");
int arr1[][]={
              {12, 13, 15, 16},
              {11, 110, 121, 17},
              {17, 18, 100, 21}
};
for(int k=0;k<3;k++){
for(int l=0;l<4;l++){

System.out.print((arr1[k][l]/2)+"\t");
}
System.out.println("\n");
}
System.out.println("Now use for-each loop to iterate over the matrix and display the Odd Numbers from the matrix: "  );

int arr2[][]={
              {12, 13, 15, 16},
              {11, 110, 121, 17},
              {17, 18, 100, 21}
};
for(int m=0;m<3;m++){
for(int n=0;n<4;n++){
System.out.print((arr2[m][n]/2!=0)+" ");
}
};

























}
}
