public class DogLauncher {
  public static void main(String[] args) {
    Dog[] dogs = new Dog[3];
    dogs[0] = new Dog("Charlie", 17, "Corgi");
    dogs[1] = new Dog("Jackson", 45, "Terrier Mix");
    dogs[2] = new Dog("Poochy", 70, "Husky");
    int i = 0;
    while (i < dogs.length) {
      dogs[i].makeNoise();
      Dog.printInfo(dogs[i]);
      i += 1;
    }
  }
}