package abstractfactory;

public class BoeingFactory  extends AircraftFactory
{

   
 public   Boeing getPlane() {
    return new Boeing();
     
 }

    



}
