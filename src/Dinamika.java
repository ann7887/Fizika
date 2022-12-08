public class Dinamika {
    private int g = 10;
    public int F;
    public  Dinamika(int m){
        F = m * g;
    }


}
if (vX > 0 && vY > 0){
        vY = 1;
        vX = 1;
        }
        else if (vX < 0 && vY > 0){
        vY = 1;
        vX = -1;
        }
        else if (vX < 0 && vY < 0){
        vY = -1;
        vX = -1;
        }
        else{
        vY = -1;
        vX = 1;
        }