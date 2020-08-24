package com.dashboard.dao;

import com.dashboard.model.LogModelToElastic;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ElasticRepository  extends ElasticsearchRepository<LogModelToElastic, Long> {
}
