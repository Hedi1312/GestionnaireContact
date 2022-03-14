package com.app.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.app.dao.UserRepository;
import com.app.model.User;


@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    
    public void register(User user) {

        //Let's check if user already registered with us
        if(checkIfUserExist(user.getEmail())){
            System.out.println("user already exist");
        }
        User userEntity = new User();
        BeanUtils.copyProperties(user, userEntity);
        encodePassword(userEntity, user);
        userRepository.save(user);
    }

    
    public boolean checkIfUserExist(String email) {
        return userRepository.findByEmail(email) !=null ? true : false;
    }

    private void encodePassword( User userEntity, User user){
        userEntity.setPassword(user.getPassword());
    }
}