public class MyEmployeeSystem {
  public static void main(String[] args) {
      Employee e1 = new Employee();
      Employee e2 = new Employee();
      e1.name = "Jeff Jefferson";
      e1.age = 32;
      e2.name = "Greta Greatson";
      e2.age = 28;
      e1.address = "Cool Avenue out.";

      e1.sayHello();
      System.out.print(e1.name );

  }
}
