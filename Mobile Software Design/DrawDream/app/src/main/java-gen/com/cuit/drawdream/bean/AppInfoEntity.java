package com.cuit.drawdream.bean;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table APP_INFO_ENTITY.
 */
public class AppInfoEntity {

    private Long id;
    /** Not-null value. */
    private String app_id;
    /** Not-null value. */
    private String version;
    /** Not-null value. */
    private String type;
    private String page_url;
    /** Not-null value. */
    private String ui_type;
    private String logo;

    public AppInfoEntity() {
    }

    public AppInfoEntity(Long id) {
        this.id = id;
    }

    public AppInfoEntity(Long id, String app_id, String version, String type, String page_url, String ui_type, String logo) {
        this.id = id;
        this.app_id = app_id;
        this.version = version;
        this.type = type;
        this.page_url = page_url;
        this.ui_type = ui_type;
        this.logo = logo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /** Not-null value. */
    public String getApp_id() {
        return app_id;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setApp_id(String app_id) {
        this.app_id = app_id;
    }

    /** Not-null value. */
    public String getVersion() {
        return version;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setVersion(String version) {
        this.version = version;
    }

    /** Not-null value. */
    public String getType() {
        return type;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setType(String type) {
        this.type = type;
    }

    public String getPage_url() {
        return page_url;
    }

    public void setPage_url(String page_url) {
        this.page_url = page_url;
    }

    /** Not-null value. */
    public String getUi_type() {
        return ui_type;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setUi_type(String ui_type) {
        this.ui_type = ui_type;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

}
