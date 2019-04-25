package caesarapplication;

public class TextAndKey {
  private String plainText;
  private int key;

  public TextAndKey(String plainText, int key) {
    this.plainText = plainText;
    this.key = key;
  }

  public int getKey() {
    return key;
  }

  public String getPlainText() {
    return plainText.toString();
  }

  @Override
  public String toString() {
    return "TextAndKey{" +
        "plainText='" + plainText + '\'' +
        ", key=" + key +
        '}';
  }
}
