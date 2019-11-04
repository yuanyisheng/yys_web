package com.yys.web.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
public class MybatisConfig {

    @Value("database.basePackage")
    private String basePackage;
    @Value("database.driverClassName")
    private String driveClassName;
    @Value("database.url")
    private String url;
    @Value("database.username")
    private String userName;
    @Value("database.password")
    private String passWord;

    public DataSource dataSource() {
        Properties properties = new Properties();
        properties.put("driverClassName", driveClassName);
        properties.put("url", url);
        properties.put("username", userName);
        properties.put("password", passWord);
        properties.put("connectionInitSqls", "set names utf8mb4;");
        properties.put("filters", "stat,wall");
//        return DruidDataSourceFactory;
        return null;
    }

}
