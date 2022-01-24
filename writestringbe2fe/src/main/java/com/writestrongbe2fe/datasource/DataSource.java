//package com.writestrongbe2fe.datasource;
//
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class DataSource{
//	
//	@Bean
//	public DataSource getDatsource() {
//	    DataSource dataSourceBuilder =  new DataSource();
//		dataSourceBuilder.setDriverClassName("org.oracle.Driver");
//		dataSourceBuilder.setUrl("jdbc:oracle:1521:ex");
//		dataSourceBuilder.username("System");
//		dataSourceBuilder.password("admin");
//	    return (DataSource) dataSourceBuilder.build();
//	}
//	
//	
//}