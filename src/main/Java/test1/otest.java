package test1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by User on 01.08.2017.
 */
public class otest {
    public static void main(String[] args) throws InterruptedException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));



        System.out.println(bufferedReader.getClass());
        System.out.println(bufferedReader.getClass().getName());
        System.out.println(bufferedReader.getClass().getCanonicalName());
        System.out.println(bufferedReader.getClass().getClass().getClass());
        System.out.println(bufferedReader.getClass().getFields());
        System.out.println(bufferedReader.getClass().getSimpleName());
        System.out.println(bufferedReader.getClass().getSuperclass());

        Map<Integer, Integer>  collection = new HashMap<>(20, 0.90f);
        Collection<Integer> collection1 = new HashSet<>(33, 0.5f);



        System.out.println(collection.get(null));
        System.currentTimeMillis();







    }
}
