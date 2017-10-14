package test1.Adapter;

/**
 * Created by User on 30.07.2017.
 */
public class DataBaseRunerAdapter extends DataDabseRuner implements DataBase {



    @Override
    public void insert() {
        addObject();
    }

    @Override
    public void update() {
        searchObject();
    }

    @Override
    public void delete() {
        deleteObject();
    }

    @Override
    public void search() {
        searchObject();
    }
}
