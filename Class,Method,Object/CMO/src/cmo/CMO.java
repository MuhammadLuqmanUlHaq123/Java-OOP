package cmo;
public class CMO {
    int a;
    int b;
    public void add(int d, int e)
    {
        this.a = d ;
        this.b = e ;
        int c = this.a + this.b;
        System.out.println("The Sum Value Of "+  a + " + "+ b + " = " + c);
    }
    
    public static void main(String[] args) {
       
        CMO cm = new CMO();
        cm.add(10, 50);

        Add ad = new Add();
        ad.print_add(50, 10);
        ad.display();
    }
   
}
class Add
{
    int a; int b;
    public void print_add(int a, int b)
    {
       this.a = a;
        this.b = b;
    }
    public void display()
    {
        int c = this.a + this.b;
        System.out.println("The Display Value Of " + a + " + " + b + " = "+ c);
    }
}