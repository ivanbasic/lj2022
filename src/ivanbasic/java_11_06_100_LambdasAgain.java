package ivanbasic;

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.*;
import java.util.stream.Collectors;

public class java_11_06_100_LambdasAgain implements Lesson  {
    public void main() {

        // Predicate boolean test(T t)
        Predicate<Integer> predicateEven = s -> (s % 2) == 0;

        // Consumer: void accept(T t)
        Consumer<Integer> consumerPrint = s -> System.out.print(s+" ");

        // Supplier T get() ???
        Supplier<Integer> supplierOf2 = () -> 2;

        // Comparator int compare(T o1, T o2)
        Comparator<Integer> comparatorBigger = (int1,int2) -> int1-int2;

        // Binary  operator
        BinaryOperator<Integer> binaryAdd = (int1, int2) -> int1+int2;

        // Function
        Function<Integer,String> functionInt2Str = (ii) -> "<"+ii+">";


        List<Integer> integers = List.of(  10, 7, 15, 3, 30, 4, 40, 15,100 );
        System.out.println( "integers="+integers );


        System.out.println("\nUSING IN STREAMS:" );

        var evenInts = integers.stream().filter(predicateEven).collect(Collectors.toList());
        System.out.println("Predicate, filter(). evenInts="+evenInts );

        System.out.print("Consumer, forEach(). printAll=" );
        integers.stream().forEach( consumerPrint);

        var  sortedInts = integers.stream().sorted( comparatorBigger ).collect(Collectors.toList());
        System.out.println("\nComparator, sorted(). sortedInts="+sortedInts );

        var sumInt = integers.stream().reduce(binaryAdd);
        System.out.println("BinaryOperator , reduce(). sum="+sumInt.orElse(null) );

        var toStr = integers.stream().map( functionInt2Str).collect(Collectors.toList());
        System.out.println("Function, map(). IntToStr="+toStr );


    }
}
