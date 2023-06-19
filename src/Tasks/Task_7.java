package Tasks;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string = "Напишите функцию, которая принимает на вход список строк и возвращает новый список," +
                "содержащий только те строки, которые имеют длину больше заданного значения.";
        List<String> strings = List.of(string.split(" "));
        System.out.println("\nСторка после сплитирования:\n");
        for(String e : strings){
            System.out.println(e);
        }
        System.out.println("Введите максимальную длинну строки: ");
        int num =  in.nextInt();

        List<String> stringsAfter = filterStringsLengthLimit(strings, num);

        System.out.println("\nРезультат выполнения программы:\n");
        for(String e : stringsAfter){
            System.out.println(e);
        }
    }
    private static List<String> filterStringsLengthLimit(List<String> list, int num){
        return list.stream()
                .filter(s -> s.length() > num)
                .collect(Collectors.toList());
    }
}
//7.	Напишите функцию, которая принимает на вход список строк и возвращает новый список,
//        содержащий только те строки, которые имеют длину больше заданного значения.