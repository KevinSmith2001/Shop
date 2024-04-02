package com.example.shop.interceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
    @Component

    public class Interceptor2 implements HandlerInterceptor {
        @Override
        public boolean preHandle(HttpServletRequest request,
                                 HttpServletResponse response, Object handler) throws Exception{
            System.out.println("Interceptor2======before execution");
            String userName=request.getParameter("userName");
            String passWord=request.getParameter("passWord");
            if(userName != null && userName.equals("Kevin")
            && passWord != null && passWord.equals("123")){
                return true;
            }
            response.sendRedirect("/loginFailed");
            return  false;
        }
        @Override
        public void postHandle(HttpServletRequest request,
                               HttpServletResponse response,Object handler,
                               ModelAndView modelAndView) throws Exception{
            System.out.println("Interceptor2======execution");
        }
        @Override
        public void afterCompletion(HttpServletRequest request,
                                    HttpServletResponse response,Object handler,
                                    Exception ex) throws Exception{
            System.out.println("Interceptor2======after execution");
        }
    }
