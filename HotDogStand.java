public class HotDogStand  {

  public int hotdogs = 1;

  public void feedPerson(Person p) {
    if (p.hungry && hotdogs > 0)  {
      System.out.println(p.fname +" "+ p.lname +"  you are hungry. Eat here-");
      hotdogs--;
    }
    else if (p.hungry == false ) {
      System.out.println(p.fname +" "+ p.lname + "   you are not hungry. thank you for coming over.");
    }
    else if (hotdogs <= 0)  {
      System.out.println(p.fname +" "+ p.lname + "  Apologies we are out of hotdogs. Please comeback again. ");
    }
  }
}
