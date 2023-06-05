package builder;

public class AircraftConstructor {
    
    AircraftBuilder aircraftBuilder; 
     AircraftConstructor(AircraftBuilder aircraftBuilder)
    {
       this.aircraftBuilder = aircraftBuilder;
    }

  public void setAircraftConstructor()
  {
    aircraftBuilder.buildEngine();
    aircraftBuilder.buildBody();
    aircraftBuilder.buildCockPit();
    aircraftBuilder.buildWings();
  }


}
