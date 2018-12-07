package com.bdqn.sptringboot_datajpa.entity;

/**
 * @author 贺威
 * @create 2018-12-06-17:33
 */

import javax.persistence.*;

/**
 * 使用jpa注解配置映射关系
 * 告诉jap这是实体类（和数据表映射的类）
 * Table 指定和哪个数据表关联 如果省略默认类名小写
 */
@Table(name="tbl_user")
@Entity
public class User {

     //标识这是一个主键
    @Id
    //主键自增
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;
    @Column(name = "last_name",length = 15)
    private String lastName;
    @Column //省略默认就是属性名
    private String eamil;

    public User() {
    }

    public User(Integer id, String lastName, String eamil) {
        this.id = id;
        this.lastName = lastName;
        this.eamil = eamil;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEamil() {
        return eamil;
    }

    public void setEamil(String eamil) {
        this.eamil = eamil;
    }
}
