package com.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream8 {
    public static void main(String args[]){
        List<String> list=Arrays.asList("apple","banana");
        Stream<String> myStream =list.stream();

        String[] array = {"apple","banana"};
        Stream<String> stream = Arrays.stream(array);

        Stream<String> intStream = Stream.of("hello","world");

        List<Integer> list1=Arrays.asList(1,3,4,6,33,67,34,2345,34);
        List<Integer> list2=list1.stream().filter(x -> x%2==0).collect(Collectors.toList());
        List<Integer> list3=list2.stream().map(x -> x/2).collect(Collectors.toList());
        System.out.print(list2);
        System.out.println(list3);

        List<Integer> list4=Stream.iterate(0, x-> x+1).limit(100).skip(1).sorted((a,b)-> (b-a)).filter(x -> x%5==0).peek(x -> System.out.println(x)).collect(Collectors.toList());
        // terminal operations are max(),min() and count().
        System.out.println(list4);
    }
}
