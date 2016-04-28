package helios.siteweb.dao.impl;

import javax.sql.DataSource;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class DataSourceProviderTest {

	private static MysqlDataSource dataSource;

	public static DataSource getDataSource() {
		if (dataSource == null) {
			dataSource = new MysqlDataSource();
			dataSource.setServerName("localhost");
			dataSource.setPort(3306);
			dataSource.setDatabaseName("helios_test");
			dataSource.setUser("root");
			dataSource.setPassword("");
		}
		return dataSource;
	}
}
