package adapter;

public class CrayonsToPenAdapter implements Pen {

    Crayons pp ;

    CrayonsToPenAdapter(Crayons cray)
    {
       pp=cray;
    }

    public void write()
    {
         pp.marker();
    }

}
