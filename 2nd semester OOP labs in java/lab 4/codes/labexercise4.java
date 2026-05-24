public class labexercise4 {
public static void main(String[] args){

        int arr[] = new int[10];

        int i = 0;
        int num = 1;

        do {
            if (i < 9) {
                arr[i] = num * num;    
                num++;
            } else {
                arr[i] = 0;   
                        }
            i++;
        } while (i < 10);
        int sum = 0;
        int j = 0;

        while (j < arr.length) {

    
            if (arr[j] == 81) {
                break;
            }

            if (arr[j] % 2 == 0) {
                j++;
                continue;
            }

            sum = sum + arr[j];
            j++;
        }

        System.out.println("Sum of odd numbers= " + sum);
    }
}
