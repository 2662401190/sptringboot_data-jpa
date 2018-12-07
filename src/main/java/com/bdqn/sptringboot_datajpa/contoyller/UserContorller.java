package com.bdqn.sptringboot_datajpa.contoyller;

import com.bdqn.sptringboot_datajpa.entity.User;
import com.bdqn.sptringboot_datajpa.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
/**
 * @author 贺威
 * @create 2018-12-06-20:34
 */
@RestController
public class UserContorller {
    @Autowired
    userRepository userRepository;
    @GetMapping("/hello/{id}")
    public User hello(@PathVariable("id") Integer id){
        User one = userRepository.findOne(id);
        return one;
    }
}
