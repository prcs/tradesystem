package br.com.tradesystem.util.carga;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import br.com.tradesystem.modelo.OHLC;

public class Fatiador {

	public OHLC recuperaCandle(String linha) throws ParseException{
		
		String data = linha.substring(2,10);
		String nomePapel = linha.substring(12,24);
		String abertura = linha.substring(56,69);
		String maximo = linha.substring(69,82);
		String minimo = linha.substring(82,95);
		String fechamento = linha.substring(95,108);
		String volume = linha.substring(170,188);
		
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
		OHLC candle = new OHLC();
		
		
		candle.setDate(format.parse(data));
		candle.setOpen(Integer.parseInt(abertura));
		candle.setHigh(Integer.parseInt(maximo));
		candle.setLow(Integer.parseInt(minimo));
		candle.setClose(Integer.parseInt(fechamento));
		candle.setVolume(Long.parseLong(volume));
		candle.setQuote(nomePapel);
		
		return candle;
	}
}
