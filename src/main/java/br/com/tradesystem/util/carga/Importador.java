package br.com.tradesystem.util.carga;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Importador {
		
	public static void main(String[] args) {
		 
		try (BufferedReader br = new BufferedReader(new FileReader("H:\\Historico Bovespa\\DemoCotacoesHistoricas12022003.txt")))
		{
 
			String sCurrentLine;
 
			while ((sCurrentLine = br.readLine()) != null) {
				
				System.out.println(sCurrentLine.substring(2, 9));
			}
 
		} catch (IOException e) {
			e.printStackTrace();
		} 
 
	}

}
