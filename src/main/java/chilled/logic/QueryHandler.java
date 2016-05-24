package chilled.logic;

/**
 * Created by stuk4 on 5/24/2016.
 */
public interface QueryHandler {

    /**
     *
     * @return
     */
    String insert(String[] fields, String[] values);


    String update(String[] fields, String[] values);


    String selectAll(String[] fields, String[] values);


    String delete(String[] fields, String[] values);

}
