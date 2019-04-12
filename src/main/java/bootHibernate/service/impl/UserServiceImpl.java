package bootHibernate.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import bootHibernate.dao.UserDao;
import bootHibernate.entity.User;
import bootHibernate.service.UserService;


@Service
@Component
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;
	
	@Override
	public User getById(Integer id) {
		
		return userDao.findOne(id);
	}

	@Override
	public void adduser(User u) {
		userDao.save(u);
		
	}
     
}
