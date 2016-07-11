package com.company.project.auth.handler;

import com.company.project.auth.user.CustomUserDetails;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 认证成功处理器
 *
 * @author wangzhj
 */
public class CustomSuccessHandler extends SavedRequestAwareAuthenticationSuccessHandler {

    private static final Logger logger = LoggerFactory.getLogger(CustomSuccessHandler.class);

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws ServletException, IOException {
        //获取认证信息
        UsernamePasswordAuthenticationToken token = (UsernamePasswordAuthenticationToken) authentication;
        CustomUserDetails userDetails = (CustomUserDetails) token.getPrincipal();


        //执行父逻辑
        super.onAuthenticationSuccess(request, response, authentication);
    }

}