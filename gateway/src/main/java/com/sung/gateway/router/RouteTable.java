package com.sung.gateway.router;

import lombok.Getter;
import org.springframework.data.redis.core.RedisHash;

import javax.persistence.Id;
import java.io.Serializable;
import java.util.Set;

/*
 *
 * @author 123msn
 * @since 2019-07-23
 */
@Getter
@RedisHash("route_table")
public class RouteTable implements Serializable {

    @Id
    private String id;

    private String path;
    private String serviceId;
    private String url;
    private boolean stripPrefix;
    private boolean retryable;
    private Set<String> sensitive_headers;

}
