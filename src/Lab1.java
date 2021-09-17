import static java.lang.Math.*;

public class Lab1 {
    // Объявление и присовение значений объектам
    private final int longA = 7;
    private final int longX = 17;
    private final double max = -14.0;
    private final double min = 6.0;
    private long[] a = new long[longA];
    private double[] x = new double[longX];
    private double[][] A = new double[longA][longX];

    public void update() { // Выполнение программы
        inputArrayA();
        inputArrayX();
        inputArrayA1();
        outArray();
    }

    private void inputArrayA() { // Заполнение массива a (первого)
        int i = 0;
        for (i = 0; i < a.length; i++){
            a[i] = i * 2L + 6L;
        }
    }

    private void inputArrayX() {    // Заполнение массива b (второго)
        int i = 0;
        for (i = 0; i < x.length; i++) {
            x[i] = (Math.random()*((max-min)+1)) + min;
        }
    }

    private void inputArrayA1() { // Заполнение массива A (третьего)
        int i = 0;
        for (i = 0; i < a.length; i++) {
            int j = 0;
            for (j = 0; j <x.length; j++) {
                if (a[i] == 16L) {
                    A[i][j] = sin(cbrt(log(abs(x[j]))));
                }
                else if (a[i] == 6L || a[i] == 12L || a[i] == 14L) {
                    A[i][j] = atan(pow(cos(atan(((x[j] - 4.0) / 2.0) * E + 1.0) - 1.0), 2.0));
                }
                else {
                    A[i][j] = tan(pow(2.0 * 3.0 / atan(((x[j] - 4.0) / 2.0) * E + 1.0), sin(pow(x[j] / 2.0, x[j]))));
                }
            }
        }
    }

    private void outArray(){ // Вывод данных в соотвесвии с задачей
        int i = 0;
        for (i = 0; i < longA; i++) {
            int j = 0;
            for (j = 0; j < longX; j++) {
                System.out.printf("%8.4f", A[i][j]);
            }
            System.out.println();
        }
    }
}
