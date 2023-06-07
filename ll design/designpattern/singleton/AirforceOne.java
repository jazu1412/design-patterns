package singleton;

public class AirforceOne {
    

    private static AirforceOne onlyInstance = new AirforceOne() ;

    private AirforceOne()
    {
        System.out.println("only one time creation");
    }

    public static AirforceOne getOnlyInstance() {

        if(onlyInstance==null)
        {

            synchronized(AirforceOne.class)
            {

                if(onlyInstance==null)
                {
                    System.out.println("only one time creation");
                    onlyInstance = new AirforceOne();
                }
               

            }
         
        }
        System.out.println("accessing already created one ");
        return onlyInstance;

    }


public static void main (String arg[])
{


AirforceOne a = AirforceOne.getOnlyInstance();
AirforceOne b = AirforceOne.getOnlyInstance();
AirforceOne c = AirforceOne.getOnlyInstance();

}



}
