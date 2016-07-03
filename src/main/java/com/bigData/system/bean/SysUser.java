package com.bigData.system.bean;

public class SysUser {
    /**
     *  用户id, sys_user.User_ID
     */
    private String userId;

    /**
     *  用户名称, sys_user.User_Name
     */
    private String userName;

    /**
     *  密码, sys_user.password
     */
    private String password;

    /**
     *  最后登陆日期, sys_user.Last_Sign_DATE
     */
    private String lastSignDate;

    /**
     *  最后登陆时间, sys_user.Last_Sign_Time
     */
    private String lastSignTime;

    /**
     *  用户登陆状态标记, sys_user.sign_state
     */
    private String signState;

    /**
     *  创建日期, sys_user.create_date
     */
    private String createDate;

    /**
     *  创建时间, sys_user.create_time
     */
    private String createTime;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getLastSignDate() {
        return lastSignDate;
    }

    public void setLastSignDate(String lastSignDate) {
        this.lastSignDate = lastSignDate == null ? null : lastSignDate.trim();
    }

    public String getLastSignTime() {
        return lastSignTime;
    }

    public void setLastSignTime(String lastSignTime) {
        this.lastSignTime = lastSignTime == null ? null : lastSignTime.trim();
    }

    public String getSignState() {
        return signState;
    }

    public void setSignState(String signState) {
        this.signState = signState == null ? null : signState.trim();
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate == null ? null : createDate.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }
}