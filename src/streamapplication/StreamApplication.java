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

//  1. Create the StreamsApplication class. Write the next points of this exercise inside the main method.
//  2. Create a list of the first twenty numbers. Use a loop for this, please.
//  3. Create a list of the even numbers. Display it.
//  4. Create a list of the odd numbers. Display it.
//  5. Create a list of the numbers divisible by 3 and bigger than 10. Display it.
//  6. Create a list of the numbers smaller than 5 and multiply them by 3. Display it.
//  7. Create a list of String where every element follows the format “number <number> has <digit> digits”. The numbers considered have to be bigger than 8 and smaller than 12. Display it.

//---------------------------------------------------------------------------
//Even numbers:
//[2, 4, 6, 8, 10, 12, 14, 16, 18, 20]
//Odd numbers:
//[1, 3, 5, 7, 9, 11, 13, 15, 17, 19]
//Numbers divisible by 3 and bigger than 10:
//[12, 15, 18]
//Numbers smaller than 5 and multiplied by 3:
//[3, 6, 9, 12]
//Digits of numbers bigger than 8 and smaller than 12:
//[number 9 has 1 digits, number 10 has 2 digits, number 11 has 2 digits]
//---------------------------------------------------------------------------