package ru.kata.spring.boot_security.pp.services;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ru.kata.spring.boot_security.pp.entities.User;
import ru.kata.spring.boot_security.pp.repositories.UserRepository;


@Service
public class LoadUserSecurity implements UserDetailsService {

    private UserRepository userRepository;

    public LoadUserSecurity(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException(String.format("User" + username + "not found"));
        }
        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),
                user.getAuthorities());
    }
}
