public class Mkt extends Fizika {
    private double p;
    private double k = 1.38;
    private int T = 3;
    public void count(){
        //double c = 0, d = 1;
        //while (c < 23){
       //     d = d * 0.1;
        //    c++;
       // }
       // System.out.print(d);
        //k = k*d;
        p = n * k * T;
        System.out.print("Давление газа при Т=3К: "+ p);
    }
    public Mkt(int n) {
        super(n);
    }
}
