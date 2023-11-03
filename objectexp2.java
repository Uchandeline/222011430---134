class compou{
    public static double buck(double p ,double r, double t){
        return Math.pow(1+r,t)*p;
    } 
}
public class objectexp2 {
public static void main (String args[]){
    compou mycompou= new compou();
    double result= mycompou.buck(500000,0.18,3);
    System.out.println(+result);
}
}