import java.sql.Connection;
import java.sql.ResultSet;

public interface IJDBCHelper {
	/**
	 * ��ȡ����
	 * 
	 * @return
	 */
	public abstract Connection getConnection(LinkEntity entity);

	/**
	 * ��ȡ�����
	 * @return
	 */
	public abstract ResultSet getResultSet(Connection connection,String sqlString);
}
