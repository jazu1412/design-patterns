package abstractfactory;

public class F16Factory  extends AircraftFactory
{


 public   F16 getPlane() {
       return new F16();
        
    }


}
