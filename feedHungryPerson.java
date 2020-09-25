public class feedHungryPerson {
  public static void main(String[] args) {

    Person p1 = new Person("manish", "rajpal", 42 , true);
    Person p2 = new Person("Samira", "Azimi", 25 , false);
    Person p3 = new Person("Akwasi", "Nsiah", 40 , true);

    HotDogStand h1 = new HotDogStand();

    h1.feedPerson(p1);
    h1.feedPerson(p2);
    h1.feedPerson(p3);

  }
}
