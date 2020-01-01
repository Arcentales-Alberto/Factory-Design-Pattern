package fdp;


public class Client
{
  
  public void start()
  {
     Factory factory = new FactoryIMP();
     Motorcycle motorcycle = factory.createMotorcycle("water");
     Motorcycle motorcycle2 = factory.createMotorcycle("snow");

     System.out.println("Water Motorcycle " + "\n" + "Price: " +  motorcycle.getPrice());
     System.out.println("Snow Motorcycle " + "\n" + "Price: " +  motorcycle2.getPrice());

  }
}
