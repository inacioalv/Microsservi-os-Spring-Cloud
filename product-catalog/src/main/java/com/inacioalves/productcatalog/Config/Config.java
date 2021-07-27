package com.inacioalves.productcatalog.Config;

import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.RestClients;
import org.springframework.data.elasticsearch.config.AbstractElasticsearchConfiguration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@Configuration
@EnableElasticsearchRepositories(basePackages = "com.inacioalves.productcatalog.Repository")
public class Config extends AbstractElasticsearchConfiguration {
	
	 	@Bean
	    public RestHighLevelClient elasticsearchClient() {
	        ClientConfiguration clientConfiguration 
	            = ClientConfiguration.builder()
	                .connectedTo("localhost:9200","localhost:9300")
	                .build();

	        return RestClients.create(clientConfiguration).rest();
	    }
	 	
	 	

}
