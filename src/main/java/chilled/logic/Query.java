package chilled.logic;

/**
 * Created by stuk4 on 5/24/2016.
 */
public class Query {



    /**
     * Insert query template
     */
    public static final transient String INSERT ="INSERT INTO $tableName ($attributes) values ($values)";

    /**
     * Update query template
     */
    public static final transient String UPDATE="";


    /**
     * Select query template
     */
    public final transient String SELECT ="";


    /**
     * Delete query template
     */
    public final transient String DELETE="";



}
