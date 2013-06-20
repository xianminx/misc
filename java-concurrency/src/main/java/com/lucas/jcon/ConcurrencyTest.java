package com.lucas.jcon;

import java.util.*;
import java.lang.*;
public class ConcurrencyTest{
	public static void main(String[] args){
		final HashMap<String, String> map = new HashMap<String, String>(2);
		Thread t = new Thread(new Runnable() {
				@Override
				public void run() {
				for (int i = 0; i < 10000; i++) {
				new Thread(new Runnable() {
					@Override
					public void run() {
					String key = UUID.randomUUID().toString();
					map.put(key, "");
					System.out.println("puting key: "+ key);
					}
					}, "ftf" + i).start();
				}
				}
				}, "ftf");
		try{
			t.start();
			t.join();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
