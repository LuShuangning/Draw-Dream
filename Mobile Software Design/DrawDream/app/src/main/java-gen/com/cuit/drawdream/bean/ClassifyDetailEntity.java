package com.cuit.drawdream.bean;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table CLASSIFY_DETAIL_ENTITY.
 */
public class ClassifyDetailEntity {

    private Long id;
    /** Not-null value. */
    private String classify_name;
    /** Not-null value. */
    private String classify_img;

    public ClassifyDetailEntity() {
    }

    public ClassifyDetailEntity(Long id) {
        this.id = id;
    }

    public ClassifyDetailEntity(Long id, String classify_name, String classify_img) {
        this.id = id;
        this.classify_name = classify_name;
        this.classify_img = classify_img;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /** Not-null value. */
    public String getClassify_name() {
        return classify_name;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setClassify_name(String classify_name) {
        this.classify_name = classify_name;
    }

    /** Not-null value. */
    public String getClassify_img() {
        return classify_img;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setClassify_img(String classify_img) {
        this.classify_img = classify_img;
    }

}
