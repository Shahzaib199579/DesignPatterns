public class FirstFactory
{
    protected String type;

    public FirstFactory(String t) {
        type = t;
    }

    public Connection CreateConnection()
    {
        if (type.equals("Oracle")) {
            return new OracleConnection();
        }
        else if (type.equals("Sql Server"))
        {
            return new SqlServerConnection();
        }
        else
        {
            return new MySqlConnection();
        }
    }
}