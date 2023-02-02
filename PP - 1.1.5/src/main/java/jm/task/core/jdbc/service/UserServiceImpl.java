package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
//import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.model.User;

import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl implements UserService {

    private final static UserDaoHibernateImpl database = new UserDaoHibernateImpl();
   // UserDao database = new UserDaoJDBCImpl();
    public void createUsersTable() throws SQLException {database.createUsersTable();}

    public void dropUsersTable() {
        database.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {
        database.saveUser(name, lastName, age);
    }

    public void removeUserById(long id) {
        database.removeUserById(id);
    }

    public List<User> getAllUsers() {
/*        List<User> users = database.getAllUsers();
        for (User user : users) {
            System.out.println(user);
        }
        return users;*/
        return database.getAllUsers();
    }

    public void cleanUsersTable() {
        database.cleanUsersTable();
    }
}
