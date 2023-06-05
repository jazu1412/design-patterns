package builder;

public abstract class AircraftBuilder {
    
    
  public abstract AircraftBuilder buildEngine();
  public abstract AircraftBuilder buildCockPit();
  public abstract AircraftBuilder buildWings();
  public abstract AircraftBuilder buildBody();
    

  public abstract  Aircraft deliveryOfAircraft();


}
