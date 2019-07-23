package com.sung.gateway.router;

import com.sung.gateway.config.RedisRepositoryConfig;
import com.sung.gateway.repository.RouteRepository;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.util.Assert;

import java.util.List;

/*
 *
 * @author 123msn
 * @since 2019-07-23
 */
public class ZuulRouteStore {

    private final RouteRepository routeRepository;

    public ZuulRouteStore(RouteRepository routeRepository, String table) {
        Assert.notNull(routeRepository, "Parameter 'routeRepository' can not be null.");
        this.routeRepository = routeRepository;
    }

    public List<ZuulProperties.ZuulRoute> findAll(){



        return null;
    }
}
