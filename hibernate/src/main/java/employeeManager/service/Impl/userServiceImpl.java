package employeeManager.service.Impl;

import employeeManager.models.User;
import employeeManager.service.userService;
import employeeManager.userDao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by jee1tha on 12/30/16.
 */
@Service
public class userServiceImpl implements userService {
    @Autowired
    private UserDao userdao ;

    @Transactional
    public void add(User user){
        userdao.add(user);
    }

    @Transactional
    public void edit(User user){
        userdao.edit(user);
    }

    @Transactional
    public void delete(int userId){
    userdao.delete(userId);
    }

    @Transactional
    public User getUser(int UserId){
        return userdao.getUser(UserId);
    }

    @Transactional
    public List getAllUsers(){
        return userdao.getAllUsers();
    }
}
