package database;

import java.util.List;
import javax.sql.DataSource;

import beans.Result;

public interface ResultDAO {
	   /** 
	    * This is the method to be used to initialize
	    * database resources ie. connection.
	    */
	   public void setDataSource(DataSource ds);
	   /** 
	    * This is the method to be used to create
	    * a record in the Result table.
	    */
	   public void create(Result result);
	   /** 
	    * This is the method to be used to list down
	    * a record from the Result table corresponding
	    * to a passed Result id.
	    */
	   public Result getResult(Integer id);
	   /** 
	    * This is the method to be used to list down
	    * all the records from the Result table.
	    */
	   public List<Result> listResult();
	   /** 
	    * This is the method to be used to delete
	    * a record from the Result table corresponding
	    * to a passed Result id.
	    */
	   public void delete(Integer id);
	   /** 
	    * This is the method to be used to update
	    * a record into the Result table.
	    */
	   public void update(int id, String name);
}
