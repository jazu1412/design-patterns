package abstractfactory;

public  class FactoryProducer {
    
    public  static AircraftFactory getFactory(boolean isStealth)
    {
        if(isStealth)
        {
             return new F16Factory();
        }
        else{
            return new BoeingFactory();
        }

    }
   

}
