public class Dog {
  public int size;
  public String name;
  public String breed;
  public Dog(String inputName, int inputSize, String inputBreed){
    name = inputName;
    size = inputSize;
    breed = inputBreed;
  }
  public void makeNoise() {
    if (size <= 20) {
      System.out.println("Yip! Yip! Yip!");
    } else if (size > 20 && size <= 60) {
      System.out.println("Bark! Bark!");
    } else {
      System.out.println("ROOF!");
    }
  }
  public static void printInfo(Dog d1) {
    System.out.println(d1.name);
    System.out.println(d1.size);
    System.out.println(d1.breed);
  }
}