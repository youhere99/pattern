package com.bjsxt.proxy.dynamicProxy;

import java.lang.reflect.Proxy;

import com.bjsxt.proxy.staticProxy.Star;

public class Client {
	public static void main(String[] args) {
		
		RealStar realStar = new RealStar();
		StarHandler handler = new StarHandler(realStar);
		
		Star proxy = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), 
				new Class[]{Star.class}, handler);
		
		proxy.sing();
		
	}
	
}