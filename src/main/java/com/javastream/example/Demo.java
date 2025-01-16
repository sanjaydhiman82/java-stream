package com.javastream.example;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        List<Student> stuList = Data.getStudents();

/*        display("Sort by Age", stuList.stream().sorted(Comparator.comparing(Student::getAge)).toList());
        display("Sort by reversed Age", stuList.stream().sorted(Comparator.comparing(Student::getAge).reversed()).toList());
        display("To list", stuList.stream().toList());
        System.out.println("Count:" + stuList.stream().count());
        display("Distinct", stuList.stream().distinct().toList());
        System.out.println("FInd any:" + stuList.stream().findAny().get());
        System.out.println("FInd any:" + stuList.stream().findFirst().get());
        display("Limit:", stuList.stream().limit(5).toList());
        System.out.println("count:" + stuList.stream().count());
        display("skip:", stuList.stream().skip(10).toList());
        System.out.println("All Match:" + stuList.stream().allMatch(student -> {
            return student.getAge() == 8;
        }));
        System.out.println("ANY Match:" + stuList.stream().anyMatch(student -> {
            return student.getAge() == 80;
        }));
        display("Filter:", stuList.stream().filter(e -> e.getAge() > 18).toList());
        stuList.stream().map(e -> e.getName().toUpperCase()).toList().forEach(System.out::println);
        stuList.stream().map(e -> e.getAge() + 100).toList().forEach(System.out::println);
*/
//         Map<String, Student> map = stuList.stream().collect(Collectors.toMap(Student::toString, Function.identity()));
//        map.keySet();
//        stuList.stream().peek();
//        stuList.stream().dropWhile();
//        stuList.stream().max();
//        stuList.stream().min();
//        stuList.stream().noneMatch();
//        stuList.stream().dropWhile();
//        stuList.stream().flatMapToDouble();
//        stuList.stream().flatMapToLong();
//        stuList.stream().forEachOrdered();
//        stuList.stream().flatMapToInt();
//        stuList.stream().mapMulti();

        String txt="this is A new String to Test";
         txt.chars()
                 .mapToObj(e -> Character.toLowerCase((char)e))
                 .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                         .entrySet().forEach(e->System.out.println(e.getKey()+"-"+e.getValue()));

//        stuList.stream().map(e->e.getName())
//                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
//                .entrySet().stream().max(Comparator.naturalOrder()).get();

ð
    }

    private static void display(String msg, List<Student> list) {
        System.out.println("-----------------" + msg + "-----------------------------");
        list.forEach((e) -> System.out.println(e.toString()));
        System.out.println("----------------------------------------------");
    }
}
