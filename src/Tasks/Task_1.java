package Tasks;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = in.nextInt();

        int[] arr = new int[size];
        Random random = new Random();

        for(int i = 0; i < size; i++){
            arr[i] = random.nextInt();
        }

        System.out.print("Массив arr: ");
        System.out.println(Arrays.toString(arr));

        int[] arrResult = filterEvenNumber(arr);

        System.out.print("Массив arrResult: ");
        System.out.println(Arrays.toString(arrResult));
    }

    private static int[] filterEvenNumber(int[] arr){
        return Arrays.stream(arr).filter(x -> x % 2 == 0). toArray();
    }
}
