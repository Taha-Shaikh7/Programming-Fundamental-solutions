public class task6 {
int r;
int c;
int matx[][];
task6(int r,int c){
this.r=r;
this.c=c;
matx=new int[r][c];
}
void get_matrix(){
for(int i=0;i<r;i++){
for(int j=0;j<c;j++){
System.out.print(matx[i][j]+" ");
}
System.out.println();
}
}
void set_element(int r,int c,int v){
matx[r][c]=v;

}

    public static void main(String[] args) {
task6 matrix1=new task6(4, 3);
task6 matrix2=new task6(3, 3);

matrix1.set_element(1, 1, 4);
matrix1.set_element(0, 0, 5);
matrix1.set_element(2, 2, 3);
matrix1.set_element(3, 2, 1);


matrix2.set_element(0, 0, 1);
matrix2.set_element(1, 2, 2);
matrix2.set_element(2, 2, 6);

System.out.println("Matrix 1: ");
matrix1.get_matrix();
System.out.println("Matrix 2: ");
matrix2.get_matrix();













}
}
