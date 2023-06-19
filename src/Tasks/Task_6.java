package Tasks;

import java.util.*;
import java.util.stream.Collectors;

public class Task_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер списка: ");
        int size = in.nextInt();
        List<Integer> numbers = new ArrayList<>(size);
        Random random = new Random();

        for(int i = 0; i < size; i++){
            numbers.add(random.nextInt(100));
        }

        System.out.print("Содержание списка: ");
        for (Integer i : numbers){
            System.out.print(i + " ");
        }
        System.out.println("\n");
        System.out.print("Введите число: ");
        int num = in.nextInt();
        System.out.println("\n");

        List<Integer> result = filterOfNumber(numbers, num);

        System.out.print("Результат: ");
        for (Integer e : result){
            System.out.print(e + " ");
        }
    }

    private static List<Integer> filterOfNumber(List<Integer> arr, int num){
        return arr.stream().filter(x -> x % num == 0).collect(Collectors.toList());
    }
}
//6.	Напишите функцию, которая принимает на вход список целых чисел и возвращает новый список,
//        содержащий только те числа, которые делятся на заданное число без остатка.