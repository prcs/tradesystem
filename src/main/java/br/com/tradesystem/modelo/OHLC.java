package br.com.tradesystem.modelo;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ohlc")
public class OHLC {
	
	
	@Id
	private String id;
	
	Integer open;
	Integer high;
	Integer low;
	Integer close;
	Date date;
	Long volume;
	String quote;
	
	public OHLC(String id, Integer open, Integer high, Integer low,
			Integer close, Date date, Long volume, String quote) {
		super();
		this.id = id;
		this.open = open;
		this.high = high;
		this.low = low;
		this.close = close;
		this.date = date;
		this.volume = volume;
		this.quote = quote;
	}
	
	public OHLC(){};
	
	public String getQuote() {
		return quote;
	}
	public void setQuote(String quote) {
		this.quote = quote;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Long getVolume() {
		return volume;
	}
	public void setVolume(Long volume) {
		this.volume = volume;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getOpen() {
		return open;
	}
	public void setOpen(Integer open) {
		this.open = open;
	}
	public Integer getHigh() {
		return high;
	}
	public void setHigh(Integer high) {
		this.high = high;
	}
	public Integer getLow() {
		return low;
	}
	public void setLow(Integer low) {
		this.low = low;
	}
	public Integer getClose() {
		return close;
	}
	public void setClose(Integer close) {
		this.close = close;
	}

	
}
