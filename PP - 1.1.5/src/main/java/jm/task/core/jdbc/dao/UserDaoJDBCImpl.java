package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;
import jm.task.core.jdbc.util.Util.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

//import static jm.task.core.jdbc.util.Util.getConnection;


/*public class UserDaoJDBCImpl implements UserDao {

    public UserDaoJDBCImpl() {

    }

    public void createUsersTable() {

        try (Statement statement = getConnection().createStatement()) {
            statement.executeUpdate(" CREATE TABLE IF NOT EXISTS users (" +
                    "id INT NOT NULL AUTO_INCREMENT, " +
                    "name varchar(45) NOT NULL, " +
                    "lastName varchar(45) NOT NULL, " +
                    "age TINYINT NULL, " +
                    "PRIMARY KEY (`ID`))");
        } catch (SQLException e) {
            System.out.println("Ошибка при создании таблицы");
        }
    }

    public void dropUsersTable() {

        try (Statement statement = getConnection().createStatement();) {
            statement.executeUpdate("DROP TABLE IF EXISTS users");
        } catch (SQLException e) {
            System.out.println("Ошибка при удалении таблицы");
        }
    }

    public void saveUser(String name, String lastName, byte age) {

        try (PreparedStatement prepStatment = getConnection().prepareStatement("INSERT INTO Users (name, lastName, age) VALUES (?, ?, ?)")) {
                prepStatment.setString(1, name);
                prepStatment.setString(2, lastName);
                prepStatment.setByte(3, age);
                prepStatment.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Ошибка при добавлении данных");
        }
    }

    public void removeUserById(long id) {

        try (PreparedStatement prepStatment = getConnection().prepareStatement("DELETE FROM users WHERE id = ?")) {
            prepStatment.setLong(1, id);
            prepStatment.executeUpdate();
        } catch (SQLException e) {
            System.out.println("При удалении пользователя произошла ошибка");
        }
    }

    public List<User> getAllUsers() {

        List<User> userList = new ArrayList<>();
        try (Statement statement = getConnection().createStatement()) {
            ResultSet resultSet = statement.executeQuery("SELECT * FROM users");

            while (resultSet.next()) {
                User user = new User(resultSet.getString("name"),
                        resultSet.getString("lastName"),
                        resultSet.getByte("age"));
                user.setId(resultSet.getLong("id"));
                userList.add(user);
            }
        } catch (SQLException e) {
            System.out.println("Ошибка при получении списка пользователей");
        }
        return userList;
    }

    public void cleanUsersTable() {
        try (Statement statement = getConnection().createStatement()) {
            statement.executeUpdate("TRUNCATE TABLE users");
        } catch (SQLException e) {
            System.out.println("Ошибка при очистке таблицы");
        }
    }
}*/
