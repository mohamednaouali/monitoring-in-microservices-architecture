package com.dashboard.dao;

import com.dashboard.model.UserDetailsToElastic;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;



public interface UserTraceRepository extends ElasticsearchRepository<UserDetailsToElastic, Long> {
}
