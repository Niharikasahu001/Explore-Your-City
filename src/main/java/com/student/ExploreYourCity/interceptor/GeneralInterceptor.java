package com.student.ExploreYourCity.interceptor;

import com.student.ExploreYourCity.entities.User;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class GeneralInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("preHandle");
        User user = (User) request.getSession().getAttribute("current-user");
        if(user!=null)
        {
            return true;
        }
        else {
            response.getWriter().print("<h1>Please Login!!</h1>");
            response.sendRedirect("/signin");
            return false;
        }

    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

        if(ex!=null)
        {
            System.out.println("afterCompletion"+ex.getMessage());
        }
        System.out.println("afterCompletion");
    }
}
