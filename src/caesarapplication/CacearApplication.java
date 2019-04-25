package caesarapplication;

public class CacearApplication {
  public static void main(String[] args) {
    Caesar caesar = new Caesar();
    TextAndKey textAndKey = new TextAndKey("hello",13);
    System.out.println(caesar.getCipher(textAndKey).toString());
  }
}
