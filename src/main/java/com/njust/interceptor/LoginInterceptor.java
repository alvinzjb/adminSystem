package com.njust.interceptor;


import com.njust.pojo.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor{
   //此处采用操作前查看用户是否登录，如果没有进行登录，
  // 如果没有登录则跳转到登录页面进行登录，反之则可以进行下一步的操作
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //获取请求的url
       String  url =request.getRequestURI();
       //url:除了登录请求外，其他的url都进行拦截控制、
        if(url.indexOf("/login.action") >= 0){
            return true;//即只对login.action进行放行，其他的请求都需要拦截返回true表示进行放行
        }
        //获取session
        HttpSession session =request.getSession();
        User user = (User) session.getAttribute("user");//获得登录对象
        if(user!=null){
            return true;
        }
        //不符合条件给出提示信息，并转发到登录页面
        request.setAttribute("msg","您还没有登录，请先进行登录!");
        /*跳转到登录界面,因为是所有的都进行拦截所以一开始就会进入登录界面
        只需要在拦截器这里进行登录拦截并进行登录跳转就可以直接进入登录界面
        */
        request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request,response);
        return false;
    }


    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
