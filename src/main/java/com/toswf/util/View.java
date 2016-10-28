package com.toswf.util;

import org.json.JSONException;
import org.json.JSONObject;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by niuhao on 2016/10/27.
 */
public class View {
    public static String showJson(HttpServletRequest request, HttpServletResponse response, JSONObject ret) throws IOException{
        if (ret == null){
            return null;
        }
        //todo by niuhao;
        return null;
    }

    public static String showJson(HttpServletResponse response, JSONObject ret) throws IOException{
        response.setHeader("Content-Type", "application/json;charset=UTF-8");
        response.getWriter().write(ret.toString());
        return null;
    }


}
