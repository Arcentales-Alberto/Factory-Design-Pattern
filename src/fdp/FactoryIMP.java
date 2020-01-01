
package fdp;

public class FactoryIMP implements Factory
{
    public final static String WATER = "water";
    public final static String SNOW = "snow";


    @Override
    public Motorcycle createMotorcycle(String type)
    {
        switch(type)
        {
            case WATER: return new WaterMotorcycle();
            case SNOW: return new SnowMobile();
            default: return null;
        }
    }
    
}
