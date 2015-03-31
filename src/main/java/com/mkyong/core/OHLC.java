package com.mkyong.core;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ohlc")
public class OHLC {
	
	@Id
	private String id;
	
	int open;
	int high;
	int low;
	int close;
	Date date;
	int volume;
	
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getOpen() {
		return open;
	}
	public void setOpen(int open) {
		this.open = open;
	}
	public int getHigh() {
		return high;
	}
	public void setHigh(int high) {
		this.high = high;
	}
	public int getLow() {
		return low;
	}
	public void setLow(int low) {
		this.low = low;
	}
	public int getClose() {
		return close;
	}
	public void setClose(int close) {
		this.close = close;
	}

	
}
