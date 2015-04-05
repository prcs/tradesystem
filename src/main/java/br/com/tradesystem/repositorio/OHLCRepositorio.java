package br.com.tradesystem.repositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import br.com.tradesystem.modelo.OHLC;
import br.com.tradesystem.util.conexao.MongoConfigConexao;

@Service
@Configuration
@ComponentScan
@EnableAutoConfiguration
@ImportResource("classpath:SpringConfig.xml")
public class OHLCRepositorio {

	@Autowired
	MongoConfigConexao mongo;
	
	MongoOperations mongoOps;
	
	public OHLCRepositorio() {
		mongoOps = mongo.teste();
	}
	
	public void teste(){
		mongoOps.getCollection("ohlc");
	}

}
