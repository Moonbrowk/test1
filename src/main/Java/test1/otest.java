package test1;

/**
 * Created by User on 01.08.2017.
 */
public class otest {
    public static void main(String[] args) throws InterruptedException {

        Integer a = new Integer(1);
        Integer b = new Integer(1);

        System.out.println(a.intValue() == b.intValue()); //true
        System.out.println(a.compareTo(b)); //true
        System.out.println(a.equals(b)); // true
        System.out.println(a == b); //false
        int count = 0;
        int s = 1;

        while (count <= 60) {
            s = stakan(s);
           // Thread.sleep(00);
            count++;
        }


        System.out.println(s);
    }

        public static int stakan(int x) throws InterruptedException {
            x = x * 2;
            return x;


    }
}
