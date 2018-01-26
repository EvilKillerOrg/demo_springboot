package com.ek.springboot.pojo;

import java.util.Date;

/*
 * 实现Serializable接口的作用是就是可以把对象存到字节流，
 * 然后可以恢复。所以你想如果你的对象没实现序列化怎么才能进行网络传输呢，
 * 要网络传输就得转为字节流，所以在分布式应用中，你就得实现序列化，
 * 如果你不需要分布式应用，那就没那个必要实现序列化。
 */
public class User implements java.io.Serializable {

  private static final long serialVersionUID = 1L;

  private Integer uuid;
  private String username;
  private int sex;
  private Date birthday;

  public Integer getUuid() {
    return uuid;
  }

  public void setUuid(Integer uuid) {
    this.uuid = uuid;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public int getSex() {
    return sex;
  }

  public void setSex(int sex) {
    this.sex = sex;
  }

  public Date getBirthday() {
    return birthday;
  }

  public void setBirthday(Date birthday) {
    this.birthday = birthday;
  }

}
