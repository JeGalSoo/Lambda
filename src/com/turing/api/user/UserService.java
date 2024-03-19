package com.turing.api.user;

import com.turing.api.enums.Messenger;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;

public interface UserService {
    String addUsers();
    Messenger login(User user) throws SQLException;
    String updatePassword(User user) throws SQLException;
    List<?> findUsersByName(String name) throws SQLException;
    Map<String, ?> findUsersByNameFromMap(String name);
    List<?> findUsersByJob(String job) throws SQLException;
    Map<String, User> findUsersByJobFromMap(String job) throws SQLException;
    Map<String, ?> getUserMap();
    String findUsername(String sc) throws SQLException;
    String test();

    List<?> findUsers() throws SQLException;

    Messenger touch() throws SQLException;

    Messenger rm() throws SQLException;

    List<?> cat() throws SQLException;

    Messenger save1(User user) throws SQLException;

    List<User> findAll() throws SQLException;

    String delete(User build);

    Boolean existsById(long l);

    String count() throws SQLException;

    Optional<User> getOne(String next);
}