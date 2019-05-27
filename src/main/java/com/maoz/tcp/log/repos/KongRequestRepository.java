package com.maoz.tcp.log.repos;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import com.maoz.tcp.log.entity.KongRequest;

@Repository
public interface KongRequestRepository extends CassandraRepository<KongRequest, String>{

}
