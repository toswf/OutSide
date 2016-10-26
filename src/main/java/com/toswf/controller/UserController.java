package com.toswf.controller;

import com.toswf.db.DBConnection;
import com.toswf.db.entities.UserEntity;
import org.hibernate.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by niuhao on 2016/10/26.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {
    @RequestMapping(value = "test.do")
    public String test(ModelMap map){
        Session session = DBConnection.getSession();
        List<UserEntity> users = session.createCriteria(UserEntity.class).list();
        map.addAttribute("users", users);
        session.close();
        return "users";
    }
}
