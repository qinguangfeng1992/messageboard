package com.qinguangfeng.web.servlet;

import com.qinguangfeng.entity.Userinfo;
import com.qinguangfeng.vo.MessageboardVo;
import com.qinguangfeng.web.logic.ImplMessage;
import com.qinguangfeng.web.logic.MessageBoardLogic;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Administrator on 2016/9/20.
 */
@WebServlet(name = "MyIndex", value = "/do/myindex")
public class MyIndex extends HttpServlet {

    private MessageBoardLogic messageBoardLogic = new ImplMessage();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Userinfo u = (Userinfo) request.getSession().getAttribute("username");

        System.out.println("123"+u);
        if (u != null) {

            Integer userid = u.getUserId();

            String p = request.getParameter("p");
            System.out.println("44444"+p);
            if (p == null) {
                p = "1";
            }
            List<MessageboardVo> list = messageBoardLogic.findMyMessage(userid, Integer.parseInt(p));
            System.out.println("77777"+list);
            for(MessageboardVo m:list){
                System.out.println("99999"+m.getSendUsername()+m);
            }
       /*  List<Messageboard> list =messageBoardLogic.findMyMessage(userid);*/

            request.setAttribute("list", list);

            request.setAttribute("currpage", p);

            request.setAttribute("totalPage",messageBoardLogic.getTotalCount(userid));
            request.getRequestDispatcher("../WEB-INF/views/index.jsp").forward(request, response);
//            request.getRequestDispatcher("WEB-INF/views/index.jsp").forward(request,response);
        }
    }
}
