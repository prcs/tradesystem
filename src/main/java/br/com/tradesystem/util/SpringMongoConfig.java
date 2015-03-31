package br.com.tradesystem.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;

@Configuration
public class SpringMongoConfig extends AbstractMongoConfiguration {

	final static String DB = "TRADESYSTEM";
	@Override
	public String getDatabaseName() {
		return DB;
	}

	@Override
	@Bean
	public Mongo mongo() throws Exception {
		return new MongoClient("127.0.0.1");
	}
}