package com.dio.santanderbootcampfullstack2023.service;

import com.dio.santanderbootcampfullstack2023.domain.model.User;

public interface UserService {
    
    User findById(Long id);

    User create(User userToCreate);



}


