package bootHibernate.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import bootHibernate.entity.User;
@Repository
public interface UserDao extends CrudRepository<User, Integer >{
	
	public User findOne(Integer id);

    @SuppressWarnings("unchecked")
    public User save(User u);

    @Query("from User t where t.name=:name")
    public User findUserByName(@Param("name") String userName);
}
