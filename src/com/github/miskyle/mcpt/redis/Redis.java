package com.github.miskyle.mcpt.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class Redis {
	private static JedisPool jedisPool = null;
	public static void initialize(String host, int port, boolean ssl) {
		jedisPool = new JedisPool(new JedisPoolConfig(),host, port, ssl);
	}
	public static void initialize(String host, int port) {
		jedisPool = new JedisPool(new JedisPoolConfig(),host, port);
	}
	public static void initialize(String host) {
		jedisPool = new JedisPool(new JedisPoolConfig(),host);
	}
	
	
	
	public static boolean isAvaluable() {
		return jedisPool != null;
	}
}
