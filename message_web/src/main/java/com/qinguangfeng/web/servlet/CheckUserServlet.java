package com.qinguangfeng.web.servlet;

import com.qinguangfeng.entity.Userinfo;
import com.qinguangfeng.web.logic.ImplUser;
import com.qinguangfeng.web.logic.UserLogic;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 2016/9/20.
 */
@WebServlet(name = "CheckUserServlet",value ="/login")
public class CheckUserServlet extends HttpServlet {
    private UserLogic userLogic=new ImplUser();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("处理登录");
        //编码
        request.setCharacterEncoding("UTF-8");
        //取
        String  textname= request.getParameter("textname");
        String  password= request.getParameter("password");
        Userinfo u=userLogic.login(textname, password);
        if(u!=null){
            System.out.println(textname+u);
            request.getSession().setAttribute("username",u);
           /* response.sendRedirect("do/view/?p=index");*/
            response.sendRedirect("do/myindex");

        }else {

            response.sendRedirect("login.html");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        doPost(request,response);
    }


}
