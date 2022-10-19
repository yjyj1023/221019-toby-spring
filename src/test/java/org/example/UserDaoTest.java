package org.example;

import static org.junit.jupiter.api.Assertions.*;

import user.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class UserDaoTest {

    @Test
    void addAndSelect() throws SQLException, ClassNotFoundException {
        UserDao userDao = new UserDao();
        User user = new User("11", "EternityHwan","1123");
        userDao.add(user);

        User selectedUser = userDao.get("11");
        Assertions.assertEquals("EternityHwan", selectedUser.getName());
    }
}