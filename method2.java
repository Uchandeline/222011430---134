public class method2 {
    public static double money(double p, double r,double t){
return Math.pow(1+r,t)*p;
    }
    public static void main(String args[]){
        double a=500000;
        double b=0.18;
        double c=3;
        double amount=money(a,b,c);
        System.out.println(+amount);
    }
}
