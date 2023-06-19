package Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> integers = new ArrayList<>();
        Random random = new Random();
        System.out.print("\nСписок до:");
        for(int i = 0; i < 10; i++){
            integers.add(random.nextInt(1000));
            System.out.print(integers.get(i) + " ");
        }

        System.out.println("\nВведите число для сравнения: ");
        int num = in.nextInt();

        List<Integer> integersAfter = numberLimitList(integers, num);
        System.out.println("\nЭти числа больше заданного: ");

        for(Integer i : integersAfter){
            System.out.print(i + " ");
        }
    }
    private static List<Integer> numberLimitList(List<Integer> list, int num){
        return list.stream().filter(x -> x > num).collect(Collectors.toList());
    }
}
//8.	Напишите функцию, которая принимает на вход список целых чисел и возвращает новый список,
//        содержащий только те числа, которые больше заданного значения.