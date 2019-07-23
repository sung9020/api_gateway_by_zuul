package com.sung.gateway.router;

import org.springframework.cloud.netflix.zuul.filters.RefreshableRouteLocator;
import org.springframework.cloud.netflix.zuul.filters.SimpleRouteLocator;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;

/*
 *
 * @author 123msn
 * @since 2019-07-23
 */
public class DynamicRouteLocator extends SimpleRouteLocator implements RefreshableRouteLocator {



    public DynamicRouteLocator(String servletPath, ZuulProperties properties) {
        super(servletPath, properties);
    }

    @Override
    public void refresh() {
        doRefresh();
    }
}
