package fdp;

import java.util.ArrayList;

public class Client
{
  
  public void start()
  {
       ArrayList<Motorcycle> motorcycleList = new ArrayList<>();
       Factory factory = FactoryIMP.getInstance();

       motorcycleList.add(factory.createMotorcycle("WaterMotorcycle"));
       motorcycleList.add(factory.createMotorcycle("SnowMobile"));

      motorcycleList.forEach((m) -> {
          System.out.println(m.getName() +".\n"+ "Price: $"+ m.getPrice());
      });
  }
}
