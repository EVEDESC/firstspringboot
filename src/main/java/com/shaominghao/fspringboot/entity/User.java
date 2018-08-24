package com.shaominghao.fspringboot.entity;
/**
* @Description:    实体
* @Author:         ShaoMingHao
* @CreateDate:     2018/8/24 12:16
* @UpdateUser:     ShaoMingHao
* @UpdateDate:     2018/8/24 12:16
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class User {
    private String id;
    private String userId;
    private String pwd;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
