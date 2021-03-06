package com.cuit.drawdream.bean;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 

import com.cuit.drawdream.drawdream.bean.BaseBean;

/**
 * Entity mapped to table USER_INFO_ENTITY.
 */
public class UserInfoEntity extends BaseBean{

    private Long id;
    /** Not-null value. */
    private String user_name;
    /** Not-null value. */
    private String user_id;
    /** Not-null value. */
    private String user_gender;
    /** Not-null value. */
    private String user_phone;
    /** Not-null value. */
    private String user_email;
    private String user_sign;

    public UserInfoEntity() {
    }

    public UserInfoEntity(Long id) {
        this.id = id;
    }

    public UserInfoEntity(Long id, String user_name, String user_id, String user_gender, String user_phone, String user_email, String user_sign) {
        this.id = id;
        this.user_name = user_name;
        this.user_id = user_id;
        this.user_gender = user_gender;
        this.user_phone = user_phone;
        this.user_email = user_email;
        this.user_sign = user_sign;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /** Not-null value. */
    public String getUser_name() {
        return user_name;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    /** Not-null value. */
    public String getUser_id() {
        return user_id;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    /** Not-null value. */
    public String getUser_gender() {
        return user_gender;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setUser_gander(String user_gender) {
        this.user_gender = user_gender;
    }

    /** Not-null value. */
    public String getUser_phone() {
        return user_phone;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }

    /** Not-null value. */
    public String getUser_email() {
        return user_email;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getUser_sign() {
        return user_sign;
    }

    public void setUser_sign(String user_sign) {
        this.user_sign = user_sign;
    }

}
