package com.qinguangfeng.web.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 2016/9/13.
 */
public class EncodingFilter implements javax.servlet.Filter {
    public void destroy() {
        System.out.println("软件生命周期的第三个阶段，服务器宕机或者重启关闭的时候调用！");
    }

    public void doFilter(javax.servlet.ServletRequest req, javax.servlet.ServletResponse resp, javax.servlet.FilterChain chain) throws javax.servlet.ServletException, IOException {
        //强转 让父类可以用子类的方法
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;

        //编码格式
        request.setCharacterEncoding("UTF-8");
        System.out.println("拦截一次！");
        Object o = request.getSession().getAttribute("username");

        if (o == null) {
            response.sendRedirect(request.getContextPath()+"/login.html");
            return;
        }

        chain.doFilter(req, resp);
    }

    public void init(javax.servlet.FilterConfig config) throws javax.servlet.ServletException {
        System.out.println("初始化！");
    }

}
