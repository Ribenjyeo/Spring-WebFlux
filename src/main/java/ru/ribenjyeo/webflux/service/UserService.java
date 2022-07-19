package ru.ribenjyeo.webflux.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.ReactiveUserDetailsService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;
import ru.ribenjyeo.webflux.repo.UserRepo;

@Service
public class UserService implements ReactiveUserDetailsService {

    private final UserRepo userRepository;

    @Autowired
    public UserService (UserRepo userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public Mono<UserDetails> findByUsername(String username) {
        return userRepository.findByUsername (username)
                .cast (UserDetails.class);
    }
}
