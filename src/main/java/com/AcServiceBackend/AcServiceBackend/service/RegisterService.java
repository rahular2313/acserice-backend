package com.AcServiceBackend.AcServiceBackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import com.AcServiceBackend.AcServiceBackend.model.registermodel;
import com.AcServiceBackend.AcServiceBackend.repo.registerrepo;

@Service
@Configuration
public class RegisterService {

    @Autowired
    private registerrepo registerRepository;

    public registermodel addregister(registermodel register) {
        return registerRepository.save(register);
    }

    public int loginValidation(String email, String password) {
        registermodel existingUser = registerRepository.findByEmail(email);
        if (existingUser != null && password == existingUser.getPassword()) {
            return 1;
        } else {
            return 0;
        }
    }
}
