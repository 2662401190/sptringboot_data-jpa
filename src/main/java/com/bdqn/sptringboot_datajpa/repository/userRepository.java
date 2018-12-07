package com.bdqn.sptringboot_datajpa.repository;

import com.bdqn.sptringboot_datajpa.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 贺威
 * @create 2018-12-06-20:19
 * 继承JpaRepository来完成对数据库的操作
 */
public interface userRepository extends JpaRepository<User,Integer> {


}
