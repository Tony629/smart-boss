package com.shinetech.smartboss.dao;

import com.shinetech.smartboss.model.Profile;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class ProfileDaoTest {

    @Autowired
    ProfileDao profileDao;

    @Test
    public void testPersister(){
        Profile model = new Profile();
        model.setName("Tony的简历");
        model.setGender("m");
        model.setAge(36);
        model.setWorkYear(10);
        model.setPositionApplied("解决方案架构师");
        model.setEmail("tony@shinetechsoftware.com");
        model.setUniversity("西北大学");
        profileDao.save(model);
    }

}
