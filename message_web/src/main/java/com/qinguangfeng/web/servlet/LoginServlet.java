package com.qinguangfeng.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 2016/9/13.
 */
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //编码
        request.setCharacterEncoding("UTF-8");
        //取
        String  textname= request.getParameter("textname");
        String  password= request.getParameter("password");
        //调
        if("asdf".equals(textname)){
            request.getSession().setAttribute("name",textname);
            //转
            response.sendRedirect("do/index");
        }else {
            //转
            response.sendRedirect("../login.html");

        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            doPost(request,response);
    }
}
