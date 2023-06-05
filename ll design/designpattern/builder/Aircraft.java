package builder;

public abstract class Aircraft {
    
    
String color;
int speed;
boolean detectedByRadar;
int altitude;
int fuelCapacity;


public String getColor() {
    return color;
}
public void setColor(String color) {
    this.color = color;
}
public boolean getDetectedByRadar() {
    return detectedByRadar;
}
public void setDetectedByRadar(boolean detectedByRadar) {
    this.detectedByRadar = detectedByRadar;
}
public int getAltitude() {
    return altitude;
}
public void setAltitude(int altitude) {
    this.altitude = altitude;
}
public int getFuelCapacity() {
    return fuelCapacity;
}
public void setFuelCapacity(int fuelCapacity) {
    this.fuelCapacity = fuelCapacity;
}
public int getSpeed() {
    return speed;
}
public void setSpeed(int speed) {
    this.speed = speed;
}




//test default package protected variable



}
