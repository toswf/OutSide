package com.toswf.rpc;

import com.googlecode.jsonrpc4j.JsonRpcServer;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by niuhao on 2016/10/28.
 */
public class RpcServlet extends HttpServlet {
    private JsonRpcServer server;
    @Override
    public void init(ServletConfig config ) throws ServletException{
        super.init(config);
        server = new JsonRpcServer(new ServerChannel(), ServerChannel.class);
    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        server.handle(request, response);
    }


}
