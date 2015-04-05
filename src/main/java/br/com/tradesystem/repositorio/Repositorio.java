package br.com.tradesystem.repositorio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import br.com.tradesystem.util.conexao.MongoConfigConexao;


public abstract class Repositorio<T> { 
	
	@Autowired 
	MongoConfigConexao mongo;
	
	MongoOperations mongoOps;
	
	public Repositorio() {
		mongoOps = mongo.teste();
	}

	public void salvar(T modelo){
		mongoOps.save(modelo);
	}
	
	public List<? extends Object> obter(T modelo, Query query){
		return mongoOps.find(query, modelo.getClass());
	}
	
	public List<? extends Object> obterLista(T modelo){
		return mongoOps.findAll(modelo.getClass());
	}
	
	public T obterUnico(T modelo, Query query){
		return (T) mongoOps.find(query, modelo.getClass());
	}

}
