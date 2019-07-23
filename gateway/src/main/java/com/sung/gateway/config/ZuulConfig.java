package com.sung.gateway.config;

import com.sung.gateway.repository.RouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.ZuulProxyAutoConfiguration;
import org.springframework.context.annotation.Configuration;

/*
 *
 * @author 123msn
 * @since 2019-07-23
 */
@EnableZuulProxy
@Configuration
public class ZuulConfig extends ZuulProxyAutoConfiguration {

    @Autowired
    RouteRepository routeRepostroy;



}
