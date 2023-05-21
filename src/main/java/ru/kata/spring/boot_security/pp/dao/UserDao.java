package ru.kata.spring.boot_security.pp.dao;

import ru.kata.spring.boot_security.pp.entities.Role;

import java.util.Objects;
import java.util.Set;

public class UserDao {
    private Long id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private int age;
    private Set<Role> roles;

    public UserDao() {
    }

    public UserDao(Long id, String username, String password, String firstName, String lastName, int age, Set<Role> roles) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.roles = roles;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDao userDao = (UserDao) o;
        return Objects.equals(id, userDao.id) && age == userDao.age && Objects.equals(username, userDao.username) && Objects.equals(password, userDao.password) && Objects.equals(firstName, userDao.firstName) && Objects.equals(lastName, userDao.lastName) && Objects.equals(roles, userDao.roles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, password, firstName, lastName, age, roles);
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", roles=" + roles +
                '}';
    }
}
