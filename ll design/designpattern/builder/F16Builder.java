package builder;

public  class F16Builder extends AircraftBuilder {
    
    F16 f16;
    public F16Builder(F16 f16)
    {
        this.f16 = f16;
    }

  public F16Builder buildEngine(){

    System.out.println("Building F16 engine");
      return this;
  };

  public F16Builder buildCockPit(){

    System.out.println("Building F16 cockpit");
    return this;
  };

  public F16Builder buildWings(){
    System.out.println("Building F16 wings");
    return this;

  };
  public F16Builder buildBody(){

    System.out.println("Building F16 body");
    return this;
  };


public   F16 deliveryOfAircraft()
{
    System.out.println("delivery for F16 aircraft done");
    return f16;
}


}
