package com.turing.api.user;

import com.turing.api.enums.Messenger;

import java.sql.SQLException;
import java.util.*;

public class UserController {
    private static UserController instance = new UserController();


    public static UserController getInstance() {
        return instance;
    }

    public Messenger rm() throws SQLException {
        return service.rm();
    }
    Map<Integer,User> map;
    UserService service;

    public UserController() {
        this.map=new HashMap<>();
        this.service = UserServiceImpl.getInstance();
    }
    public String test(){return service.test();}
    public List<?> findUsers() throws SQLException {
        return service.findUsers();
    }

    public String addUsers() {
        return service.addUsers();
    }

    public Messenger save1(Scanner scanner) throws SQLException {
        return service.save1(User.builder()
                .username(scanner.next())
                .password(scanner.next())
                .name(scanner.next())
                .phoneNumber(scanner.next())
                .job(scanner.next())
                .height(scanner.nextDouble())
                .weight(scanner.nextInt())
                .build());
    }

    public List<User> findAll() throws SQLException {
        return service.findAll();
    }

    public Messenger login(Scanner scanner) throws SQLException {
        return service.login(User.builder()
                .username(scanner.next())
                .password(scanner.next())
                .build());
    }

    public String findUsername(Scanner scanner) throws SQLException {
        return service.findUsername(scanner.next());
    }

    public String updatePassword(Scanner scanner) throws SQLException {
        return service.updatePassword(User.builder()
                .username(scanner.next())
                .password(scanner.next())
                .build());
    }

    public String delete(Scanner scanner) {
        service.delete(User.builder()
                .username(scanner.next())
                .build());
        return "회원삭제";
    }

    public Boolean existsById(Scanner scanner) {
        return service.existsById(Long.parseLong(scanner.next()));
    }

    public List<?> findUsersByName(Scanner scanner) throws SQLException {
        return service.findUsersByName(scanner.next());
    }

    public Map<String, ?> findUsersByNameFromMap(Scanner scanner) {
        return   service.findUsersByNameFromMap(scanner.next());
    }

    public List<?> findUsersByJob(Scanner scanner) {
        return null;
    }

    public Map<String, User> findUsersByJobFromMap(Scanner sc) throws SQLException {
        return service.findUsersByJobFromMap(sc.next());
    }

    public String count() throws SQLException {
        return service.count();
    }
    public Optional<User> getOne(Scanner scanner) {
        return service.getOne(scanner.next());
    }
    public Map<String, ?> getUserMap(){
        return service.getUserMap();
    }

    public Messenger touch() throws SQLException {
        return service.touch();
    }

    public List<?> cat() throws SQLException {
        return service.cat();
    }
}