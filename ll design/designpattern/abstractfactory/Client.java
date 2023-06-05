package abstractfactory;

public class Client {
    

    public static void main (String args[])
    {


        AircraftFactory airFirm1 =  FactoryProducer.getFactory(false);
        Aircraft bPlane =   airFirm1.getPlane();
        AircraftEngine be = bPlane.makeEngine();
        bPlane.checkStealth();

        AircraftFactory airFirm2 =  FactoryProducer.getFactory(true);
        Aircraft fPlane =   airFirm2.getPlane();
        AircraftEngine fe = fPlane.makeEngine();
        fPlane.checkStealth();




    }
}
