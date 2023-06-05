package abstractfactory;

public class F16 implements Aircraft{
    
    F16Engine f16Engine;

    public  F16Engine makeEngine(){

    return  new  F16Engine().designAircraftEngine();
    
}

    public  void checkStealth(){
        System.out.println("F16 is  a stealth aircraft used in military");
    }
   

}
