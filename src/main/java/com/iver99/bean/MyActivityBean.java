package com.iver99.bean;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.iver99.util.CustomDateSerializer;

import java.util.Date;

/**
 * Created by chehao on 2017/4/13 11:31.
 */
public class MyActivityBean {
    private Long id;
    private Long activity_id;
    private Long user_id;
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date register_time;
    private Integer status;
    private String activity_rating;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getActivity_id() {
        return activity_id;
    }

    public void setActivity_id(Long activity_id) {
        this.activity_id = activity_id;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public Date getRegister_time() {
        return register_time;
    }

    public void setRegister_time(Date register_time) {
        this.register_time = register_time;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getActivity_rating() {
        return activity_rating;
    }

    public void setActivity_rating(String activity_rating) {
        this.activity_rating = activity_rating;
    }
}
