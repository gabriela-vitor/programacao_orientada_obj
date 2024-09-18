public class trigonometria{

    public static int fatorial(int x){

        int fat = 1;

        while(x >= 1){
            fat *= x;
            x--;
        }
        return fat;
    }



    public static double cos(double x){

        double cosseno = 0;
        int j = 0;
        x = x * 180 / 3.14;

        for(int i=0; i<10; i+=2){

            cosseno += Math.pow(-1, j)*Math.pow(x, i) / fatorial(i);
            j++;

        }

        return cosseno;
    }
}
