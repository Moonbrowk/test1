package test1.Adapter;

/**
 * Created by User on 30.07.2017.
 */
public class Aplication {
    String name = "Aplication";

    public static void main(String[] args) {


        DataBase dataBase = new DataBaseRunerAdapter();

        dataBase.delete();
        dataBase.insert();
        dataBase.search();
        dataBase.update();


    }
}
