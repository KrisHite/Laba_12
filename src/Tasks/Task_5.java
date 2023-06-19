package Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String string = "Напишите функцию, которая принимает на вход список строк и возвращает новый список, " +
                "содержащий только те строки, которые содержат заданную подстроку.";
        System.out.println("Введите подстроку:\n");
        String underString = in.nextLine();

        List<String> strings = List.of(string.split(" "));
        System.out.println("\nСторка после сплитирования:\n");

        for(String e : strings){
            System.out.println(e);
        }

        List<String> stringsAfter = findUnderString(strings, underString);

        System.out.println("\nРезультат выполнения программы:\n");
        for(String e : stringsAfter){
            System.out.println(e);
        }
    }
    private static List<String> findUnderString(List<String> list, String underString){
        return list.stream().filter(underString::contains).collect(Collectors.toList());
    }
}
//5.	Напишите функцию, которая принимает на вход список строк и возвращает новый список,
//        содержащий только те строки, которые содержат заданную подстроку.