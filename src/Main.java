import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 17, 9, 2, 13, 6, 11, 1, 16, 5, 20, 10, 12, 3, 15, 18, 7, 19, 14, 8};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        sort(arr, num);
        System.out.println("change number 2");
    }
    public static void sort(int [] arr, int num){
        for(int i = 0; i < arr.length -1; i++){
            int minIndex = i;
            for(int j = i; j < arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        boolean result = false;
        for(int i = 0; i < arr.length; i++){
            if(num == arr[i]){
                result = true;
                break;
            }

        }
        if(result){
            System.out.println(num);
        }else {
            System.out.println("Number not found");
        }
    }
}