package com.dio.santanderbootcampfullstack2023.service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import com.dio.santanderbootcampfullstack2023.domain.model.User;
import com.dio.santanderbootcampfullstack2023.domain.repository.UserRepository;
import com.dio.santanderbootcampfullstack2023.service.UserService;

@Service
public class UserServiceImpl implements UserService {

   
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {

     return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
       /*if(userToCreate.getId() != 0L && userRepository.existsById(userToCreate.getId())) {
            throw new IllegalArgumentException("Usuário já existe");
       }*/
       if(userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())){
            throw new IllegalArgumentException("Usuário com conta já existente");
       }
        return this.userRepository.save(userToCreate);
    }
    
}
