package abstractfactory;

public class Boeing implements Aircraft{


    BoeingEngine boeingEngine;

    public  BoeingEngine makeEngine(){

    return  new  BoeingEngine().designAircraftEngine();
    
}

    public  void checkStealth(){
System.out.println("Boeing is not a stealth aircraft but a passenger aircraft");
    }
}
