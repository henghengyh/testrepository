class TestFile {
  int i;

  public TestFile() {
    this.i = 2;
  }

  public void show() {
    System.out.println(this.i);
  }

  public static void main(String[] args) {
    TestFile a = new TestFile();
    a.show();
  }
}
