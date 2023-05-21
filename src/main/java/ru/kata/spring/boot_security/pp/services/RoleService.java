package ru.kata.spring.boot_security.pp.services;


import ru.kata.spring.boot_security.pp.entities.Role;

import java.util.List;

public interface RoleService {
    List<Role> getAllRoles();

    void deleteRoleById(Long id);

    void addRole(Role role);

}

