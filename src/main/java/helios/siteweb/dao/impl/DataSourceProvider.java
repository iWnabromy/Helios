package helios.siteweb.dao.impl;

import javax.sql.DataSource;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class DataSourceProvider {

	private static MysqlDataSource dataSource;

	public static DataSource getDataSource() {
		if (dataSource == null) {
			dataSource = new MysqlDataSource();
			dataSource.setServerName("127.8.216.130");
			dataSource.setPort(3306);
			dataSource.setDatabaseName("helios");
			dataSource.setUser("adminbrlbt5Z");
			dataSource.setPassword("n3WC63-uyghR");
		}
		return dataSource;
	}
}
