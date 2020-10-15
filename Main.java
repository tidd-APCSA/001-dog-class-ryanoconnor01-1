public class Main {
  public static void main(String[] args) {
    // test your code here by creating a three different dogs from the Dog class. Be sure you give each dog different characteristics. 
    Dog mine = new Dog("Bentley", "golden doodle", 15.9, "red", true);
    Dog kaylees = new Dog("Beau", "terrier", 14.6, "black", true);
    Dog cathys = new Dog("Jake", "yorkie", 12.3, "gray", true);

    System.out.println(mine.getName());
    System.out.println(mine.getBreed());
    System.out.println(mine.getWeight());
    System.out.println(mine.getColor());
    System.out.println(mine.getTrained());

    System.out.println(kaylees.getName());
    System.out.println(kaylees.getBreed());
    System.out.println(kaylees.getWeight());
    System.out.println(kaylees.getColor());
    System.out.println(kaylees.getTrained());

    System.out.println(cathys.getName());
    System.out.println(cathys.getBreed());
    System.out.println(cathys.getWeight());
    System.out.println(cathys.getColor());
    System.out.println(cathys.getTrained());

    // mine.gained();
    // kaylees.gained();
    // kaylees.gained();

    System.out.println(mine);
    System.out.println(kaylees);
    System.out.println(cathys);

  }
}