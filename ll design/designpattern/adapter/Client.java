package adapter;

public class Client {
    
    public static void main(String args[])
    {
        Crayons crayons = new Crayons();



//sicne i have only crayons but i have to use it to complete my assesment and assesment is based on pen , what will u do ?
//intialize another class CrayonsToPenAdapter which makes the crayons appear as pen (implements the interface Pen and in internal methods of Pen uses cryaons methods)
        Pen pa = new CrayonsToPenAdapter(crayons);


        //main core logic which uses Pen interface to complete assignment

        AssignmentWork aw = new AssignmentWork();
        aw.completeAssignment(pa);

    }
}
