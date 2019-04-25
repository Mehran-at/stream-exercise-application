package streamapplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApplication {
  public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>();
    for (int e = 1; e <= 20; e++) {

      numbers.add(e);
    }
    System.out.println(numbers);

    System.out.println("--Odd Numbers");
    numbers.stream()
           .filter(e -> e % 2 == 0)
           .sorted()
           .forEach(e -> System.out.print(e));

    System.out.println("\n--Even Numbers");
    numbers.stream()
           .filter(e -> e % 2 == 1)
           .sorted()
           .forEach(e -> System.out.print(e));

    System.out.println("\n--Numbers divisable by 3 and bigger than 10");
    numbers.stream()
           .filter(e -> e % 3 == 0 && e > 10)
           .forEach(e -> System.out.println(e));


    List<Integer> numbersSmallerThanFive = new ArrayList<>();
    for (int e = 1; e <= 5; e++) {
      numbersSmallerThanFive.add(e);
    }
    System.out.println(numbersSmallerThanFive);

    System.out.println("--Number multiply 5 ");
    numbersSmallerThanFive.stream()
                          .map(e -> e * 3)
                          .forEach(e -> System.out.println(e));

    System.out.println("--Numbers considered have to be bigger than 8 and smaller than 12");

    List<Integer> newList = Arrays.asList(9, 11, 1, 10, 2, 33, 4444, 555, 6666666);

    List<String> digits = newList.stream()
                                 .filter(e -> e > 8 && e < 12)
                                 .map(e -> e.toString())
                                 .map(e -> " number " + e + " has " + e.length() + " digit/s.")
                                 .collect(Collectors.toList());
    System.out.println(digits);

  }
}
