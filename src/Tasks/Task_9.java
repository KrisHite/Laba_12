package Tasks;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task_9 {
    public static void main(String[] args) {
        String string = "Напишите функцию, которая принимает на вход список строк и возвращает новый список," +
                "содержащий только те строки, которые содержат только буквы (без цифр и символов). Например32 123322б, тут1 буквы2.";

        List<String> strings = List.of(string.split(" "));
        System.out.println("\nСторка после сплитирования:\n");

        for(String e : strings){
            System.out.println(e);
        }

        List<String> stringsAfter = noNumbersFilter(strings);

        System.out.println("\nРезультат выполнения программы:\n");
        for(String e : stringsAfter){
            System.out.println(e);
        }
    }
    private static List<String> noNumbersFilter(List<String> list){
        return list.stream().filter(x -> Arrays.stream(x.split(""))
                        .allMatch(y -> y.charAt(0) >= 'A'&&y.charAt(0)<='Я'||y.charAt(0) >= 'а'&&y.charAt(0)<='я'))
                .collect(Collectors.toList());
    }
}
//9.	Напишите функцию, которая принимает на вход список строк и возвращает новый список,
//        содержащий только те строки, которые содержат только буквы (без цифр и символов).