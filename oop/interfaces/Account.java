package oop.interfaces;

public class Account implements UserRepository{
    @Override
    public String findByUsername(String username) {
        return username;
    }
}
