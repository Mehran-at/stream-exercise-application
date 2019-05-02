package caesarapplication;

public class CacearApplication {
  public static void main(String[] args) {

    Caesar caesar = new Caesar();
    StringFile stringFile = new StringFile();

    TextAndKey textAndKey = new TextAndKey("HelloWorld", 32);
    System.out.println("\n" + caesar.getCipher(textAndKey));

    String string = stringFile.convertStreamFileToString();
    System.out.println("\n" + string);
    TextAndKey textAndKeyNext = new TextAndKey(string, 2);
    System.out.println("\n" + caesar.getCipher(textAndKeyNext));
  }
}

//Develop the Caesar cipher exercise:
//  1. Create the Caesar class. It has the cipher method that receives the plaintext and the key and returns the ciphertext.
//  2. Create the CaesarTest class and provide meaningful tests.
//  Rules:
//    . You’re not allowed to use a loop.
//    . The first line of the cipher method starts with the return command.
//    . You’re allowed to create other methods
//  Hints:
//    > You can refresh your memory about the Caesar description here.
//    > You can start a Stream using the Stream.of(...) method.
//    > You can use one method that you have created inside a Lambda.
