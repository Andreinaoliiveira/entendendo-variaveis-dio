public class variaveis {
    public static void main(String[] args) {
        int i = 1500;
        short j = 15;
        long l = 500L;
        int k = 35;
        float f = 3.5F;
        double d = f;

        System.out.println("d:" + d);

        i += 5; // i= i +5
        j -= 3; // j = j -3
        d /= 2.7d; // d = d/2.7d
        l *= 3; // l = l *3
        k %= 2; // k= k%2

        System.out.println("i: " + i);
        System.out.println("j: " + j);
        System.out.println("d: " + d);
        System.out.println("l: " + l);
        System.out.println("k: " + k);

        i = k = j;
        System.out.println("i: " + i);
        System.out.println("k: " + k);


    }

    public static void main(String[] args) {

        int i=10;
        int j=20;
        int k =30;

        int a = i++ + --j * k; // 10+19*30-> 10+570->580

        System.out.println("i++ + --j * k:" + a);
        System.out.println("i: "+i); //11


    }
