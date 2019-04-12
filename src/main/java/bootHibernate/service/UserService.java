package bootHibernate.service;

import bootHibernate.entity.User;

public interface UserService {
	User getById(Integer id);
	
    void adduser (User u);
}
