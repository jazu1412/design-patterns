package abstractfactory;

public class BoeingEngine implements AircraftEngine {


    public BoeingEngine ae;
    boolean isStealth;

    
    public  BoeingEngine designAircraftEngine()
    {
       
        ae = new BoeingEngine();
        System.out.println("Boeing engine made");
        return ae;
    }

}
