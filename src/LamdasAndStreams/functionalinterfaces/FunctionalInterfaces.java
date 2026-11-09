package LamdasAndStreams.functionalinterfaces;

import java.util.List;
import java.util.Map;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionalInterfaces {
    public static void main(String[] args) {

// 1. Predicate Interface
        Predicate<String> startsWithJ = (str) -> str.startsWith("J");

        List<String> filtered = Stream.of("Java", "Python", "Javascript")
                .filter(startsWithJ)
                .collect(Collectors.toList());

        System.out.println("Filtered Collection =}=}->> " + filtered);

//2.     Function Interface
        Function<String, Integer> gimmeLengths = (string) -> string.length();

        List<Integer> lengths = Stream.of("Java", "Praise", "Python")
                .map(gimmeLengths)
                .collect(Collectors.toList());

        System.out.println("Lengths of strings =>> "+lengths);


// 3.     Bi Function functional interface
        BiFunction<String, String, Boolean> haveSameLength = (firstString, secondString) -> firstString.length() == secondString.length();

        System.out.println("Java and Python >> "+haveSameLength.apply(
"Java", "Python"));
        System.out.println("Java and Java >> "+haveSameLength.apply("Java", "JaVa"));


// 4.        BiPredicate
        BiPredicate<String, Integer> sameThing = (character, number) -> String.valueOf(number).equals(character);

        System.out.println(sameThing.test("1", 1));


// 5.     Unary Operator

        UnaryOperator<String>  changeToUpperCase = (word) -> word.toUpperCase();

        System.out.println(changeToUpperCase.apply("clement"));






// 6.    Binary Operator

        BinaryOperator<Integer> modulo = (number, numbee) -> number % numbee;

        System.out.println(modulo.apply(4, 3));


// 7.    Supplier

        Supplier<Integer> index = ()-> (int) Math.random();
        List<Integer> randomNumbers = Stream.generate(index)
                .collect(Collectors.toList());


// 8.    Consumer

        Consumer<String> printWithPrefix = letter -> System.out.println("Item: " + letter);
        Stream.of("A", "B").forEach(printWithPrefix);


// 9.       BiConsumer

        BiConsumer<String, String> printMapEntry = (key, value) -> System.out.println(key + " Got " + value);
        Map<String, String> scoreMap = Map.of("Batman","Joker", "Benjamin", "Mobo Jumbo");
        scoreMap.forEach(printMapEntry);


        System.out.println(
                printMapEntry
        );

    }






}
