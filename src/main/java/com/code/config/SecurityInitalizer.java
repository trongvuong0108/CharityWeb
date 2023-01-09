package com.code.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

@Configuration
public abstract class SecurityInitalizer extends AbstractSecurityWebApplicationInitializer {

}
