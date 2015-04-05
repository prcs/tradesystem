package br.com.tradesystem.util.conexao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.stereotype.Component;

import com.mongodb.MongoClient;

@Configuration
public class MongoConfigConexao {

	
		public @Bean
		MongoDbFactory mongoDbFactory() throws Exception {
			return new SimpleMongoDbFactory(new MongoClient(), "TRADE");
		}
	 
		public @Bean
		MongoTemplate mongoTemplate() throws Exception {
	 
			MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory());
	 
			return mongoTemplate;
	 
		}
		
		public MongoOperations teste (){
			ApplicationContext ctx = new AnnotationConfigApplicationContext(MongoConfigConexao.class);
			MongoOperations mongoOperation = (MongoOperations) ctx.getBean("mongoTemplate");
			return mongoOperation;
		}
	 
	}

