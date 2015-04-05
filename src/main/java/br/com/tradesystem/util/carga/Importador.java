package br.com.tradesystem.util.carga;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.mongodb.core.MongoOperations;

import br.com.tradesystem.repositorio.OHLCRepositorio;
import br.com.tradesystem.util.conexao.MongoConfigConexao;

@SpringBootApplication
@Configuration
@ComponentScan
@EnableAutoConfiguration
@ImportResource("classpath:SpringConfig.xml")
public class Importador implements CommandLineRunner {
		
	
	@Autowired 
	OHLCRepositorio repo;	
	
	
	public static void main(String[] args) {
		
		SpringApplication.run(Importador.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		 
		repo.teste();
		
		
			
	}

}
