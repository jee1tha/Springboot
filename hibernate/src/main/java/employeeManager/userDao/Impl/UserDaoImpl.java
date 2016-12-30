package employeeManager.userDao.Impl;

import java.util.List;
import employeeManager.models.User;
import employeeManager.userDao.UserDao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
/**
 * Created by jee1tha on 12/30/16.
 */
@Repository

public class UserDaoImpl implements UserDao {
    @Autowired
    private SessionFactory session;

    @Override
    public void add(User user){
        session.getCurrentSession().save(user);

    }

    @Override
    public void edit(User user){
        session.getCurrentSession().update(user);
    }

    @Override
    public void delete(int userId){

    session.getCurrentSession().delete(getUser(userId));
    }

    @Override
    public User getUser(int UserId){
        return (User) session.getCurrentSession().get(User.class,UserId);
    }

    @Override
    public List getAllUsers(){
        return session.getCurrentSession().createQuery("from employeeManager").list();
    }

}
