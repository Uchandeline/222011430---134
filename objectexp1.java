class comp {
    public static double money(double p, double r, double t){
        return p*r*t;
    }
}
public class objectexp1 
{
    public static void main (String args[]){
        comp mycomp= new comp();
        double result=mycomp.money(100000, 0.05, 5);
        System.out.println(+ result);


    }
}
