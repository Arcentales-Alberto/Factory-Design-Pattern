
package fdp;

public class FactoryIMP implements Factory
{
    private static FactoryIMP f = null;
    
    
    public static FactoryIMP getInstance()
    {
       if(null == f)
          f = new FactoryIMP();
       
       return f;
    }

    @Override
    public Motorcycle createMotorcycle(String type)
    {
       Motorcycle motorcycle = null;
        
        try
        {
          motorcycle = (Motorcycle) Class.forName(f.getClass().getPackage().getName() +"."+
                                                  type).newInstance();
        
        } catch(ClassNotFoundException | IllegalAccessException | InstantiationException e)
         {
             System.out.println(e); 
         }
        
        return motorcycle;
    }

   
    
}
