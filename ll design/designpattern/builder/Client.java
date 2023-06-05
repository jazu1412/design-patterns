package builder;

public class Client
{
    
   public static void main(String arg[])
    {
        F16 f16 = new F16();
        F16Builder f16Builder = new F16Builder(f16);
        f16Builder.buildBody().buildCockPit().buildEngine().buildEngine();
        f16 =  f16Builder.deliveryOfAircraft();

    }
}
