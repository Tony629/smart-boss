package com.shinetech.smartboss.dao;

import com.shinetech.smartboss.SmartBossApplication;
import com.shinetech.smartboss.model.Profile;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SmartBossApplication.class)
public class ProfileDaoTest {

    @Autowired
    ProfileDao profileDao;

    @Test
    public void testPersister() {
        Profile model = new Profile();
        model.setName("Tony的简历");
        model.setGender("m");
        model.setAge(36);
        model.setWorkYear(10);
        model.setPositionApplied("解决方案架构师");
        model.setEmail("tony@shinetechsoftware.com");
        model.setUniversity("西北大学");
        model.setWechat("18600699578");
        model.setPhone("18600699578");
        model.setDegree("==TEST==");
        model.setSkills("==TEST==");
        model.setProjectExperience("==TEST==");
        profileDao.save(model);
    }

    @Test
    public void testPagingQuery() {
        int pageIndex = 1;
        int pageSize = 10;
        Pageable pageable = PageRequest.of((pageIndex-1),pageSize);
        Page<Profile> page = profileDao.findAll(pageable);
        //Page<Profile> => PageImpl
    }

    @Test
    public void testPagingSortQuery(){
        int pageIndex=1;
        int pageSize=10;
        Pageable pageable = PageRequest.of((pageIndex-1),pageSize, Sort.by("CreateDate").ascending());
        Page<Profile> page = profileDao.findAll(pageable);
    }
}
