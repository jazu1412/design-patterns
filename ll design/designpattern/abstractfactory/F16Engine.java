package abstractfactory;

public class F16Engine implements AircraftEngine{

    public F16Engine ae;
    boolean isStealth;

    
    public  F16Engine designAircraftEngine()
    {
       
        ae = new F16Engine();
        System.out.println("F16 engine made");
        return ae;
    }



}
