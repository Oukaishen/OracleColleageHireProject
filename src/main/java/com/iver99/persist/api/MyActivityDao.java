package com.iver99.persist.api;

import com.iver99.entity.MyActivity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by chehao on 2017/4/13 11:32.
 */
public interface MyActivityDao extends JpaRepository<MyActivity, Long> {
    @Query("select t from MyActivity t where t.user_id = ?1")
    public List<MyActivity> getActivitiesByUserId(Long userId);
}
