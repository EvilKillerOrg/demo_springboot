package com.ek.springboot.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ek.springboot.pojo.User;
import com.ek.springboot.service.IUserService;

// @RestController注解是Restful风格的Controller
// 相当于同时使用了@Controller和@ResponseBody
@RestController
public class UserController {

  /* 需求: 返回基本类型的json格式数据 */
  @RequestMapping("hello")
  public String showHello() {
    return "Hello World Spring Boot!";
  }

  /* 需求: 返回pojo对象类型的json格式数据 */
  @RequestMapping("pojo")
  public User showPojo() {
    User user = new User();
    user.setUuid(1);
    user.setUsername("张三");
    user.setSex(1);
    return user;
  }

  /* 需求: 返回Map集合对象类型的json格式数据 */
  @RequestMapping("maps")
  public Map<String, Object> showMaps() {
    Map<String, Object> maps = new HashMap<String, Object>();
    maps.put("id", 1);
    maps.put("username", "张三");
    maps.put("age", 19);
    maps.put("birthday", new Date());
    maps.put("address", "家里蹲");
    return maps;
  }

  /* 需求: 返回List集合对象类型的json格式数据 */
  @RequestMapping("list")
  public List<User> showList() {
    List<User> uList = new ArrayList<User>();

    User user1 = new User();
    user1.setUuid(1);
    user1.setUsername("张三");
    user1.setSex(1);

    User user2 = new User();
    user2.setUuid(2);
    user2.setUsername("李四");
    user2.setSex(0);
    
    uList.add(user1);
    uList.add(user2);
    return uList;
  }
  
  /* 需求: 整合MyBatis查询数据库读取数据 */
  @Autowired
  private IUserService userService;
  @RequestMapping("mybatis")
  public List<User> findAll(){
    List<User> list = userService.findAll();
    return list;
  }
  
}
