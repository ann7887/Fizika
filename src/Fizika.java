public class Fizika {
    final int v;
    private int s;
    //private boolean run;
    protected int n =2;
    public void n(){
        //int n = 2;
        System.out.println("Концентрация газа n=" + n);
    }
    void s(int a){
        System.out.println("S - расстояние");
    }
    void s(int v, int t){
        System.out.println("s = " + v * t);
    }

    public Fizika(int v){
        this.v = v;
    }

    @Override
    public String toString() {
        return "Fizika{" +
                "v=" + v +
                ", s=" + s +
                ", n=" + n +
                '}';
    }
}