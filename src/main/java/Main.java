import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {

        int x = 5;
        int y = 3;

        System.out.println("Сумма:" + (x+y));
        System.out.println("Вычитание:" + (x-y));
        System.out.println("Умножение:" + (x*y));
        System.out.println("Деление:" + (x/y));

        // операции с int  и double
        double e = 2.2;
        double i = 1.5;

        System.out.println("Сумма:" + (e+i));
        System.out.println("Вычитание:" + (e-i));
        System.out.println("Умножение:" + (e*i));
        System.out.println("Деление:" + (e/i));


        System.out.println("8 / 3 = ?");
        System.out.println("int    / int    = " + (8 / 3));
        System.out.println("double / int    = " + (8.0 / 3));
        System.out.println("int    / double = " + (8 / 3.0));
        System.out.println("double / double = " + (8.0 / 3.0));

        // Логические операторы
        boolean a1 = true;
        boolean b1 = false;
        System.out.println(a1&&b1);
        System.out.println(a1||b1);
        System.out.println(!b1);


        final long MICROS_PER_DAY = 24 * 60 * 60 * 1000 * 1000;
        System.out.println("MICROS_PER_DAY : " + MICROS_PER_DAY);

        int a = 2147483647;
        int b = 2;
        System.out.println(a + b);



    }
}
