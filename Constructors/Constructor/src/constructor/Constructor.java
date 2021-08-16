package constructor;
public class Constructor {

 
    
    public static void main(String args[]) {
        // Value In Variable // Default Constructor
        Test t  = new Test();
        System.out.println("Your Value Is " +t.a);
        
        System.out.println("-----------------------------------------------");
        
        //No Argument Constructor //
        Test2 t2 = new Test2();
        Test2 t3 = new Test2();
        System.out.println("Emp 1 :" + t2.name + " & " + t2.emp_id);
        System.out.println("Emp 1 :" + t3.name + " & " + t3.emp_id);
        
        System.out.println("-----------------------------------------------");
        
        // Parameterized Constructr //
        param para = new param(101, "Luqman Ul Haq");
        System.out.println("Emp Id Is " + para.id + " And Name is " + para.Name );
        
        
    }
    
}
class Test
{
    int a = 10;
    
}

class Test2
{
    String name;
    int emp_id;
}

class param
{
    int id;
    String Name;
    param(int id, String Name)
    {
        this.id = id;
        this.Name = Name;
    }
}