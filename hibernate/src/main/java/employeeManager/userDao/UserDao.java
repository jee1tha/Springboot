package employeeManager.userDao;

import employeeManager.models.User;

import java.util.List;

/**
 * Created by jee1tha on 12/30/16.
 */
public interface UserDao {

    public void add(User user);

    public void edit(User user);

    public void delete(int userId);

    public User getUser(int UserId);

    public List getAllUsers();
}
