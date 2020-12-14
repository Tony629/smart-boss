package com.shinetech.smartboss.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;


@Getter
@Setter
@Entity
public class Profile implements Serializable {

    @Id
    @GeneratedValue(generator = "system_uuid")
    @GenericGenerator(name = "system_uuid",strategy = "uuid")
    @Column(length = 36)
    private String profileId;

    @Column(length = 100)
    private String name;
    @Column(length = 1)
    private String gender;
    private int workYear;
    private int age;
    @Column(length = 36)
    private String positionApplied;
    @Column(length = 200)
    private String email;
    @Column(length = 200)
    private String university;
    @Column(length = 11)
    private String phone;
    @Column(length = 20)
    private String wechat;
    @Column(length = 20)
    private String degree;

    private String skills;
    private String projectExperience;

}
