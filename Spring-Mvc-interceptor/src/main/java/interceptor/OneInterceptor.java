package interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OneInterceptor implements HandlerInterceptor {
    //在目标方法之前执行
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("perHandle...");
        String param = request.getParameter("param");
        if ("yes".equals(param)){
            return true;
        }else {
            request.getRequestDispatcher("/erro.jsp").forward(request,response);
            return false;
        }
//        return true;//true代表放行，false代表不放行
    }
    //在目标方法执行之后。视图返回之前执行
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
       modelAndView.addObject("name","北京天安门");
        System.out.println("postHandle...");
    }
    //在流程都执行完毕之后执行
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("afterCompletion...");
    }
}
