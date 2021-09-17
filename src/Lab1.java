import static java.lang.Math.*;

public class Lab1 {
    private final int longA = 7;
    private final int longX = 17;
    private final double max = -14.0;
    private final double min = 6.0;
    private long[] a = new long[longA];
    private double[] x = new double[longX];
    private double[][] b = new double[longA][longX];

    public void update() {
        inputArrayA();
        inputArrayX();
        inputArrayB();
        outArray();
    }

    private void inputArrayA() {
        int i = 0;
        for (i = 0; i < a.length; i++){
            a[i] = i * 2L + 6L;
        }
    }

    private void inputArrayX() {
        int i = 0;
        for (i = 0; i < x.length; i++) {
            x[i] = (Math.random()*((max-min)+1)) + min;
        }
    }

    private void inputArrayB() {
        int i = 0;
        for (i = 0; i < a.length; i++) {
            int j = 0;
            for (j = 0; j <x.length; j++) {
                if (a[i] == 16L) {
                    b[i][j] = sin(cbrt(log(abs(x[j]))));
                }
                else if (a[i] == 6L || a[i] == 12L || a[i] == 14L) {
                    b[i][j] = atan(pow(cos(atan(((x[j] - 4.0) / 2.0) * E + 1.0) - 1.0), 2.0));
                }
                else {
                    b[i][j] = tan(pow(2.0 * 3.0 / atan(((x[j] - 4.0) / 2.0) * E + 1.0), sin(pow(x[j] / 2.0, x[j]))));
                }
            }
        }
    }

    private void outArray(){
        int i = 0;
        for (i = 0; i < longA; i++) {
            int j = 0;
            for (j = 0; j < longX; j++) {
                System.out.printf("%12.4f", b[i][j]);
            }
            System.out.println();
        }
    }
}
