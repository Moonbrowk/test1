package test1.Singleton;

import java.util.stream.Stream;

/**
 * Created by User on 30.07.2017.
 */
public class Singleton {
    private String name = "Moonbarowk";
    private static Singleton instance = null;

    private Singleton() {



    }

    public static synchronized Singleton getInstance() {
        if (instance == null ) {
            return instance = new Singleton();
        }

        return instance;
    }

}
