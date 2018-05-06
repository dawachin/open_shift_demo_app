package com.example.open_shift_demo_app.app.logging;


import org.slf4j.MDC;

import javax.servlet.*;
import java.io.IOException;


public class LoggingFilter implements Filter {
    @Override
    public void init(FilterConfig config) throws ServletException {
        System.out.println("servlet filter #init 通ったよ");
    }

    @Override
    public void destroy(){
        System.out.println("servlet filter #destroy通ったよ");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException,
            ServletException {

        System.out.println("servlet filter #doFilter通ったよ");

        try {
            chain.doFilter(request, response);
        } finally {
            MDC.remove("log_file_path");
        }
    }
}
