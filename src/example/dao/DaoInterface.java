package example.dao;

import java.util.Collection;
import example.bean.*;

public interface DaoInterface <T,K> {
//	A method to retrieve all records
	Collection<T> retrieveAll();

//	A method to create new record
	void Create(T t);

//	A method to delete method
	void delete(K id);

//	A method to update record
	void update(T t);

//	A method to retrieveone
	T retrieveOne(K id);
}
