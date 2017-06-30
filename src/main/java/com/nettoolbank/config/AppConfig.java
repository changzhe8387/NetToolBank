package com.nettoolbank.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.sql.DataSource;

import org.seasar.doma.SingletonConfig;
import org.seasar.doma.jdbc.Config;
import org.seasar.doma.jdbc.UnknownColumnHandler;
import org.seasar.doma.jdbc.dialect.Dialect;
import org.seasar.doma.jdbc.dialect.PostgresDialect;
import org.seasar.doma.jdbc.entity.EntityType;
import org.seasar.doma.jdbc.query.Query;
import org.seasar.doma.jdbc.tx.LocalTransactionDataSource;
import org.seasar.doma.jdbc.tx.LocalTransactionManager;
import org.seasar.doma.jdbc.tx.TransactionManager;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SingletonConfig
public class AppConfig implements Config {
	private static final AppConfig CONFIG = new AppConfig();

	  private final Dialect dialect;

	  private LocalTransactionDataSource dataSource;

	  private TransactionManager transactionManager;

	  private String dataSourceUrl;

	  private String username;

	  private String password;

	  private String driverClassName;

	  private String maxActive;

	  private String maxIdle;

	  private String minIdle;

	  private String initialSize;

	  private DataSource ds;

	  private AppConfig() {
	    Properties properties = new Properties();
	    Resource resource = new ClassPathResource("application.properties");

	    try {
	      File dbAsFile = resource.getFile();

	      InputStream inputStream = new FileInputStream(dbAsFile.getAbsolutePath());
	      properties.load(inputStream);

	      dataSourceUrl = properties.getProperty("spring.datasource.url");
	      username = properties.getProperty("spring.datasource.username");
	      password = properties.getProperty("spring.datasource.password");
	      driverClassName = properties.getProperty("spring.datasource.driverClassName");

	    } catch (IOException e) {
	      // TODO 自動生成された catch ブロック
	      e.printStackTrace();
	    }

	    dataSource = new LocalTransactionDataSource(dataSourceUrl,username,password);

	    dialect = new PostgresDialect();
	    transactionManager = new LocalTransactionManager(dataSource.getLocalTransaction(getJdbcLogger()));
	  }

	  @Override
	  public UnknownColumnHandler getUnknownColumnHandler() {
	    return new UnknownColumnHandler() {
	      @Override
	      public void handle(Query query, EntityType<?> entityType, String unknownColumnName) {
	      }
	    };
	  }

	  @Override
	  public Dialect getDialect() {
	    return dialect;
	  }

	  @Override
	  public DataSource getDataSource() {
	    return dataSource;
	  }

	  @Override
	  public TransactionManager getTransactionManager() {
	    return transactionManager;
	  }

	  public static AppConfig singleton() {
	    return CONFIG;
	  }
	}
