package com.shinetech.smartboss.dao;

import com.shinetech.smartboss.model.Profile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileDao extends PagingAndSortingRepository<Profile,String> {

}
