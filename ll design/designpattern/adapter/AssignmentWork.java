package adapter;

public class AssignmentWork {
    
     Pen p;
     public void completeAssignment(Pen p)
     {
        System.out.println("Please complete the assigment");
        this.p =  p;
        p.write();
     }

}

