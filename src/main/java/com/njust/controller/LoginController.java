package com.njust.controller;

import com.njust.pojo.User;
import com.njust.service.LoginService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    //依赖注入,为什么找不到路径无法进行访问
    @Autowired
    private LoginService loginService;
    /**
     *用户登录,method 为post，默认不写为get方式
     */
    @RequestMapping(value="/login.action" )
    public String login(String userCode,String userPassword, HttpSession session, HttpServletRequest request){
        User user = loginService.login(userCode, userPassword);
        /*进行相应的判断，若user存在则表明用户存在即
         可进行登录，反之提醒用户名或密码错误
         */
        if(user==null){
            //表明用户不存在
            request.setAttribute("msg","用户名或密码不存在!");
            return "login";
        }
        //用户存在进行页面的跳转,e跳转到customer.jsp页面
        //将用户信息放入session域中
        session.setAttribute("user",user);
        //return "redirect:list.action" ;
        return "customer";
    }
    // method=RequestMethod.GET
    //进行用户的登出
    @RequestMapping(value= "/outlogin.action")
    public String outLogin(HttpSession session){
        //进行用户的登出，即使session无效即可
           session.invalidate();
           //重定向到用户登录界面
           return "redirect:login.action";
    }
   //这样也是可以的，注明属性method
    //@RequestMapping(value="/login.action" ,method = RequestMethod.GET)
       // public String  tologin(){
         //  return "login";
 // }



}
