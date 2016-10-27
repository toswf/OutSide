package com.toswf.controller;

import com.toswf.db.DBConnection;
import com.toswf.db.entities.UserEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.json.JSONArray;
import org.json.JSONException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.View;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

/**
 * Created by niuhao on 2016/10/26.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {
    @RequestMapping(value = "testGet.do")
    public String testGet(ModelMap map){
        Session session = DBConnection.getSession();
        List<UserEntity> users = session.createCriteria(UserEntity.class).list();
        map.addAttribute("users", users);
        session.close();
        return "users";
    }

    @RequestMapping(value = "testAdd.do")
    public String testAdd(HttpServletRequest request, HttpServletResponse response) throws JSONException, IOException {
        addUser();
        return null;
    }

    @RequestMapping(value = "register.do")
    public String registerUser(HttpServletRequest request, HttpServletResponse response) throws JSONException, IOException{
        return "";
    }

    private void addUser(){
        Session session = DBConnection.getSession();
        Transaction ta = session.beginTransaction();
        UserEntity ue = new UserEntity();
        ue.setAccount("testAccount");
        ue.setGuid(1L);
        ue.setNickname("toswf");
        ue.setSex("1");
        session.save(ue);
        ta.commit();
        session.close();
    }






}
