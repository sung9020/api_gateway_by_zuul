package com.sung.gateway.repository;

import com.sung.gateway.router.RouteTable;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.Id;
import java.io.Serializable;
import java.util.Set;

/*
 *
 * @author 123msn
 * @since 2019-07-23
 */
public interface RouteRepository extends CrudRepository<RouteTable, String> {


}
