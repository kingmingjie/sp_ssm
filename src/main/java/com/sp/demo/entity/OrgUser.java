package com.sp.demo.entity;


public class OrgUser {

  private String id;
  private String nickname;
  private String loginname;
  private String pwd;
  private String state;
  private String failedcount;
  private String orgid;
  private String desc;
  private java.sql.Timestamp createtime;
  private java.sql.Timestamp updatetime;
  private String createman;
  private String updateman;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }


  public String getLoginname() {
    return loginname;
  }

  public void setLoginname(String loginname) {
    this.loginname = loginname;
  }


  public String getPwd() {
    return pwd;
  }

  public void setPwd(String pwd) {
    this.pwd = pwd;
  }


  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  public String getFailedcount() {
    return failedcount;
  }

  public void setFailedcount(String failedcount) {
    this.failedcount = failedcount;
  }


  public String getOrgid() {
    return orgid;
  }

  public void setOrgid(String orgid) {
    this.orgid = orgid;
  }


  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }


  public java.sql.Timestamp getCreatetime() {
    return createtime;
  }

  public void setCreatetime(java.sql.Timestamp createtime) {
    this.createtime = createtime;
  }


  public java.sql.Timestamp getUpdatetime() {
    return updatetime;
  }

  public void setUpdatetime(java.sql.Timestamp updatetime) {
    this.updatetime = updatetime;
  }


  public String getCreateman() {
    return createman;
  }

  public void setCreateman(String createman) {
    this.createman = createman;
  }


  public String getUpdateman() {
    return updateman;
  }

  public void setUpdateman(String updateman) {
    this.updateman = updateman;
  }

}
